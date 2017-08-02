
package com.productos.integracion.mahalo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para item complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="item"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sku" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="barra" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="precio_unitario" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="porcentaje_iva" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="valor_iva_unitario" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="id_mascota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "item", propOrder = {
    "sku",
    "barra",
    "cantidad",
    "precioUnitario",
    "porcentajeIva",
    "valorIvaUnitario",
    "idMascota"
})
public class Item {

    @XmlElement(required = true)
    protected String sku;
    @XmlElement(required = true)
    protected String barra;
    @XmlElement(required = true)
    protected String cantidad;
    @XmlElement(name = "precio_unitario", required = true)
    protected String precioUnitario;
    @XmlElement(name = "porcentaje_iva", required = true)
    protected String porcentajeIva;
    @XmlElement(name = "valor_iva_unitario", required = true)
    protected String valorIvaUnitario;
    @XmlElement(name = "id_mascota")
    protected String idMascota;

    /**
     * Obtiene el valor de la propiedad sku.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSku() {
        return sku;
    }

    /**
     * Define el valor de la propiedad sku.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSku(String value) {
        this.sku = value;
    }

    /**
     * Obtiene el valor de la propiedad barra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarra() {
        return barra;
    }

    /**
     * Define el valor de la propiedad barra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarra(String value) {
        this.barra = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantidad(String value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad precioUnitario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * Define el valor de la propiedad precioUnitario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecioUnitario(String value) {
        this.precioUnitario = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentajeIva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPorcentajeIva() {
        return porcentajeIva;
    }

    /**
     * Define el valor de la propiedad porcentajeIva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPorcentajeIva(String value) {
        this.porcentajeIva = value;
    }

    /**
     * Obtiene el valor de la propiedad valorIvaUnitario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorIvaUnitario() {
        return valorIvaUnitario;
    }

    /**
     * Define el valor de la propiedad valorIvaUnitario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorIvaUnitario(String value) {
        this.valorIvaUnitario = value;
    }

    /**
     * Obtiene el valor de la propiedad idMascota.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdMascota() {
        return idMascota;
    }

    /**
     * Define el valor de la propiedad idMascota.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdMascota(String value) {
        this.idMascota = value;
    }

}
