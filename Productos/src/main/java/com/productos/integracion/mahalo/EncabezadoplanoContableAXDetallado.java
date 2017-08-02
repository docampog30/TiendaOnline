
package com.productos.integracion.mahalo;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para EncabezadoplanoContableAX_detallado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EncabezadoplanoContableAX_detallado"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fecha_inicial" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="fecha_final" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="almacenes" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tipo_costo" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="numDiario" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "EncabezadoplanoContableAX_detallado", propOrder = {
    "fechaInicial",
    "fechaFinal",
    "almacenes",
    "tipoCosto",
    "numDiario",
    "numeroDecimales",
    "separador"
})
public class EncabezadoplanoContableAXDetallado {

    @XmlElement(name = "fecha_inicial", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaInicial;
    @XmlElement(name = "fecha_final", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaFinal;
    @XmlElement(required = true)
    protected String almacenes;
    @XmlElement(name = "tipo_costo", required = true)
    protected BigInteger tipoCosto;
    @XmlElement(required = true)
    protected String numDiario;
    @XmlElement(name = "numero_decimales", required = true)
    protected BigInteger numeroDecimales;
    @XmlElement(required = true)
    protected String separador;

    /**
     * Obtiene el valor de la propiedad fechaInicial.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaInicial() {
        return fechaInicial;
    }

    /**
     * Define el valor de la propiedad fechaInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaInicial(XMLGregorianCalendar value) {
        this.fechaInicial = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaFinal.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaFinal() {
        return fechaFinal;
    }

    /**
     * Define el valor de la propiedad fechaFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaFinal(XMLGregorianCalendar value) {
        this.fechaFinal = value;
    }

    /**
     * Obtiene el valor de la propiedad almacenes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlmacenes() {
        return almacenes;
    }

    /**
     * Define el valor de la propiedad almacenes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlmacenes(String value) {
        this.almacenes = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCosto.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTipoCosto() {
        return tipoCosto;
    }

    /**
     * Define el valor de la propiedad tipoCosto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTipoCosto(BigInteger value) {
        this.tipoCosto = value;
    }

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
