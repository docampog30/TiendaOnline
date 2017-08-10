
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
 *         &lt;element name="ResultadoTicket" type="{http://tempuri.org/}ResultadoWS"/&gt;
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
    "resultadoTicket"
})
@XmlRootElement(name = "TicketResponse")
public class TicketResponse {

    @XmlElement(name = "ResultadoTicket", required = true)
    protected ResultadoWS resultadoTicket;

    /**
     * Obtiene el valor de la propiedad resultadoTicket.
     * 
     * @return
     *     possible object is
     *     {@link ResultadoWS }
     *     
     */
    public ResultadoWS getResultadoTicket() {
        return resultadoTicket;
    }

    /**
     * Define el valor de la propiedad resultadoTicket.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultadoWS }
     *     
     */
    public void setResultadoTicket(ResultadoWS value) {
        this.resultadoTicket = value;
    }

	@Override
	public String toString() {
		return "TicketResponse [resultadoTicket=" + resultadoTicket + "]";
	}
    
    

}
