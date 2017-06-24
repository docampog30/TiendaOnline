
package com.productos.integracion.mahalo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para itemSeparado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="itemSeparado"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sku" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="barra" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="precio_unitario" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="observacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="vendedor_item" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemSeparado", propOrder = {
    "sku",
    "barra",
    "cantidad",
    "precioUnitario",
    "observacion",
    "vendedorItem"
})
public class ItemSeparado {

    @XmlElement(required = true)
    protected String sku;
    @XmlElement(required = true)
    protected String barra;
    @XmlElement(required = true)
    protected String cantidad;
    @XmlElement(name = "precio_unitario", required = true)
    protected String precioUnitario;
    @XmlElement(required = true)
    protected String observacion;
    @XmlElement(name = "vendedor_item", required = true)
    protected String vendedorItem;

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
     * Obtiene el valor de la propiedad observacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacion() {
        return observacion;
    }

    /**
     * Define el valor de la propiedad observacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacion(String value) {
        this.observacion = value;
    }

    /**
     * Obtiene el valor de la propiedad vendedorItem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendedorItem() {
        return vendedorItem;
    }

    /**
     * Define el valor de la propiedad vendedorItem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendedorItem(String value) {
        this.vendedorItem = value;
    }

}
