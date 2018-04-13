package com.productos.services;

import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.productos.integracion.mahalo.AuthenticationSoapHeader;
import com.productos.integracion.mahalo.CreacionProductoMasivo;
import com.productos.integracion.mahalo.EncabezadoCreacionProductoMasivo;
import com.productos.integracion.mahalo.EncabezadoProductoxSku;
import com.productos.integracion.mahalo.EncabezadoSaldoxReferenciaProveedor;
import com.productos.integracion.mahalo.EncabezadoSaldoxReferenciaProveedorAlmacen;
import com.productos.integracion.mahalo.ExternalService;
import com.productos.integracion.mahalo.ObjectFactory;
import com.productos.integracion.mahalo.ProductoxSku;
import com.productos.integracion.mahalo.SaldoxReferenciaProveedor;
import com.productos.integracion.mahalo.SaldoxReferenciaProveedorAlmacen;
import com.productos.integracion.mahalo.TicketResponse;
import com.productos.integracion.mahalo.dto.Query;
import com.productos.integracion.mahalo.dto.Row;
import com.productos.integracion.mahalo.dto.Select;
import com.productos.util.DateUtil;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

@Service
public class IntegracionService {
	
	private static final String PASSWORD = "ver#0151";
	private static final String USER = "sgc01511";
	private static final ObjectFactory FACTORY = new ObjectFactory();
	private static AuthenticationSoapHeader AUTHENTICATION = null;
	private static URL url = null;
	
