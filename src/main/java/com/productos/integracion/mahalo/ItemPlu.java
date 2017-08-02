
package com.productos.integracion.mahalo;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para itemPlu complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="itemPlu"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="c_plu" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="c_referencia" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="c_barra" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="c_facturacion" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="c_talla" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="c_color_proveedor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemPlu", propOrder = {
    "cPlu",
    "cReferencia",
    "cBarra",
    "cFacturacion",
    "cTalla",
    "cColorProveedor"
})
public class ItemPlu {

    @XmlElement(name = "c_plu", required = true)
    protected BigInteger cPlu;
    @XmlElement(name = "c_referencia", required = true)
    protected BigInteger cReferencia;
    @XmlElement(name = "c_barra", required = true)
    protected String cBarra;
    @XmlElement(name = "c_facturacion", required = true)
    protected BigInteger cFacturacion;
    @XmlElement(name = "c_talla", required = true)
    protected String cTalla;
    @XmlElement(name = "c_color_proveedor", required = true)
    protected String cColorProveedor;

    /**
     * Obtiene el valor de la propiedad cPlu.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCPlu() {
        return cPlu;
    }

    /**
     * Define el valor de la propiedad cPlu.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCPlu(BigInteger value) {
        this.cPlu = value;
    }

    /**
     * Obtiene el valor de la propiedad cReferencia.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCReferencia() {
        return cReferencia;
    }

    /**
     * Define el valor de la propiedad cReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCReferencia(BigInteger value) {
        this.cReferencia = value;
    }

    /**
     * Obtiene el valor de la propiedad cBarra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCBarra() {
        return cBarra;
    }

    /**
     * Define el valor de la propiedad cBarra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCBarra(String value) {
        this.cBarra = value;
    }

    /**
     * Obtiene el valor de la propiedad cFacturacion.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCFacturacion() {
        return cFacturacion;
    }

    /**
     * Define el valor de la propiedad cFacturacion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCFacturacion(BigInteger value) {
        this.cFacturacion = value;
    }

    /**
     * Obtiene el valor de la propiedad cTalla.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTalla() {
        return cTalla;
    }

    /**
     * Define el valor de la propiedad cTalla.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTalla(String value) {
        this.cTalla = value;
    }

    /**
     * Obtiene el valor de la propiedad cColorProveedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCColorProveedor() {
        return cColorProveedor;
    }

    /**
     * Define el valor de la propiedad cColorProveedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCColorProveedor(String value) {
        this.cColorProveedor = value;
    }

}
