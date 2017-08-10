package com.productos.integracion.mahalo;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.11
 * 2017-06-23T16:19:01.284-05:00
 * Generated source version: 3.1.11
 * 
 */
@WebServiceClient(name = "ExternalService", 
                  wsdlLocation = "file:mahalo.wsdl",
                  targetNamespace = "http://tempuri.org/") 
public class ExternalService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://tempuri.org/", "ExternalService");
    public final static QName ExternalServiceSoap = new QName("http://tempuri.org/", "ExternalServiceSoap");
    static {
        URL url = null;
        try {
            url = new URL("file:mahalo.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ExternalService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:mahalo.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ExternalService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ExternalService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ExternalService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public ExternalService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ExternalService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ExternalService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns ExternalServiceSoap
     */
    @WebEndpoint(name = "ExternalServiceSoap")
    public ExternalServiceSoap getExternalServiceSoap() {
        return super.getPort(ExternalServiceSoap, ExternalServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ExternalServiceSoap
     */
    @WebEndpoint(name = "ExternalServiceSoap")
    public ExternalServiceSoap getExternalServiceSoap(WebServiceFeature... features) {
        return super.getPort(ExternalServiceSoap, ExternalServiceSoap.class, features);
    }

}