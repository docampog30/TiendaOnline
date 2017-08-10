
package com.productos.integracion.mahalo;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EncabezadoSaldoxReferenciaProveedorAlmacen complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EncabezadoSaldoxReferenciaProveedorAlmacen"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="referenciaProveedor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="almacen" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncabezadoSaldoxReferenciaProveedorAlmacen", propOrder = {
    "referenciaProveedor",
    "almacen"
})
public class EncabezadoSaldoxReferenciaProveedorAlmacen {

    @XmlElement(required = true)
    protected String referenciaProveedor;
    @XmlElement(required = true)
    protected BigInteger almacen;

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

    /**
     * Obtiene el valor de la propiedad almacen.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAlmacen() {
        return almacen;
    }

    /**
     * Define el valor de la propiedad almacen.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAlmacen(BigInteger value) {
        this.almacen = value;
    }

}
