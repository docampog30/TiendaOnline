
package com.productos.integracion.mahalo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EncabezadoSetCancelarPedido complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EncabezadoSetCancelarPedido"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="num_pedido_externo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncabezadoSetCancelarPedido", propOrder = {
    "numPedidoExterno"
})
public class EncabezadoSetCancelarPedido {

    @XmlElement(name = "num_pedido_externo")
    protected int numPedidoExterno;

    /**
     * Obtiene el valor de la propiedad numPedidoExterno.
     * 
     */
    public int getNumPedidoExterno() {
        return numPedidoExterno;
    }

    /**
     * Define el valor de la propiedad numPedidoExterno.
     * 
     */
    public void setNumPedidoExterno(int value) {
        this.numPedidoExterno = value;
    }

}
