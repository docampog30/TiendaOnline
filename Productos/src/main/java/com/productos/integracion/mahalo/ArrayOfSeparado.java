
package com.productos.integracion.mahalo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfSeparado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSeparado"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="itemSeparado" type="{http://tempuri.org/}itemSeparado" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSeparado", propOrder = {
    "itemSeparado"
})
public class ArrayOfSeparado {

    protected List<ItemSeparado> itemSeparado;

    /**
     * Gets the value of the itemSeparado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemSeparado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemSeparado().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemSeparado }
     * 
     * 
     */
    public List<ItemSeparado> getItemSeparado() {
        if (itemSeparado == null) {
            itemSeparado = new ArrayList<ItemSeparado>();
        }
        return this.itemSeparado;
    }

}