	static{
		try {
			url = new URL("http://mobile.saas.com.co/public/WebService/mahalo.wsdl");
			AUTHENTICATION = FACTORY.createAuthenticationSoapHeader();
			AUTHENTICATION.setUser(USER);
			AUTHENTICATION.setPassword(PASSWORD);
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	public Query consultarCreacionProductoMasivo(LocalDate desde,LocalDate hasta){
		String datos = null;
		CreacionProductoMasivo getSaldosCreadosMasivo = FACTORY.createCreacionProductoMasivo();
		
		EncabezadoCreacionProductoMasivo enCreadosMasivo = FACTORY.createEncabezadoCreacionProductoMasivo();
		enCreadosMasivo.setFechaDesde(DateUtil.localDateToString(desde,DateUtil.DATE_FORMATTER));
		
		enCreadosMasivo.setFechaHasta(DateUtil.localDateToString(hasta,DateUtil.DATE_FORMATTER));
		
		getSaldosCreadosMasivo.setAuthentication(AUTHENTICATION);
		getSaldosCreadosMasivo.setEncabezadoCreacionProductoMasivo(enCreadosMasivo);
		
		try {
			ExternalService service = new ExternalService(url);
			System.out.println("Consultando getInfoCreacionProductoMasivo ::::");
			TicketResponse resultadoWS = service.getExternalServiceSoap().getInfoCreacionProductoMasivo(getSaldosCreadosMasivo);
			datos = resultadoWS.getResultadoTicket().getDatos();
			System.out.println("Termina getInfoCreacionProductoMasivo ::::");
		} catch (Exception e) {
			System.err.println("Error en consultarCreacionProductoMasivo "+e.getMessage());
		}
		

		return getQuery(datos);
	}
	
	public Query consultarDetallexReferencia(String referencia){
		String datos = null;
		SaldoxReferenciaProveedor saldoXReferencia = FACTORY.createSaldoxReferenciaProveedor();
		
		EncabezadoSaldoxReferenciaProveedor encabezadoSaldoxReferencia = FACTORY.createEncabezadoSaldoxReferenciaProveedor();
		encabezadoSaldoxReferencia.setReferenciaProveedor(referencia);
		
		saldoXReferencia.setAuthentication(AUTHENTICATION);
		saldoXReferencia.setEncabezadoSaldoxReferenciaProveedor(encabezadoSaldoxReferencia);

		try {
			ExternalService service = new ExternalService(url);
			TicketResponse resultadoWS = service.getExternalServiceSoap().getSaldoxReferenciaProveedor(saldoXReferencia);
			datos = resultadoWS.getResultadoTicket().getDatos();

			System.err.println("Ref_: -> "+referencia);
		} catch (Exception e) {
			System.err.println("Error en consultarDetallexReferencia"+e.getMessage());
		}
		return getQuery(datos);
	}

	
	public Query consultarDetallexReferenciaProovedor(String referencia,String almacen){
		if(null != almacen && !almacen.isEmpty()){
			return consultarDetalleXReferenciaAlmacen(referencia, almacen);
		}else{
			return consultarDetallexReferencia(referencia);
		}
		
	}
	
	public Query consultarDetalleXReferenciaAlmacen(String referencia,String almacen){
		String datos = null;
		
		EncabezadoSaldoxReferenciaProveedorAlmacen encabezadoSaldoxReferenciaAlmacen = FACTORY.createEncabezadoSaldoxReferenciaProveedorAlmacen();
		encabezadoSaldoxReferenciaAlmacen.setReferenciaProveedor(referencia);
		encabezadoSaldoxReferenciaAlmacen.setAlmacen(new BigInteger(almacen));
		SaldoxReferenciaProveedorAlmacen saldoXReferenciaAlmacen = FACTORY.createSaldoxReferenciaProveedorAlmacen();
		
		saldoXReferenciaAlmacen.setAuthentication(AUTHENTICATION);
		saldoXReferenciaAlmacen.setEncabezadoSaldoxReferenciaProveedorAlmacen(encabezadoSaldoxReferenciaAlmacen);
		
		try {
			ExternalService service = new ExternalService(url);
			TicketResponse resultadoWS = service.getExternalServiceSoap().getSaldoxReferenciaProveedorAlmacen(saldoXReferenciaAlmacen);
			datos = resultadoWS.getResultadoTicket().getDatos();

			System.err.println("Ref_: -> "+referencia);
		} catch (Exception e) {
			System.err.println("Error en consultarDetallexReferenciaAlmacen "+e.getMessage());
		}
		return getQuery(datos);
	}

	private Query getQuery(String datos) {
		Query query = null;
		if(datos != null && !datos.isEmpty()){
			String data = reemplazarCodigosXML(datos);
			XStream xStream  = new XStream(new StaxDriver());
			xStream.processAnnotations(Query.class);
			xStream.processAnnotations(Row.class);
			xStream.processAnnotations(Select.class);
			xStream.ignoreUnknownElements();
	
			query = (Query) xStream.fromXML(data);
		}else{
			System.err.println("Datos nulos o vacios");
		}
		return query;
	}

	private String reemplazarCodigosXML(String data) {
		data = data.replaceAll("(<row[0-9]{0,4}\\s)", "<row ");
		data = data.replace("c_almacen","almacen");
		data = data.replace("c_barra","barra");
		data = data.replace("d_producto","descripcion");
		data = data.replace("pr_venta","precio");
		data = data.replace("c_talla","talla");
		data = data.replace("d_marca","marca");
		data = data.replace("c_almacen","almacen");
		data = data.replace("d_referencia_prov","referenciaprov");
		data = data.replace("c_producto","codproducto");
		data = data.replace("cn_saldo", "saldo");
		data = data.replace("d_linea", "linea");
		data = data.replace("d_categoria", "categoria");
		data = data.replace("cn_saldo", "saldo");
		data = data.replace("ts_creacion", "fecreacion");
		
		
		return data;
	}

	public Query consultarDetallesXSKU(String sku) {
		String datos = null;
		ProductoxSku productoSKU = FACTORY.createProductoxSku();
		
		EncabezadoProductoxSku enProdSKU = FACTORY.createEncabezadoProductoxSku();
		enProdSKU.setSku(sku);
		
		productoSKU.setAuthentication(AUTHENTICATION);
		productoSKU.setEncabezadoProductoxSku(enProdSKU);
		
		try {
			ExternalService service = new ExternalService(url);
			System.out.println("Consultando getInfoProductoxSku ::::");
			TicketResponse resultadoWS = service.getExternalServiceSoap().getInfoProductoxSku(productoSKU);
			datos = resultadoWS.getResultadoTicket().getDatos();
			System.out.println("Termina getInfoProductoxSku ::::");
		} catch (Exception e) {
			System.err.println("Error en getInfoProductoxSku "+e.getMessage());
		}
		

		return getQuery(datos);
		
	}
	
}
