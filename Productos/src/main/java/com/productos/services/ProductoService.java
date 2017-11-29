package com.productos.services;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productos.bd.AmazonBD;
import com.productos.integracion.mahalo.dto.Query;
import com.productos.integracion.mahalo.dto.Row;
import com.productos.model.Paquete;
import com.productos.model.Producto;
import com.productos.model.Talla;
import com.productos.util.FileUtil;

@Service
public class ProductoService {
	
	@Autowired
	private IntegracionService integracionService;
	
	@Autowired
	private  AmazonBD repository;
	
	@Autowired
	private MailService mailService;
	
	private static Map<String,String> almacenes = new HashMap<>();
	
	static {
		
		almacenes.put("3", "PALACIO");
		almacenes.put("4", "GIRARDOTA");
		almacenes.put("5", "SAN DIEGO");
		almacenes.put("8", "HOLLYWOOD");
		almacenes.put("9", "MAYORCA");
		almacenes.put("10", "PUERTA NORTE");
		almacenes.put("11", "IBAGUE");
		almacenes.put("12", "MOLINOS");
		almacenes.put("13", "PREMIUM");
		almacenes.put("14", "FLORIDA");
		almacenes.put("15", "WEB");
		almacenes.put("16", "FACTURACION");
		almacenes.put("100", "VIRTUAL");
		almacenes.put("18", "SANTA FE");
	}
	
	public void guardarProductosProcess(){
		
//		Query query = integracionService.consultarCreacionProductoMasivo();
//		
//		System.out.println("# Productos recuperados -> "+query.getSelect().getRows().size());
//		
//		query.getSelect().getRows().stream()
//				.distinct()
//				.filter(Objects::nonNull)
//				.map(this::buildProducto)
//				.filter(Objects::nonNull)
//				.forEach(p->{
//					repository.save(p);
//				});
	}
	
	public void guardarProductosDiarios(){
		
		Query query = integracionService.consultarCreacionProductoMasivo(LocalDate.now(),LocalDate.now());
		
		query.getSelect().getRows().parallelStream()
				.distinct()
				.filter(Objects::nonNull)
				.map(this::buildProducto)
				.filter(Objects::nonNull)
				.forEach(p->{
					repository.save(p);
				});
	}
	
	public List<Producto> recuperarProductosxFiltro(String linea,String marca,LocalDate desde, LocalDate hasta,String almacen,String genero){
		
		Predicate<Row> compositePredicate =
	            getAllPredicates(marca, linea, genero).stream()
	                         .reduce(w -> true, Predicate::and);
		
		return integracionService.consultarCreacionProductoMasivo(desde,hasta).getSelect().getRows()
					.parallelStream()
					.distinct()
					.filter(compositePredicate)
					.map(this::buildProducto)
					.map(p-> {
						return this.buildSaldoProducto(p, almacen);
					})	
					.filter(Objects::nonNull)
					.collect(Collectors.toList());
	}
	
	public List<Producto> recuperarProductosByLinea(String linea){
		return repository.selectProductByLinea(linea).stream()
				.filter(Objects::nonNull)
				.collect(Collectors.toList());
	}
	
	public Producto getDetailsByID(String referencia){
		
		Producto producto = new Producto();
		producto.setReferenciaProov(referencia);
		producto = buildSaldoProducto (producto,null);
		buildDetails(producto);
		return producto;
	}
	
	private void buildDetails(Producto producto) {
		
		Query detallesXSKU = integracionService.consultarDetallesXSKU(producto.getSku());
		
		if(detallesXSKU != null && detallesXSKU.getSelect() != null && !detallesXSKU.getSelect().getRows().isEmpty()) {
			Row row = detallesXSKU.getSelect().getRows().get(0);
			producto.setMarca(row.getMarca());
			producto.setGenero(row.getCategoria());
			producto.setLinea(row.getLinea());
			producto.setPrecio(row.getPrecio());
		}

	}

	public Producto buildProducto(Row row){
		
		Producto producto = new Producto();
				
		producto.setDescripcion(row.getDescripcion());
		producto.setMarca(row.getMarca());
		producto.setGenero(row.getCategoria());
		producto.setLinea(row.getLinea());
		producto.setReferenciaProov(row.getReferenciaprov());	
		producto.setFecreacion(row.getFecreacion());
		producto.setPrecio(row.getPrecio());
		
		return producto;
	}
	
