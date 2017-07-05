package com.productos.services;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productos.bd.AmazonBD;
import com.productos.common.TemplateRest;
import com.productos.integracion.mahalo.dto.Query;
import com.productos.integracion.mahalo.dto.Row;
import com.productos.model.Pictures;
import com.productos.model.Producto;
import com.productos.model.ProductoMercadoLibre;
import com.productos.model.ResponseValidate;
import com.productos.model.Talla;

@Service
public class ProductoService {
	
	@Autowired
	private TemplateRest templateRest;
	
	@Autowired
	private IntegracionService integracionService;
	
	@Autowired
	private  AmazonBD repository;
	
	
	
	public List<Producto> consultarProductos(){
		
		Query query = integracionService.consultarCreacionProductoMasivo();
		
		List<Producto> productos = query.getSelect().getRows().stream()
									.distinct()
									.filter(Objects::nonNull)
									.map(this::buildProduct)
									.filter(Objects::nonNull)
									.collect(Collectors.toList());
		
		String file = "languages.txt";
        System.out.println("Writing to file: " + file);
        
        
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(file),StandardCharsets.UTF_8)) {
	        productos.stream().forEach(p-> {
	        	repository.save(p);
	      		  try {
					writer.write(p.getReferenciaProov()+"\r\n");
				} catch (IOException e) {
					e.printStackTrace();
				}
	  		});
        } catch (IOException e1) {
			e1.printStackTrace();
		}

        

		
        System.out.println("Finish: " + file);
		return productos;
		
	}
	
	public Producto buildProduct(Row row){
		
		System.err.println("BuildProduct -> "+ row.toString());
		
		Producto producto = null;
		Query querySaldoxReferencia = integracionService.consultarDetallexReferenciaProovedor(row.getReferenciaprov());
		
		if(querySaldoxReferencia != null){
			List<Row> rows = querySaldoxReferencia.getSelect().getRows().stream()
				.filter(Objects::nonNull)
				.filter(r ->	r.getSaldo() != null && r.getSaldo() > 0 &&  r.getTalla() != null && r.getAlmacen() != null)
				.collect(Collectors.toList());
		
			if(!rows.isEmpty()){
			
				producto = new Producto();
				Map<String, Integer> countTotalByTalla = rows.stream().collect(Collectors.groupingBy(Row::getTalla, Collectors.summingInt(Row::getSaldo)));		
				Set<String> distinctCompany = rows.stream().map(Row::getAlmacen).collect(Collectors.toCollection(HashSet::new));
				
				
				producto.setDescripcion(row.getDescripcion());
				producto.setMarca(row.getMarca());
				producto.setSexo(row.getCategoria());
				producto.setLinea(row.getLinea());
				producto.setReferenciaProov(row.getReferenciaprov());
				List<Talla> tallas = countTotalByTalla.entrySet().stream()
						.map(e -> new Talla(e.getKey(), e.getValue())).collect(Collectors.toList());
				
				producto.setTallas(tallas);
				producto.setAlmacenes(distinctCompany.stream().collect(Collectors.toList()));
				
				System.err.println(producto.toString());
			}
		}
		
		return producto;
	}
		
	public void publicarProducto(){
		ProductoMercadoLibre productoMercadoLibre = new ProductoMercadoLibre();
		productoMercadoLibre.setTitle("Item de test - No Ofertar");
		productoMercadoLibre.setCategory_id("MCO3530");
		productoMercadoLibre.setPrice(10);
		productoMercadoLibre.setCurrency_id("COP");
		productoMercadoLibre.setAvailable_quantity(1);
		productoMercadoLibre.setBuying_mode("buy_it_now");
		productoMercadoLibre.setListing_type_id("bronze");
		productoMercadoLibre.setCondition("new");
		productoMercadoLibre.setDescription("Item de test - No Ofertar");
		
		List<Pictures> picturesList = new ArrayList<>(); 
		Pictures pictures = new Pictures();
		pictures.setSource("http://mla-s2-p.mlstatic.com/968521-MLA20805195516_072016-O.jpg");
		
		productoMercadoLibre.setPictures(picturesList);
		
		templateRest.consumePostServices("https://api.mercadolibre.com/items/validate?access_token=APP_USR-8499769276025352-062612-ea160bf3f9f976a544148a1be4224daf__E_I__-261678194", productoMercadoLibre, ResponseValidate.class);
	}
}
