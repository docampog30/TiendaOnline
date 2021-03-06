
package com.productos.integracion.mahalo;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para EncabezadoGetSaldosCreadosMasivoxAlmacen complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EncabezadoGetSaldosCreadosMasivoxAlmacen"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fecha_desde" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="hora_desde" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fecha_hasta" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="hora_hasta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "EncabezadoGetSaldosCreadosMasivoxAlmacen", propOrder = {
    "fechaDesde",
    "horaDesde",
    "fechaHasta",
    "horaHasta",
    "almacen"
})
public class EncabezadoGetSaldosCreadosMasivoxAlmacen {

    @XmlElement(name = "fecha_desde", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaDesde;
    @XmlElement(name = "hora_desde", required = true)
    protected String horaDesde;
    @XmlElement(name = "fecha_hasta", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaHasta;
    @XmlElement(name = "hora_hasta", required = true)
    protected String horaHasta;
    @XmlElement(required = true)
    protected BigInteger almacen;

    /**
     * Obtiene el valor de la propiedad fechaDesde.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaDesde() {
        return fechaDesde;
    }

    /**
     * Define el valor de la propiedad fechaDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaDesde(XMLGregorianCalendar value) {
        this.fechaDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad horaDesde.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraDesde() {
        return horaDesde;
    }

    /**
     * Define el valor de la propiedad horaDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraDesde(String value) {
        this.horaDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaHasta.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHasta() {
        return fechaHasta;
    }

    /**
     * Define el valor de la propiedad fechaHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHasta(XMLGregorianCalendar value) {
        this.fechaHasta = value;
    }

    /**
     * Obtiene el valor de la propiedad horaHasta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraHasta() {
        return horaHasta;
    }

    /**
     * Define el valor de la propiedad horaHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraHasta(String value) {
        this.horaHasta = value;
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
