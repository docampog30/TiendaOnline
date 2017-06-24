
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
 *         &lt;element name="EncabezadoSetGenerarKardex" type="{http://tempuri.org/}EncabezadoSetGenerarKardex"/&gt;
 *         &lt;element name="DetalleProductosKardex" type="{http://tempuri.org/}ArrayOfKardex" minOccurs="0"/&gt;
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
    "encabezadoSetGenerarKardex",
    "detalleProductosKardex"
})
@XmlRootElement(name = "SetGenerarKardex")
public class SetGenerarKardex {

    @XmlElement(name = "Authentication")
    protected AuthenticationSoapHeader authentication;
    @XmlElement(name = "EncabezadoSetGenerarKardex", required = true)
    protected EncabezadoSetGenerarKardex encabezadoSetGenerarKardex;
    @XmlElement(name = "DetalleProductosKardex")
    protected ArrayOfKardex detalleProductosKardex;

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
     * Obtiene el valor de la propiedad encabezadoSetGenerarKardex.
     * 
     * @return
     *     possible object is
     *     {@link EncabezadoSetGenerarKardex }
     *     
     */
    public EncabezadoSetGenerarKardex getEncabezadoSetGenerarKardex() {
        return encabezadoSetGenerarKardex;
    }

    /**
     * Define el valor de la propiedad encabezadoSetGenerarKardex.
     * 
     * @param value
     *     allowed object is
     *     {@link EncabezadoSetGenerarKardex }
     *     
     */
    public void setEncabezadoSetGenerarKardex(EncabezadoSetGenerarKardex value) {
        this.encabezadoSetGenerarKardex = value;
    }

    /**
     * Obtiene el valor de la propiedad detalleProductosKardex.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKardex }
     *     
     */
    public ArrayOfKardex getDetalleProductosKardex() {
        return detalleProductosKardex;
    }

    /**
     * Define el valor de la propiedad detalleProductosKardex.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKardex }
     *     
     */
    public void setDetalleProductosKardex(ArrayOfKardex value) {
        this.detalleProductosKardex = value;
    }

}
