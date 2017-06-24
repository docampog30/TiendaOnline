
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
 *         &lt;element name="DetalleMReferencias" type="{http://tempuri.org/}ArrayDeMultiplesReferencias" minOccurs="0"/&gt;
 *         &lt;element name="sw_validaRefProveedor" type="{http://tempuri.org/}Sw_ValidaRefProveedor" minOccurs="0"/&gt;
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
    "detalleMReferencias",
    "swValidaRefProveedor"
})
@XmlRootElement(name = "SetModificarMultiplesReferencias")
public class SetModificarMultiplesReferencias {

    @XmlElement(name = "Authentication")
    protected AuthenticationSoapHeader authentication;
    @XmlElement(name = "DetalleMReferencias")
    protected ArrayDeMultiplesReferencias detalleMReferencias;
    @XmlElement(name = "sw_validaRefProveedor")
    protected SwValidaRefProveedor swValidaRefProveedor;

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
     * Obtiene el valor de la propiedad detalleMReferencias.
     * 
     * @return
     *     possible object is
     *     {@link ArrayDeMultiplesReferencias }
     *     
     */
    public ArrayDeMultiplesReferencias getDetalleMReferencias() {
        return detalleMReferencias;
    }

    /**
     * Define el valor de la propiedad detalleMReferencias.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayDeMultiplesReferencias }
     *     
     */
    public void setDetalleMReferencias(ArrayDeMultiplesReferencias value) {
        this.detalleMReferencias = value;
    }

    /**
     * Obtiene el valor de la propiedad swValidaRefProveedor.
     * 
     * @return
     *     possible object is
     *     {@link SwValidaRefProveedor }
     *     
     */
    public SwValidaRefProveedor getSwValidaRefProveedor() {
        return swValidaRefProveedor;
    }

    /**
     * Define el valor de la propiedad swValidaRefProveedor.
     * 
     * @param value
     *     allowed object is
     *     {@link SwValidaRefProveedor }
     *     
     */
    public void setSwValidaRefProveedor(SwValidaRefProveedor value) {
        this.swValidaRefProveedor = value;
    }

}
