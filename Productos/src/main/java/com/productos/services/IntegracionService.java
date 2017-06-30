package com.productos.services;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.productos.integracion.mahalo.AuthenticationSoapHeader;
import com.productos.integracion.mahalo.CreacionProductoMasivo;
import com.productos.integracion.mahalo.EncabezadoCreacionProductoMasivo;
import com.productos.integracion.mahalo.EncabezadoSaldoxReferenciaProveedor;
import com.productos.integracion.mahalo.ExternalService;
import com.productos.integracion.mahalo.ObjectFactory;
import com.productos.integracion.mahalo.SaldoxReferenciaProveedor;
import com.productos.integracion.mahalo.TicketResponse;
import com.productos.integracion.mahalo.dto.Query;
import com.productos.integracion.mahalo.dto.Row;
import com.productos.integracion.mahalo.dto.Select;
import com.productos.util.DateUtil;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

@Service
public class IntegracionService {
	
	private static final String PASSWORD = "ver#c015";
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
	
	public Query consultarCreacionProductoMasivo(){
		CreacionProductoMasivo getSaldosCreadosMasivo = FACTORY.createCreacionProductoMasivo();
		
		EncabezadoCreacionProductoMasivo enCreadosMasivo = FACTORY.createEncabezadoCreacionProductoMasivo();
		enCreadosMasivo.setFechaDesde("01/04/2017");
		enCreadosMasivo.setFechaHasta("15/04/2017");
//		enCreadosMasivo.setFechaHasta(DateUtil.localDateTimeToString(LocalDateTime.now(),DateUtil.DATE_FORMATTER));
		
		getSaldosCreadosMasivo.setAuthentication(AUTHENTICATION);
		getSaldosCreadosMasivo.setEncabezadoCreacionProductoMasivo(enCreadosMasivo);
		
		ExternalService service = new ExternalService(url);
		TicketResponse resultadoWS = service.getExternalServiceSoap().getInfoCreacionProductoMasivo(getSaldosCreadosMasivo);
		String datos = resultadoWS.getResultadoTicket().getDatos();

		return getQuery(datos);
	}
	
	public Query consultarDetallexReferenciaProovedor(String referencia){
		SaldoxReferenciaProveedor saldoXReferencia = FACTORY.createSaldoxReferenciaProveedor();
		
		EncabezadoSaldoxReferenciaProveedor encabezadoSaldoxReferencia = FACTORY.createEncabezadoSaldoxReferenciaProveedor();
		encabezadoSaldoxReferencia.setReferenciaProveedor(referencia);
		
		saldoXReferencia.setAuthentication(AUTHENTICATION);
		saldoXReferencia.setEncabezadoSaldoxReferenciaProveedor(encabezadoSaldoxReferencia);
		
		ExternalService service = new ExternalService(url);
		TicketResponse resultadoWS = service.getExternalServiceSoap().getSaldoxReferenciaProveedor(saldoXReferencia);
		String datos = resultadoWS.getResultadoTicket().getDatos();

		return getQuery(datos);
	}

	private Query getQuery(String datos) {
		String data = reemplazarCodigosXML(datos);
		XStream xStream  = new XStream(new StaxDriver());
		xStream.processAnnotations(Query.class);
		xStream.processAnnotations(Row.class);
		xStream.processAnnotations(Select.class);
		xStream.ignoreUnknownElements();

		Query query = (Query) xStream.fromXML(data);
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
		
		
		return data;
	}
	
}
