package com.productos.services;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.productos.model.Producto;

public class ProductoServiceTest {

	private static List<Producto> productos = new ArrayList<>();
	
	static {
		Producto p1 = new Producto();
		Producto p2 = new Producto();
		p1.setReferenciaProov("123");
		p1.setPreciocompra("45600");
		p2.setReferenciaProov("123");
		p2.setPreciocompra("50600");
		
		productos.add(p1);
		productos.add(p2);
	}
	
	
	@Test
	public void debeGenerarBodyMailConProductos() throws Exception {
		String bodyMailProductosAsignados = ProductoService.getBodyMailProductosAsignados(productos);
		System.err.println(bodyMailProductosAsignados);
		assertNotNull(bodyMailProductosAsignados);
	}
}
