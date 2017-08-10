
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
 *         &lt;element name="EncabezadoMascota" type="{http://tempuri.org/}EncabezadoMascota"/&gt;
 *         &lt;element name="DetalleMascota" type="{http://tempuri.org/}ArrayOfMascotaModificacion" minOccurs="0"/&gt;
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
    "encabezadoMascota",
    "detalleMascota"
})
@XmlRootElement(name = "SetModificacionMascota")
public class SetModificacionMascota {

    @XmlElement(name = "Authentication")
    protected AuthenticationSoapHeader authentication;
    @XmlElement(name = "EncabezadoMascota", required = true)
    protected EncabezadoMascota encabezadoMascota;
    @XmlElement(name = "DetalleMascota")
    protected ArrayOfMascotaModificacion detalleMascota;

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
     * Obtiene el valor de la propiedad encabezadoMascota.
     * 
     * @return
     *     possible object is
     *     {@link EncabezadoMascota }
     *     
     */
    public EncabezadoMascota getEncabezadoMascota() {
        return encabezadoMascota;
    }

    /**
     * Define el valor de la propiedad encabezadoMascota.
     * 
     * @param value
     *     allowed object is
     *     {@link EncabezadoMascota }
     *     
     */
    public void setEncabezadoMascota(EncabezadoMascota value) {
        this.encabezadoMascota = value;
    }

    /**
     * Obtiene el valor de la propiedad detalleMascota.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMascotaModificacion }
     *     
     */
    public ArrayOfMascotaModificacion getDetalleMascota() {
        return detalleMascota;
    }

    /**
     * Define el valor de la propiedad detalleMascota.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMascotaModificacion }
     *     
     */
    public void setDetalleMascota(ArrayOfMascotaModificacion value) {
        this.detalleMascota = value;
    }

}
