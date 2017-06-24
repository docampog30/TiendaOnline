
package com.productos.integracion.mahalo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EncabezadoSetCrearFormaPagoFactura complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EncabezadoSetCrearFormaPagoFactura"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="num_pedido_externo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncabezadoSetCrearFormaPagoFactura", propOrder = {
    "numPedidoExterno"
})
public class EncabezadoSetCrearFormaPagoFactura {

    @XmlElement(name = "num_pedido_externo", required = true)
    protected String numPedidoExterno;

    /**
     * Obtiene el valor de la propiedad numPedidoExterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumPedidoExterno() {
        return numPedidoExterno;
    }

    /**
     * Define el valor de la propiedad numPedidoExterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumPedidoExterno(String value) {
        this.numPedidoExterno = value;
    }

}
