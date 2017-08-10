
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
 *         &lt;element name="Authentication" type="{http://tempuri.org/}AuthenticationSoapHeader" minOccurs="0"/&gt;
 *         &lt;element name="ListaDePrecios" type="{http://tempuri.org/}ArrayOfListaPrecios"/&gt;
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
    "authentication",
    "listaDePrecios"
})
@XmlRootElement(name = "setMultiplesListaDePrecios")
public class SetMultiplesListaDePrecios {

    @XmlElement(name = "Authentication")
    protected AuthenticationSoapHeader authentication;
    @XmlElement(name = "ListaDePrecios", required = true)
    protected ArrayOfListaPrecios listaDePrecios;

    /**
     * Obtiene el valor de la propiedad authentication.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationSoapHeader }
     *     
     */
    public AuthenticationSoapHeader getAuthentication() {
        return authentication;
    }

    /**
     * Define el valor de la propiedad authentication.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationSoapHeader }
     *     
     */
    public void setAuthentication(AuthenticationSoapHeader value) {
        this.authentication = value;
    }

    /**
     * Obtiene el valor de la propiedad listaDePrecios.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfListaPrecios }
     *     
     */
    public ArrayOfListaPrecios getListaDePrecios() {
        return listaDePrecios;
    }

    /**
     * Define el valor de la propiedad listaDePrecios.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfListaPrecios }
     *     
     */
    public void setListaDePrecios(ArrayOfListaPrecios value) {
        this.listaDePrecios = value;
    }

}
