
package com.productos.integracion.mahalo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FormaPagoFactura complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FormaPagoFactura"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="num_aprobacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="observacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="puntos_resta" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormaPagoFactura", propOrder = {
    "codigo",
    "valor",
    "numAprobacion",
    "observacion",
    "puntosResta"
})
public class FormaPagoFactura {

    protected int codigo;
    @XmlElement(required = true)
    protected String valor;
    @XmlElement(name = "num_aprobacion", required = true)
    protected String numAprobacion;
    @XmlElement(required = true)
    protected String observacion;
    @XmlElement(name = "puntos_resta")
    protected Integer puntosResta;

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     */
    public void setCodigo(int value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad valor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValor() {
        return valor;
    }

    /**
     * Define el valor de la propiedad valor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValor(String value) {
        this.valor = value;
    }

    /**
     * Obtiene el valor de la propiedad numAprobacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumAprobacion() {
        return numAprobacion;
    }

    /**
     * Define el valor de la propiedad numAprobacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumAprobacion(String value) {
        this.numAprobacion = value;
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
     * Obtiene el valor de la propiedad puntosResta.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPuntosResta() {
        return puntosResta;
    }

    /**
     * Define el valor de la propiedad puntosResta.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPuntosResta(Integer value) {
        this.puntosResta = value;
    }

}
