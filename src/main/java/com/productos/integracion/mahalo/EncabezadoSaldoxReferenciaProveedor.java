
package com.productos.integracion.mahalo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EncabezadoSaldoxReferenciaProveedor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EncabezadoSaldoxReferenciaProveedor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="referenciaProveedor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncabezadoSaldoxReferenciaProveedor", propOrder = {
    "referenciaProveedor"
})
public class EncabezadoSaldoxReferenciaProveedor {

    @XmlElement(required = true)
    protected String referenciaProveedor;

    /**
     * Obtiene el valor de la propiedad referenciaProveedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenciaProveedor() {
        return referenciaProveedor;
    }

    /**
     * Define el valor de la propiedad referenciaProveedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenciaProveedor(String value) {
        this.referenciaProveedor = value;
    }

}
