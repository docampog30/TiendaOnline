
package com.productos.integracion.mahalo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Authentication" type="{http://tempuri.org/}AuthenticationSoapHeader" minOccurs="0"/&gt;
 *         &lt;element name="EncabezadoPlanoContableAXR" type="{http://tempuri.org/}EncabezadoPlanoContableAXR"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "authentication",
    "encabezadoPlanoContableAXR"
})
@XmlRootElement(name = "PlanoContableAXR")
public class PlanoContableAXR {

    @XmlElement(name = "Authentication")
    protected AuthenticationSoapHeader authentication;
    @XmlElement(name = "EncabezadoPlanoContableAXR", required = true)
    protected EncabezadoPlanoContableAXR encabezadoPlanoContableAXR;

    /**
     * Obtiene el valor de la propiedad authentication.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationSoapHeader }
     *     
     */
    public AuthenticationSoapHeader getAuthentication() {
        return authentication;
    }

    /**
     * Define el valor de la propiedad authentication.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationSoapHeader }
     *     
     */
    public void setAuthentication(AuthenticationSoapHeader value) {
        this.authentication = value;
    }

    /**
     * Obtiene el valor de la propiedad encabezadoPlanoContableAXR.
     * 
     * @return
     *     possible object is
     *     {@link EncabezadoPlanoContableAXR }
     *     
     */
    public EncabezadoPlanoContableAXR getEncabezadoPlanoContableAXR() {
        return encabezadoPlanoContableAXR;
    }

    /**
     * Define el valor de la propiedad encabezadoPlanoContableAXR.
     * 
     * @param value
     *     allowed object is
     *     {@link EncabezadoPlanoContableAXR }
     *     
     */
    public void setEncabezadoPlanoContableAXR(EncabezadoPlanoContableAXR value) {
        this.encabezadoPlanoContableAXR = value;
    }

}
