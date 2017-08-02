
package com.productos.integracion.mahalo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EncabezadoSetModificacionPuntosCliente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EncabezadoSetModificacionPuntosCliente"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cedula" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="operacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="puntos" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncabezadoSetModificacionPuntosCliente", propOrder = {
    "cedula",
    "operacion",
    "puntos"
})
public class EncabezadoSetModificacionPuntosCliente {

    protected int cedula;
    @XmlElement(required = true)
    protected String operacion;
    @XmlElement(required = true)
    protected String puntos;

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
     * Obtiene el valor de la propiedad operacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperacion() {
        return operacion;
    }

    /**
     * Define el valor de la propiedad operacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperacion(String value) {
        this.operacion = value;
    }

    /**
     * Obtiene el valor de la propiedad puntos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPuntos() {
        return puntos;
    }

    /**
     * Define el valor de la propiedad puntos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPuntos(String value) {
        this.puntos = value;
    }

}
