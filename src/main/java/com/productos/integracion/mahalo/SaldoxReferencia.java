
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
 *         &lt;element name="EncabezadoSaldoxReferencia" type="{http://tempuri.org/}EncabezadoSaldoxReferencia"/&gt;
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
    "encabezadoSaldoxReferencia"
})
@XmlRootElement(name = "SaldoxReferencia")
public class SaldoxReferencia {

    @XmlElement(name = "Authentication")
    protected AuthenticationSoapHeader authentication;
    @XmlElement(name = "EncabezadoSaldoxReferencia", required = true)
    protected EncabezadoSaldoxReferencia encabezadoSaldoxReferencia;

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
     * Obtiene el valor de la propiedad encabezadoSaldoxReferencia.
     * 
     * @return
     *     possible object is
     *     {@link EncabezadoSaldoxReferencia }
     *     
     */
    public EncabezadoSaldoxReferencia getEncabezadoSaldoxReferencia() {
        return encabezadoSaldoxReferencia;
    }

    /**
     * Define el valor de la propiedad encabezadoSaldoxReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link EncabezadoSaldoxReferencia }
     *     
     */
    public void setEncabezadoSaldoxReferencia(EncabezadoSaldoxReferencia value) {
        this.encabezadoSaldoxReferencia = value;
    }

}
