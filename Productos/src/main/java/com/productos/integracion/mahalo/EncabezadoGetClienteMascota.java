
package com.productos.integracion.mahalo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EncabezadoGetClienteMascota complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EncabezadoGetClienteMascota"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cedula" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncabezadoGetClienteMascota", propOrder = {
    "cedula"
})
public class EncabezadoGetClienteMascota {

    protected int cedula;

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

}
