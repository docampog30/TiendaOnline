
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
 *         &lt;element name="EncabezadoSetGenerarSeparado" type="{http://tempuri.org/}EncabezadoSetGenerarSeparado"/&gt;
 *         &lt;element name="DetalleProductosSeparado" type="{http://tempuri.org/}ArrayOfSeparado" minOccurs="0"/&gt;
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
    "encabezadoSetGenerarSeparado",
    "detalleProductosSeparado"
})
@XmlRootElement(name = "SetGenerarSeparado")
public class SetGenerarSeparado {

    @XmlElement(name = "Authentication")
    protected AuthenticationSoapHeader authentication;
    @XmlElement(name = "EncabezadoSetGenerarSeparado", required = true)
    protected EncabezadoSetGenerarSeparado encabezadoSetGenerarSeparado;
    @XmlElement(name = "DetalleProductosSeparado")
    protected ArrayOfSeparado detalleProductosSeparado;

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
     * Obtiene el valor de la propiedad encabezadoSetGenerarSeparado.
     * 
     * @return
     *     possible object is
     *     {@link EncabezadoSetGenerarSeparado }
     *     
     */
    public EncabezadoSetGenerarSeparado getEncabezadoSetGenerarSeparado() {
        return encabezadoSetGenerarSeparado;
    }

    /**
     * Define el valor de la propiedad encabezadoSetGenerarSeparado.
     * 
     * @param value
     *     allowed object is
     *     {@link EncabezadoSetGenerarSeparado }
     *     
     */
    public void setEncabezadoSetGenerarSeparado(EncabezadoSetGenerarSeparado value) {
        this.encabezadoSetGenerarSeparado = value;
    }

    /**
     * Obtiene el valor de la propiedad detalleProductosSeparado.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSeparado }
     *     
     */
    public ArrayOfSeparado getDetalleProductosSeparado() {
        return detalleProductosSeparado;
    }

    /**
     * Define el valor de la propiedad detalleProductosSeparado.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSeparado }
     *     
     */
    public void setDetalleProductosSeparado(ArrayOfSeparado value) {
        this.detalleProductosSeparado = value;
    }

}
