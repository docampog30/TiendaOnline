
package com.productos.integracion.mahalo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para itemMascota complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="itemMascota"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigo_parentesco" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="peso" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="microchip" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="observacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fecha_nacimiento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sexo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="codigo_raza" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemMascota", propOrder = {
    "codigoParentesco",
    "nombre",
    "peso",
    "microchip",
    "observacion",
    "fechaNacimiento",
    "sexo",
    "codigoRaza"
})
public class ItemMascota {

    @XmlElement(name = "codigo_parentesco", required = true)
    protected String codigoParentesco;
    @XmlElement(required = true)
    protected String nombre;
    @XmlElement(required = true)
    protected String peso;
    @XmlElement(required = true)
    protected String microchip;
    @XmlElement(required = true)
    protected String observacion;
    @XmlElement(name = "fecha_nacimiento", required = true)
    protected String fechaNacimiento;
    @XmlElement(required = true)
    protected String sexo;
    @XmlElement(name = "codigo_raza", required = true)
    protected String codigoRaza;

    /**
     * Obtiene el valor de la propiedad codigoParentesco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoParentesco() {
        return codigoParentesco;
    }

    /**
     * Define el valor de la propiedad codigoParentesco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoParentesco(String value) {
        this.codigoParentesco = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad peso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeso() {
        return peso;
    }

    /**
     * Define el valor de la propiedad peso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeso(String value) {
        this.peso = value;
    }

    /**
     * Obtiene el valor de la propiedad microchip.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMicrochip() {
        return microchip;
    }

    /**
     * Define el valor de la propiedad microchip.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMicrochip(String value) {
        this.microchip = value;
    }

    /**
     * Obtiene el valor de la propiedad observacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacion() {
        return observacion;
    }

    /**
     * Define el valor de la propiedad observacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacion(String value) {
        this.observacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Define el valor de la propiedad fechaNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaNacimiento(String value) {
        this.fechaNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad sexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Define el valor de la propiedad sexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexo(String value) {
        this.sexo = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoRaza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoRaza() {
        return codigoRaza;
    }

    /**
     * Define el valor de la propiedad codigoRaza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoRaza(String value) {
        this.codigoRaza = value;
    }

}
