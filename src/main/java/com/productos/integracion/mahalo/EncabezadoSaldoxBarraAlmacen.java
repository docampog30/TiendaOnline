
package com.productos.integracion.mahalo;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EncabezadoSaldoxBarraAlmacen complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EncabezadoSaldoxBarraAlmacen"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="barra" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "EncabezadoSaldoxBarraAlmacen", propOrder = {
    "barra",
    "almacen"
})
public class EncabezadoSaldoxBarraAlmacen {

    @XmlElement(required = true)
    protected String barra;
    @XmlElement(required = true)
    protected BigInteger almacen;

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
