
package com.productos.integracion.mahalo;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para EncabezadoPlanoContableAXR complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EncabezadoPlanoContableAXR"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="num_diario" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fecha_ini" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="fecha_fin" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="c_almacen" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sw_costo" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="numero_decimales" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="separador" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncabezadoPlanoContableAXR", propOrder = {
    "numDiario",
    "fechaIni",
    "fechaFin",
    "cAlmacen",
    "swCosto",
    "numeroDecimales",
    "separador"
})
public class EncabezadoPlanoContableAXR {

    @XmlElement(name = "num_diario", required = true)
    protected String numDiario;
    @XmlElement(name = "fecha_ini", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaIni;
    @XmlElement(name = "fecha_fin", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaFin;
    @XmlElement(name = "c_almacen", required = true)
    protected String cAlmacen;
    @XmlElement(name = "sw_costo", required = true)
    protected BigInteger swCosto;
    @XmlElement(name = "numero_decimales", required = true)
    protected BigInteger numeroDecimales;
    @XmlElement(required = true)
    protected String separador;

    /**
     * Obtiene el valor de la propiedad numDiario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumDiario() {
        return numDiario;
    }

    /**
     * Define el valor de la propiedad numDiario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumDiario(String value) {
        this.numDiario = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaIni.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaIni() {
        return fechaIni;
    }

    /**
     * Define el valor de la propiedad fechaIni.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaIni(XMLGregorianCalendar value) {
        this.fechaIni = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaFin.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaFin() {
        return fechaFin;
    }

    /**
     * Define el valor de la propiedad fechaFin.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaFin(XMLGregorianCalendar value) {
        this.fechaFin = value;
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
     * Obtiene el valor de la propiedad swCosto.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSwCosto() {
        return swCosto;
    }

    /**
     * Define el valor de la propiedad swCosto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSwCosto(BigInteger value) {
        this.swCosto = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDecimales.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumeroDecimales() {
        return numeroDecimales;
    }

    /**
     * Define el valor de la propiedad numeroDecimales.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumeroDecimales(BigInteger value) {
        this.numeroDecimales = value;
    }

    /**
     * Obtiene el valor de la propiedad separador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeparador() {
        return separador;
    }

    /**
     * Define el valor de la propiedad separador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeparador(String value) {
        this.separador = value;
    }

}
