package com.productos.services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	
	public List<Producto> consultarProductos(){
		
		Query query = integracionService.consultarCreacionProductoMasivo();
		
		List<Producto> productos = query.getSelect().getRows().stream()
									.map(Row::getReferenciaprov)
									.map(this::buildProduct)
									.collect(Collectors.toList());
		return productos;
		
	}
	
	public Producto buildProduct(String referencia){
		
		Producto producto = new Producto();
		Query querySaldoxReferencia = integracionService.consultarDetallexReferenciaProovedor(referencia);
		
		List<Row> rows = querySaldoxReferencia.getSelect().getRows().stream()
				.filter(Objects::nonNull)
				.filter(row ->	row.getSaldo() != null &&  row.getTalla() != null && row.getAlmacen() != null)
				.collect(Collectors.toList());
		
		Map<String, Integer> countTotalByTalla = rows.stream().collect(Collectors.groupingBy(Row::getTalla, Collectors.summingInt(Row::getSaldo)));		
		Set<String> distinctCompany = rows.stream().map(Row::getAlmacen).collect(Collectors.toCollection(HashSet::new));
		
		Row row = rows.get(0);
		
		producto.setDescripcion(row.getDescripcion());
		producto.setMarca(row.getMarca());
		producto.setSexo(row.getCategoria());
		producto.setLinea(row.getLinea());

		
		countTotalByTalla.forEach((key,count)->{
			Talla talla = new Talla(); 
			talla.setDescripcion(key);
			talla.setCantidad(count);
			
			producto.addTalla(talla);
		});
		
		distinctCompany.forEach(almacen->{
			producto.addAlmacen(almacen);
		});
		
		
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
