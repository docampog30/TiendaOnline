
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
 *         &lt;element name="EncabezadoSetGenerarFactura" type="{http://tempuri.org/}EncabezadoSetGenerarFactura"/&gt;
 *         &lt;element name="DetalleProductos" type="{http://tempuri.org/}ArrayOfVenta" minOccurs="0"/&gt;
 *         &lt;element name="FormaPagoFactura" type="{http://tempuri.org/}FormaPagoFactura" minOccurs="0"/&gt;
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
    "encabezadoSetGenerarFactura",
    "detalleProductos",
    "formaPagoFactura"
})
@XmlRootElement(name = "SetGenerarFactura")
public class SetGenerarFactura {

    @XmlElement(name = "Authentication")
    protected AuthenticationSoapHeader authentication;
    @XmlElement(name = "EncabezadoSetGenerarFactura", required = true)
    protected EncabezadoSetGenerarFactura encabezadoSetGenerarFactura;
    @XmlElement(name = "DetalleProductos")
    protected ArrayOfVenta detalleProductos;
    @XmlElement(name = "FormaPagoFactura")
    protected FormaPagoFactura formaPagoFactura;

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
     * Obtiene el valor de la propiedad encabezadoSetGenerarFactura.
     * 
     * @return
     *     possible object is
     *     {@link EncabezadoSetGenerarFactura }
     *     
     */
    public EncabezadoSetGenerarFactura getEncabezadoSetGenerarFactura() {
        return encabezadoSetGenerarFactura;
    }

    /**
     * Define el valor de la propiedad encabezadoSetGenerarFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link EncabezadoSetGenerarFactura }
     *     
     */
    public void setEncabezadoSetGenerarFactura(EncabezadoSetGenerarFactura value) {
        this.encabezadoSetGenerarFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad detalleProductos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVenta }
     *     
     */
    public ArrayOfVenta getDetalleProductos() {
        return detalleProductos;
    }

    /**
     * Define el valor de la propiedad detalleProductos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVenta }
     *     
     */
    public void setDetalleProductos(ArrayOfVenta value) {
        this.detalleProductos = value;
    }

    /**
     * Obtiene el valor de la propiedad formaPagoFactura.
     * 
     * @return
     *     possible object is
     *     {@link FormaPagoFactura }
     *     
     */
    public FormaPagoFactura getFormaPagoFactura() {
        return formaPagoFactura;
    }

    /**
     * Define el valor de la propiedad formaPagoFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link FormaPagoFactura }
     *     
     */
    public void setFormaPagoFactura(FormaPagoFactura value) {
        this.formaPagoFactura = value;
    }

}
