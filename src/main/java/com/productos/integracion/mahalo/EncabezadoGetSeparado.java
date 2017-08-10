
package com.productos.integracion.mahalo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EncabezadoGetSeparado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EncabezadoGetSeparado"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="n_separado_existente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncabezadoGetSeparado", propOrder = {
    "nSeparadoExistente"
})
public class EncabezadoGetSeparado {

    @XmlElement(name = "n_separado_existente")
    protected String nSeparadoExistente;

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

}
