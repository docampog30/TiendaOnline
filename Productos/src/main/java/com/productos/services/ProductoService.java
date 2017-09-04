package com.productos.services;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productos.bd.AmazonBD;
import com.productos.integracion.mahalo.dto.Query;
import com.productos.integracion.mahalo.dto.Row;
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
	
	public void guardarProductosProcess(){
		
		Query query = integracionService.consultarCreacionProductoMasivo();
		
		System.out.println("# Productos recuperados -> "+query.getSelect().getRows().size());
		
		query.getSelect().getRows().stream()
				.distinct()
				.filter(Objects::nonNull)
				.map(this::buildProducto)
				.filter(Objects::nonNull)
				.forEach(p->{
					repository.save(p);
				});
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
		
		return integracionService.consultarCreacionProductoMasivo(desde,hasta).getSelect().getRows()
					.parallelStream()
					.distinct()
					.filter(queryProductos(marca, linea, genero))
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
		
		return buildSaldoProducto (producto,null);
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
					Set<String> distinctCompany = rows.stream().map(Row::getAlmacen).collect(Collectors.toCollection(HashSet::new));
					producto.setTallas(tallas);
					producto.setAlmacenes(distinctCompany.stream().collect(Collectors.toList()));
					Producto productBD = repository.geyByID(producto.getReferenciaProov());
					producto.setEstado(productBD == null ? null :productBD.getEstado());
					producto.setPreciocompra(productBD == null ? null :productBD.getPreciocompra());
					
					if(producto.getDescripcion() == null){
						
						Row row = querySaldoxReferencia.getSelect().getRows().get(0);
						producto.setDescripcion(row.getDescripcion());
						producto.setMarca(productBD == null ? null : productBD.getMarca());
						producto.setGenero(productBD == null ? null : productBD.getGenero());
						producto.setLinea(productBD == null ? null : productBD.getLinea());
						producto.setReferenciaProov(row.getReferenciaprov());	
						producto.setFecreacion(row.getFecreacion());
						producto.setPrecio(row.getPrecio());
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
	
	public static Predicate<Row> queryProductos(String marca, String linea, String genero) {
	    return r -> r.getMarca().equals(marca) && r.getLinea().equals(linea) && r.getCategoria().equals(genero);
	}

	public void actualizarProducto(Producto producto) {
		repository.save(producto);
		
//		List<String> list = FileUtil.readfile("mail.txt");
		
//		if(producto.getPreciocompra() == null){
//			mailService.send(list.get(0),"Precio productos por asignar",getBodyMailProductosPorAsignar());
//		}else{
//			mailService.send(list.get(1),"Precio productos asignados",getBodyMailProductosAsignados());
//		}
	}
	
	private String getBodyMailProductosAsignados() {
		return "Saludos \n Ya están listos los costos. Por favor revisar";	
	}
	
	private String getBodyMailProductosPorAsignar() {
		return " Hola \n Actualmente tienes referencias por asignar costos, por favor dirigirse al siguiente link \n\n 52.1.235.127:8090/index.html#!/precios \n\n Muchas gracias \n\n DEPARTAMENTO DE COMPRAS \n SNK.";
	}

	public void habilitarPaqueteProductos(List<Producto> productos) {
		List<String> list = FileUtil.readfile("mail.txt");
		mailService.send(list.get(0),"Precio productos por asignar",getBodyMailProductosPorAsignar());
		productos.forEach(repository::save);
	}

	public List<Producto> recuperarProductosPorEstado(String estado) {
		return repository.selectProductByEstado(estado);
	}
}
