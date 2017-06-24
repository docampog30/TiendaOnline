
package com.productos.integracion.mahalo;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EncabezadoSaldoxSkuAlmacen complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EncabezadoSaldoxSkuAlmacen"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sku" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="almacen" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncabezadoSaldoxSkuAlmacen", propOrder = {
    "sku",
    "almacen"
})
public class EncabezadoSaldoxSkuAlmacen {

    @XmlElement(required = true)
    protected String sku;
    @XmlElement(required = true)
    protected BigInteger almacen;

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
     * Obtiene el valor de la propiedad almacen.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAlmacen() {
        return almacen;
    }

    /**
     * Define el valor de la propiedad almacen.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAlmacen(BigInteger value) {
        this.almacen = value;
    }

}
