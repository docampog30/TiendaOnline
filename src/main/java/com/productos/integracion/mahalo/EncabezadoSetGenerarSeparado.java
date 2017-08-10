
package com.productos.integracion.mahalo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EncabezadoSetGenerarSeparado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EncabezadoSetGenerarSeparado"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="n_separado_existente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="c_almacen" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="caja" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cedula" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="id_mascota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valor_total" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fecha_separado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fecha_vence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecha_entrega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="observacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="vendedor_general" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncabezadoSetGenerarSeparado", propOrder = {
    "nSeparadoExistente",
    "cAlmacen",
    "caja",
    "cedula",
    "idMascota",
    "valorTotal",
    "fechaSeparado",
    "fechaVence",
    "fechaEntrega",
    "observacion",
    "vendedorGeneral"
})
public class EncabezadoSetGenerarSeparado {

    @XmlElement(name = "n_separado_existente")
    protected String nSeparadoExistente;
    @XmlElement(name = "c_almacen")
    protected int cAlmacen;
    protected int caja;
    protected int cedula;
    @XmlElement(name = "id_mascota")
    protected String idMascota;
    @XmlElement(name = "valor_total", required = true)
    protected String valorTotal;
    @XmlElement(name = "fecha_separado", required = true)
    protected String fechaSeparado;
    @XmlElement(name = "fecha_vence")
    protected String fechaVence;
    @XmlElement(name = "fecha_entrega")
    protected String fechaEntrega;
    @XmlElement(required = true)
    protected String observacion;
    @XmlElement(name = "vendedor_general")
    protected String vendedorGeneral;

    /**
     * Obtiene el valor de la propiedad nSeparadoExistente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNSeparadoExistente() {
        return nSeparadoExistente;
    }

    /**
     * Define el valor de la propiedad nSeparadoExistente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNSeparadoExistente(String value) {
        this.nSeparadoExistente = value;
    }

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
     * Obtiene el valor de la propiedad caja.
     * 
     */
    public int getCaja() {
        return caja;
    }

    /**
     * Define el valor de la propiedad caja.
     * 
     */
    public void setCaja(int value) {
        this.caja = value;
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
     * Obtiene el valor de la propiedad idMascota.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdMascota() {
        return idMascota;
    }

    /**
     * Define el valor de la propiedad idMascota.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdMascota(String value) {
        this.idMascota = value;
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
     * Obtiene el valor de la propiedad fechaSeparado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaSeparado() {
        return fechaSeparado;
    }

    /**
     * Define el valor de la propiedad fechaSeparado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaSeparado(String value) {
        this.fechaSeparado = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVence.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaVence() {
        return fechaVence;
    }

    /**
     * Define el valor de la propiedad fechaVence.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaVence(String value) {
        this.fechaVence = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEntrega.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaEntrega() {
        return fechaEntrega;
    }

    /**
     * Define el valor de la propiedad fechaEntrega.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaEntrega(String value) {
        this.fechaEntrega = value;
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
     * Obtiene el valor de la propiedad vendedorGeneral.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendedorGeneral() {
        return vendedorGeneral;
    }

    /**
     * Define el valor de la propiedad vendedorGeneral.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendedorGeneral(String value) {
        this.vendedorGeneral = value;
    }

}
