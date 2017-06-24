
package com.productos.integracion.mahalo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EncabezadoGetSaldosCreadosMasivo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EncabezadoGetSaldosCreadosMasivo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fecha_desde" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="hora_desde" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fecha_hasta" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="hora_hasta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncabezadoGetSaldosCreadosMasivo", propOrder = {
    "fechaDesde",
    "horaDesde",
    "fechaHasta",
    "horaHasta"
})
public class EncabezadoGetSaldosCreadosMasivo {

    @XmlElement(name = "fecha_desde", required = true)
    @XmlSchemaType(name = "date")
    protected String fechaDesde;
    @XmlElement(name = "hora_desde", required = true)
    protected String horaDesde;
    @XmlElement(name = "fecha_hasta", required = true)
    @XmlSchemaType(name = "date")
    protected String fechaHasta;
    @XmlElement(name = "hora_hasta", required = true)
    protected String horaHasta;

    /**
     * Obtiene el valor de la propiedad fechaDesde.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaDesde() {
        return fechaDesde;
    }

    /**
     * Define el valor de la propiedad fechaDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaDesde(String value) {
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
     *     {@link String }
     *     
     */
    public String getFechaHasta() {
        return fechaHasta;
    }

    /**
     * Define el valor de la propiedad fechaHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaHasta(String value) {
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

}
