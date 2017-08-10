
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
 *         &lt;element name="EncabezadoSaldoxSkuAlmacen" type="{http://tempuri.org/}EncabezadoSaldoxSkuAlmacen"/&gt;
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
    "encabezadoSaldoxSkuAlmacen"
})
@XmlRootElement(name = "SaldoxSkuAlmacen")
public class SaldoxSkuAlmacen {

    @XmlElement(name = "Authentication")
    protected AuthenticationSoapHeader authentication;
    @XmlElement(name = "EncabezadoSaldoxSkuAlmacen", required = true)
    protected EncabezadoSaldoxSkuAlmacen encabezadoSaldoxSkuAlmacen;

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
     * Obtiene el valor de la propiedad encabezadoSaldoxSkuAlmacen.
     * 
     * @return
     *     possible object is
     *     {@link EncabezadoSaldoxSkuAlmacen }
     *     
     */
    public EncabezadoSaldoxSkuAlmacen getEncabezadoSaldoxSkuAlmacen() {
        return encabezadoSaldoxSkuAlmacen;
    }

    /**
     * Define el valor de la propiedad encabezadoSaldoxSkuAlmacen.
     * 
     * @param value
     *     allowed object is
     *     {@link EncabezadoSaldoxSkuAlmacen }
     *     
     */
    public void setEncabezadoSaldoxSkuAlmacen(EncabezadoSaldoxSkuAlmacen value) {
        this.encabezadoSaldoxSkuAlmacen = value;
    }

}
