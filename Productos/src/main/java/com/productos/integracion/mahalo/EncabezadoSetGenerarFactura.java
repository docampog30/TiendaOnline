
package com.productos.integracion.mahalo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EncabezadoSetGenerarFactura complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EncabezadoSetGenerarFactura"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cedula" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="fecha_factura" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="valor_total" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="valor_iva_total" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="num_pedido_externo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sw_valida_forma_pago" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncabezadoSetGenerarFactura", propOrder = {
    "cedula",
    "fechaFactura",
    "valorTotal",
    "valorIvaTotal",
    "numPedidoExterno",
    "swValidaFormaPago"
})
public class EncabezadoSetGenerarFactura {

    protected int cedula;
    @XmlElement(name = "fecha_factura", required = true)
    protected String fechaFactura;
    @XmlElement(name = "valor_total", required = true)
    protected String valorTotal;
    @XmlElement(name = "valor_iva_total", required = true)
    protected String valorIvaTotal;
    @XmlElement(name = "num_pedido_externo")
    protected String numPedidoExterno;
    @XmlElement(name = "sw_valida_forma_pago", required = true)
    protected String swValidaFormaPago;

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

    /**
     * Obtiene el valor de la propiedad fechaFactura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaFactura() {
        return fechaFactura;
    }

    /**
     * Define el valor de la propiedad fechaFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaFactura(String value) {
        this.fechaFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad valorTotal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorTotal() {
        return valorTotal;
    }

    /**
     * Define el valor de la propiedad valorTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorTotal(String value) {
        this.valorTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad valorIvaTotal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorIvaTotal() {
        return valorIvaTotal;
    }

    /**
     * Define el valor de la propiedad valorIvaTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorIvaTotal(String value) {
        this.valorIvaTotal = value;
    }

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

    /**
     * Obtiene el valor de la propiedad swValidaFormaPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwValidaFormaPago() {
        return swValidaFormaPago;
    }

    /**
     * Define el valor de la propiedad swValidaFormaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwValidaFormaPago(String value) {
        this.swValidaFormaPago = value;
    }

}
