
package com.productos.integracion.mahalo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para itemModificarListaDePrecios complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="itemModificarListaDePrecios"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="escala" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ref" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="f_precio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="prec_frac" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="c_almacen" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sw_estado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="c_iva" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemModificarListaDePrecios", propOrder = {
    "escala",
    "ref",
    "precio",
    "fPrecio",
    "precFrac",
    "cAlmacen",
    "swEstado",
    "cIva"
})
public class ItemModificarListaDePrecios {

    protected int escala;
    @XmlElement(required = true)
    protected String ref;
    @XmlElement(required = true)
    protected String precio;
    @XmlElement(name = "f_precio", required = true)
    protected String fPrecio;
    @XmlElement(name = "prec_frac", required = true)
    protected String precFrac;
    @XmlElement(name = "c_almacen", required = true)
    protected String cAlmacen;
    @XmlElement(name = "sw_estado", required = true)
    protected String swEstado;
    @XmlElement(name = "c_iva", required = true)
    protected String cIva;

    /**
     * Obtiene el valor de la propiedad escala.
     * 
     */
    public int getEscala() {
        return escala;
    }

    /**
     * Define el valor de la propiedad escala.
     * 
     */
    public void setEscala(int value) {
        this.escala = value;
    }

    /**
     * Obtiene el valor de la propiedad ref.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Define el valor de la propiedad ref.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef(String value) {
        this.ref = value;
    }

    /**
     * Obtiene el valor de la propiedad precio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * Define el valor de la propiedad precio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecio(String value) {
        this.precio = value;
    }

    /**
     * Obtiene el valor de la propiedad fPrecio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFPrecio() {
        return fPrecio;
    }

    /**
     * Define el valor de la propiedad fPrecio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFPrecio(String value) {
        this.fPrecio = value;
    }

    /**
     * Obtiene el valor de la propiedad precFrac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecFrac() {
        return precFrac;
    }

    /**
     * Define el valor de la propiedad precFrac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecFrac(String value) {
        this.precFrac = value;
    }

    /**
     * Obtiene el valor de la propiedad cAlmacen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAlmacen() {
        return cAlmacen;
    }

    /**
     * Define el valor de la propiedad cAlmacen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAlmacen(String value) {
        this.cAlmacen = value;
    }

    /**
     * Obtiene el valor de la propiedad swEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwEstado() {
        return swEstado;
    }

    /**
     * Define el valor de la propiedad swEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwEstado(String value) {
        this.swEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad cIva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIva() {
        return cIva;
    }

    /**
     * Define el valor de la propiedad cIva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIva(String value) {
        this.cIva = value;
    }

}
