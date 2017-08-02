
package com.productos.integracion.mahalo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ResultadoWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ResultadoWS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodErr" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Datos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultadoWS", propOrder = {
    "codErr",
    "mensaje",
    "datos"
})
public class ResultadoWS {

    @XmlElement(name = "CodErr")
    protected int codErr;
    @XmlElement(name = "Mensaje")
    protected String mensaje;
    @XmlElement(name = "Datos")
    protected String datos;

    /**
     * Obtiene el valor de la propiedad codErr.
     * 
     */
    public int getCodErr() {
        return codErr;
    }

    /**
     * Define el valor de la propiedad codErr.
     * 
     */
    public void setCodErr(int value) {
        this.codErr = value;
    }

    /**
     * Obtiene el valor de la propiedad mensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Define el valor de la propiedad mensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensaje(String value) {
        this.mensaje = value;
    }

    /**
     * Obtiene el valor de la propiedad datos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatos() {
        return datos;
    }

    /**
     * Define el valor de la propiedad datos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatos(String value) {
        this.datos = value;
    }

	@Override
	public String toString() {
		return "ResultadoWS [codErr=" + codErr + ", mensaje=" + mensaje + ", datos=" + datos + "]";
	}
    
    

}
