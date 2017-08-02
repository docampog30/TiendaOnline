
package com.productos.integracion.mahalo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EncabezadoSetGenerarKardex complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EncabezadoSetGenerarKardex"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="c_almacen" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="c_concepto_mov" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="c_destino" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="fecha_kardex" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cedula" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="factura" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="valor_total" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="observacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncabezadoSetGenerarKardex", propOrder = {
    "cAlmacen",
    "cConceptoMov",
    "cDestino",
    "fechaKardex",
    "nit",
    "cedula",
    "factura",
    "valorTotal",
    "observacion"
})
public class EncabezadoSetGenerarKardex {

    @XmlElement(name = "c_almacen")
    protected int cAlmacen;
    @XmlElement(name = "c_concepto_mov", required = true)
    protected String cConceptoMov;
    @XmlElement(name = "c_destino")
    protected int cDestino;
    @XmlElement(name = "fecha_kardex", required = true)
    protected String fechaKardex;
    protected int nit;
    protected int cedula;
    @XmlElement(required = true)
    protected String factura;
    @XmlElement(name = "valor_total", required = true)
    protected String valorTotal;
    @XmlElement(required = true)
    protected String observacion;

    /**
     * Obtiene el valor de la propiedad cAlmacen.
     * 
     */
    public int getCAlmacen() {
        return cAlmacen;
    }

    /**
     * Define el valor de la propiedad cAlmacen.
     * 
     */
    public void setCAlmacen(int value) {
        this.cAlmacen = value;
    }

    /**
     * Obtiene el valor de la propiedad cConceptoMov.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCConceptoMov() {
        return cConceptoMov;
    }

    /**
     * Define el valor de la propiedad cConceptoMov.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCConceptoMov(String value) {
        this.cConceptoMov = value;
    }

    /**
     * Obtiene el valor de la propiedad cDestino.
     * 
     */
    public int getCDestino() {
        return cDestino;
    }

    /**
     * Define el valor de la propiedad cDestino.
     * 
     */
    public void setCDestino(int value) {
        this.cDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaKardex.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaKardex() {
        return fechaKardex;
    }

    /**
     * Define el valor de la propiedad fechaKardex.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaKardex(String value) {
        this.fechaKardex = value;
    }

    /**
     * Obtiene el valor de la propiedad nit.
     * 
     */
    public int getNit() {
        return nit;
    }

    /**
     * Define el valor de la propiedad nit.
     * 
     */
    public void setNit(int value) {
        this.nit = value;
    }

    /**
     * Obtiene el valor de la propiedad cedula.
     * 
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * Define el valor de la propiedad cedula.
     * 
     */
    public void setCedula(int value) {
        this.cedula = value;
    }

    /**
     * Obtiene el valor de la propiedad factura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactura() {
        return factura;
    }

    /**
     * Define el valor de la propiedad factura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactura(String value) {
        this.factura = value;
    }

    /**
     * Obtiene el valor de la propiedad valorTotal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorTotal() {
        return valorTotal;
    }

    /**
     * Define el valor de la propiedad valorTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorTotal(String value) {
        this.valorTotal = value;
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

}
