package com.productos.services;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import com.productos.integracion.mahalo.AuthenticationSoapHeader;
import com.productos.integracion.mahalo.CreacionProductoMasivo;
import com.productos.integracion.mahalo.EncabezadoCreacionProductoMasivo;
import com.productos.integracion.mahalo.ExternalService;
import com.productos.integracion.mahalo.ObjectFactory;
import com.productos.integracion.mahalo.TicketResponse;
import com.productos.integracion.mahalo.dto.Query;
import com.productos.integracion.mahalo.dto.Row;
import com.productos.integracion.mahalo.dto.Select;
import com.productos.model.Producto;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

@Service
public class ProductoService {
	
	private static URL url = null;
	
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
		
		
		String data = datos.replaceAll("(<row[0-9]{0,4}\\s)", "<row ");
		data = data.replace("c_almacen","almacen");
		data = data.replace("c_barra","barra");
		data = data.replace("d_producto","descripcion");
		data = data.replace("pr_venta","precio");
		data = data.replace("c_talla","talla");
		data = data.replace("d_marca","marca");
		
		
		
		XStream xStream  = new XStream(new StaxDriver());
		xStream.processAnnotations(Query.class);
		xStream.processAnnotations(Row.class);
		xStream.processAnnotations(Select.class);
		xStream.ignoreUnknownElements();
		
		
		Query query = (Query) xStream.fromXML(data);
		
		System.err.println("Tamaño listas :::: "+query.getSelect().getRows().size());
		
		
		List<Producto> productos = query.getSelect().getRows().stream()
									.map(ProductoService::buildProduct)
									.collect(Collectors.toList());

		
		return productos;
		
	}
	
	public static Producto buildProduct(Row row){
		
		Producto producto = new Producto();
		producto.setDescripcion(row.getDescripcion());
		producto.setTalla(row.getTalla());
		
		return producto;
		
	}
}