	public Producto buildSaldoProducto(Producto producto,String almacen){
		
		Query querySaldoxReferencia = integracionService.consultarDetallexReferenciaProovedor(producto.getReferenciaProov(),almacen);
		
		if(querySaldoxReferencia != null){
			List<Row> rows = querySaldoxReferencia.getSelect().getRows().stream()
				.filter(Objects::nonNull)
				.filter(r ->	r.getSaldo() != null && r.getSaldo() > 0 &&  r.getTalla() != null && r.getAlmacen() != null)
				.collect(Collectors.toList());
		
			if(!rows.isEmpty()){
			
				Integer count = rows.stream().collect(Collectors.summingInt(Row::getSaldo));
				Map<String, Integer> countTotalByTalla = rows.stream().collect(Collectors.groupingBy(Row::getTalla, Collectors.summingInt(Row::getSaldo)));						
				List<Talla> tallas = countTotalByTalla.entrySet().stream()
						.map(e -> new Talla(e.getKey(), e.getValue())).collect(Collectors.toList());
				
				if(tallas.isEmpty() || count <=6){
					producto = null;
				}else{
					
					Map<String, Integer> almacenes = rows.stream().collect(Collectors.groupingBy(Row::getAlmacen, Collectors.summingInt(Row::getSaldo)));
					List<String> company = almacenes.entrySet().stream().map(k-> this.getAlmacenesFromMap(k)).collect(Collectors.toList());
//					 almacenes.entrySet().stream().map((k,v)-> k.).collect(Collectors.toList());
					
					
					
					
					
					producto.setTallas(tallas);
					producto.setAlmacenes(company);
					Producto productBD = repository.geyByID(producto.getReferenciaProov());
					producto.setEstado(productBD == null ? null :productBD.getEstado());
					producto.setPreciocompra(productBD == null ? null :productBD.getPreciocompra());
					producto.setUnidades(tallas.stream().mapToInt(Talla::getCantidad).sum());
					
					if(producto.getDescripcion() == null){
						
						Row row = querySaldoxReferencia.getSelect().getRows().get(0);
						producto.setSku(row.getSku());
						producto.setDescripcion(row.getDescripcion());
						producto.setMarca(productBD == null ? null : productBD.getMarca());
						producto.setGenero(productBD == null ? null : productBD.getGenero());
						producto.setLinea(productBD == null ? null : productBD.getLinea());
						producto.setReferenciaProov(row.getReferenciaprov());	
						producto.setFecreacion(row.getFecreacion());
						producto.setPrecio(productBD == null ? null : productBD.getPrecio());
					}
				}
			}else{
				producto = null;
			}
		}else{
			producto = null;
		}
		
		return producto;
	}
	
	private String getAlmacenesFromMap(Entry<String, Integer> k) {
		return almacenes.get(k.getKey()).concat(" - ").concat(k.getValue().toString());
	}

	public static List<Predicate<Row>> getAllPredicates(String marca, String linea, String genero){
		 return Arrays.asList(
				 r -> marca == null || marca.isEmpty() ? true : r.getMarca().equals(marca),
				 r -> linea == null || linea.isEmpty() ? true : r.getLinea().equals(linea),
				 r -> genero == null || genero.isEmpty() ? true :  r.getCategoria().equals(genero));
	}

	public void actualizarProducto(Producto producto) {
		Producto producto2 = repository.geyByID(producto.getReferenciaProov());
		
		if(producto2.getId() == null && producto.getId() != null) {
			List<String> list = FileUtil.readfile("mail.txt");
			mailService.send(list.get(2),"Producto Publicado",getBodyMailProductoPublicado(producto));
		}
		repository.save(producto);
	}

	public void habilitarPaqueteProductos(List<Producto> productos) {
		
		Integer consecutivo = repository.getMaxId();
		
		List<String> list = FileUtil.readfile("mail.txt");
		mailService.send(list.get(0),"Precio productos por asignar",getBodyMailProductosPorAsignar(consecutivo));
		
		productos.forEach(p->{
			p.setConsecutivo(consecutivo);
			repository.save(p);
		});
		
		Paquete paquete = new Paquete();
		paquete.setConsecutivo(consecutivo);
		paquete.setFecha(new Date());
		
		repository.save(paquete);
	}

	public List<Producto> recuperarProductosPorEstado(String estado) {
		return repository.selectProductByEstado(estado);
	}
	
	public List<Paquete> recuperarPaquetes() {
		return repository.getPaquetes();
	}

	public void actualizarProductos(List<Producto> productos) {
		
		List<String> list = FileUtil.readfile("mail.txt");
		productos.forEach(this::actualizarProducto);
		
		mailService.send(list.get(1),"Precio productos asignados",getBodyMailProductosAsignados(productos));
	}
	
	private static String getBodyMailProductoPublicado(Producto producto) {
		StringBuilder sb = new StringBuilder("Saludos, \n Se publicó a MercaShops el producto : \n");
		sb.append(producto.getReferenciaProov());
		sb.append(" ");
		sb.append(producto.getDescripcion());
		return sb.toString();
	}

	static String getBodyMailProductosAsignados(List<Producto> productos) {
		StringBuilder sb = new StringBuilder("Saludos, \nYa están listos los costos. Por favor revisar");
		sb.append("\n\n");
		productos.forEach(p-> {
			sb.append(p.getReferenciaProov());
			sb.append(" -> ");
			sb.append(p.getPreciocompra());
			sb.append("\n");
		});
		return sb.toString();	
	}
	
	private static String getBodyMailProductosPorAsignar(Integer consecutivo) {
		return " Hola \n Actualmente tienes referencias por asignar costos del paquete # "+consecutivo+" , por favor dirigirse al siguiente link \n\n https://52.1.235.127:8090/index.html#!/precios \n\n Muchas gracias \n\n DEPARTAMENTO DE COMPRAS \n SNK.";
	}
}
