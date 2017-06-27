package com.productos.services;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productos.common.TemplateRest;
import com.productos.integracion.mahalo.AuthenticationSoapHeader;
import com.productos.integracion.mahalo.CreacionProductoMasivo;
import com.productos.integracion.mahalo.EncabezadoCreacionProductoMasivo;
import com.productos.integracion.mahalo.EncabezadoGetSaldosCreadosMasivo;
import com.productos.integracion.mahalo.ExternalService;
import com.productos.integracion.mahalo.GetSaldosCreadosMasivo;
import com.productos.integracion.mahalo.ObjectFactory;
import com.productos.integracion.mahalo.ResultadoWS;
import com.productos.integracion.mahalo.TicketResponse;
import com.productos.model.Pictures;
import com.productos.model.Producto;
import com.productos.model.ProductoMercadoLibre;
import com.productos.model.ResponseValidate;

@Service
public class ProductoService {
	
	private static URL url = null;
	
	@Autowired
	private TemplateRest templateRest;
	
	static{
		try {
			url = new URL("http://mobile.saas.com.co/public/WebService/mahalo.wsdl");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Producto> consultarProductos(){
		
		ObjectFactory factory = new ObjectFactory();
		
		CreacionProductoMasivo getSaldosCreadosMasivo = factory.createCreacionProductoMasivo();
		
		AuthenticationSoapHeader authenticationSoapHeader = factory.createAuthenticationSoapHeader();
		authenticationSoapHeader.setUser("sgc01511");
		authenticationSoapHeader.setPassword("ver#c015");
			
		EncabezadoCreacionProductoMasivo enCreadosMasivo = factory.createEncabezadoCreacionProductoMasivo();
		enCreadosMasivo.setFechaDesde("01/01/2017");
		enCreadosMasivo.setFechaHasta("23/06/2017");
		
		getSaldosCreadosMasivo.setAuthentication(authenticationSoapHeader);
		getSaldosCreadosMasivo.setEncabezadoCreacionProductoMasivo(enCreadosMasivo);
		
		ExternalService service = new ExternalService(url);
		TicketResponse resultadoWS = service.getExternalServiceSoap().getInfoCreacionProductoMasivo(getSaldosCreadosMasivo);
		String datos = resultadoWS.getResultadoTicket().getDatos();
		
		System.err.println(resultadoWS.getResultadoTicket().toString());
		System.out.println(resultadoWS.getResultadoTicket().toString());
		
		Producto producto = new Producto();
		producto.setAlmacen("Almacen 1");
		producto.setDescripcion("Descripcion 2");
		producto.setSaldo(1);
		producto.setTalla("39");
		
		List<Producto> productos = new ArrayList<>();
		productos.add(producto);
		
		return productos;
		
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
		
		List<Pictures> picturesList = new ArrayList<Pictures>(); 
		Pictures pictures = new Pictures();
		pictures.setSource("http://mla-s2-p.mlstatic.com/968521-MLA20805195516_072016-O.jpg");
		
		productoMercadoLibre.setPictures(picturesList);
		
		templateRest.consumePostServices("https://api.mercadolibre.com/items/validate?access_token=APP_USR-8499769276025352-062612-ea160bf3f9f976a544148a1be4224daf__E_I__-261678194", productoMercadoLibre, ResponseValidate.class);
	}
}
