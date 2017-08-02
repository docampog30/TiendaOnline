
package com.productos.integracion.mahalo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Authentication" type="{http://tempuri.org/}AuthenticationSoapHeader" minOccurs="0"/&gt;
 *         &lt;element name="DetalleMPlu" type="{http://tempuri.org/}ArrayDeMultiplesPlu" minOccurs="0"/&gt;
 *         &lt;element name="sw_generaPlu" type="{http://tempuri.org/}sw_generaPlu" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "authentication",
    "detalleMPlu",
    "swGeneraPlu"
})
@XmlRootElement(name = "SetCrearMultiplesPlu")
public class SetCrearMultiplesPlu {

    @XmlElement(name = "Authentication")
    protected AuthenticationSoapHeader authentication;
    @XmlElement(name = "DetalleMPlu")
    protected ArrayDeMultiplesPlu detalleMPlu;
    @XmlElement(name = "sw_generaPlu")
    protected SwGeneraPlu swGeneraPlu;

    /**
     * Obtiene el valor de la propiedad authentication.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationSoapHeader }
     *     
     */
    public AuthenticationSoapHeader getAuthentication() {
        return authentication;
    }

    /**
     * Define el valor de la propiedad authentication.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationSoapHeader }
     *     
     */
    public void setAuthentication(AuthenticationSoapHeader value) {
        this.authentication = value;
    }

    /**
     * Obtiene el valor de la propiedad detalleMPlu.
     * 
     * @return
     *     possible object is
     *     {@link ArrayDeMultiplesPlu }
     *     
     */
    public ArrayDeMultiplesPlu getDetalleMPlu() {
        return detalleMPlu;
    }

    /**
     * Define el valor de la propiedad detalleMPlu.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayDeMultiplesPlu }
     *     
     */
    public void setDetalleMPlu(ArrayDeMultiplesPlu value) {
        this.detalleMPlu = value;
    }

    /**
     * Obtiene el valor de la propiedad swGeneraPlu.
     * 
     * @return
     *     possible object is
     *     {@link SwGeneraPlu }
     *     
     */
    public SwGeneraPlu getSwGeneraPlu() {
        return swGeneraPlu;
    }

    /**
     * Define el valor de la propiedad swGeneraPlu.
     * 
     * @param value
     *     allowed object is
     *     {@link SwGeneraPlu }
     *     
     */
    public void setSwGeneraPlu(SwGeneraPlu value) {
        this.swGeneraPlu = value;
    }

}
