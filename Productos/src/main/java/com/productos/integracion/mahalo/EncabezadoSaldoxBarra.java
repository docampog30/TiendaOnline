
package com.productos.integracion.mahalo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EncabezadoSaldoxBarra complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EncabezadoSaldoxBarra"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="barra" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncabezadoSaldoxBarra", propOrder = {
    "barra"
})
public class EncabezadoSaldoxBarra {

    @XmlElement(required = true)
    protected String barra;

    /**
     * Obtiene el valor de la propiedad barra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarra() {
        return barra;
    }

    /**
     * Define el valor de la propiedad barra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarra(String value) {
        this.barra = value;
    }

}
