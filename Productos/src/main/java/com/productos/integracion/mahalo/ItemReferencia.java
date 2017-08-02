
package com.productos.integracion.mahalo;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para itemReferencia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="itemReferencia"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="c_referencia" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="d_referencia_prov" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="d_referencia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="c_proveedor" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="c_marca" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="c_linea" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="c_categoria" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="c_subcategoria" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="c_segmento" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="c_sector" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="c_grupo_talla" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="c_coleccion" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="c_material" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="c_beneficio" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="c_clasificacion" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="iva" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="pr_compra" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="pr_venta" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="pr_ponderado" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="unidad_empaque" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="presentacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ptg_max_dscto" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="b_cambia_precio" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="categoria" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="b_kit" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="b_explocion" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="b_promocion" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="ubicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="c_unidad_medida" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dscto_vta" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="b_surtido" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="b_precio_max" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="consumo" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="decimal" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="sw_serial" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="sw_valida_max_dscto" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="sw_venta_negativa" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemReferencia", propOrder = {
    "cReferencia",
    "dReferenciaProv",
    "dReferencia",
    "cProveedor",
    "cMarca",
    "cLinea",
    "cCategoria",
    "cSubcategoria",
    "cSegmento",
    "cSector",
    "cGrupoTalla",
    "cColeccion",
    "cMaterial",
    "cBeneficio",
    "cClasificacion",
    "iva",
    "prCompra",
    "prVenta",
    "prPonderado",
    "unidadEmpaque",
    "presentacion",
    "ptgMaxDscto",
    "bCambiaPrecio",
    "categoria",
    "bKit",
    "bExplocion",
    "bPromocion",
    "ubicacion",
    "cUnidadMedida",
    "dsctoVta",
    "bSurtido",
    "bPrecioMax",
    "consumo",
    "decimal",
    "swSerial",
    "swValidaMaxDscto",
    "swVentaNegativa"
})
public class ItemReferencia {

    @XmlElement(name = "c_referencia", required = true)
    protected BigInteger cReferencia;
    @XmlElement(name = "d_referencia_prov", required = true)
    protected String dReferenciaProv;
    @XmlElement(name = "d_referencia", required = true)
    protected String dReferencia;
    @XmlElement(name = "c_proveedor", required = true)
    protected BigInteger cProveedor;
    @XmlElement(name = "c_marca", required = true)
    protected BigInteger cMarca;
    @XmlElement(name = "c_linea", required = true)
    protected BigInteger cLinea;
    @XmlElement(name = "c_categoria", required = true)
    protected BigInteger cCategoria;
    @XmlElement(name = "c_subcategoria", required = true)
    protected BigInteger cSubcategoria;
    @XmlElement(name = "c_segmento", required = true)
    protected BigInteger cSegmento;
    @XmlElement(name = "c_sector", required = true)
    protected BigInteger cSector;
    @XmlElement(name = "c_grupo_talla", required = true)
    protected BigInteger cGrupoTalla;
    @XmlElement(name = "c_coleccion", required = true)
    protected BigInteger cColeccion;
    @XmlElement(name = "c_material", required = true)
    protected BigInteger cMaterial;
    @XmlElement(name = "c_beneficio", required = true)
    protected BigInteger cBeneficio;
    @XmlElement(name = "c_clasificacion", required = true)
    protected BigInteger cClasificacion;
    @XmlElement(required = true)
    protected BigDecimal iva;
    @XmlElement(name = "pr_compra", required = true)
    protected BigDecimal prCompra;
    @XmlElement(name = "pr_venta", required = true)
    protected BigDecimal prVenta;
    @XmlElement(name = "pr_ponderado", required = true)
    protected BigDecimal prPonderado;
    @XmlElement(name = "unidad_empaque", required = true)
    protected BigInteger unidadEmpaque;
    @XmlElement(required = true)
    protected String presentacion;
    @XmlElement(name = "ptg_max_dscto", required = true)
    protected BigDecimal ptgMaxDscto;
    @XmlElement(name = "b_cambia_precio", required = true)
    protected BigInteger bCambiaPrecio;
    @XmlElement(required = true)
    protected String categoria;
    @XmlElement(name = "b_kit", required = true)
    protected BigInteger bKit;
    @XmlElement(name = "b_explocion", required = true)
    protected BigInteger bExplocion;
    @XmlElement(name = "b_promocion", required = true)
    protected BigInteger bPromocion;
    @XmlElement(required = true)
    protected String ubicacion;
    @XmlElement(name = "c_unidad_medida", required = true)
    protected String cUnidadMedida;
    @XmlElement(name = "dscto_vta", required = true)
    protected BigDecimal dsctoVta;
    @XmlElement(name = "b_surtido", required = true)
    protected BigInteger bSurtido;
    @XmlElement(name = "b_precio_max", required = true)
    protected BigInteger bPrecioMax;
    @XmlElement(required = true)
    protected BigDecimal consumo;
    @XmlElement(required = true)
    protected BigInteger decimal;
    @XmlElement(name = "sw_serial", required = true)
    protected BigInteger swSerial;
    @XmlElement(name = "sw_valida_max_dscto", required = true)
    protected BigInteger swValidaMaxDscto;
    @XmlElement(name = "sw_venta_negativa", required = true)
    protected BigInteger swVentaNegativa;

    /**
     * Obtiene el valor de la propiedad cReferencia.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCReferencia() {
        return cReferencia;
    }

    /**
     * Define el valor de la propiedad cReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCReferencia(BigInteger value) {
        this.cReferencia = value;
    }

    /**
     * Obtiene el valor de la propiedad dReferenciaProv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDReferenciaProv() {
        return dReferenciaProv;
    }

    /**
     * Define el valor de la propiedad dReferenciaProv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDReferenciaProv(String value) {
        this.dReferenciaProv = value;
    }

    /**
     * Obtiene el valor de la propiedad dReferencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDReferencia() {
        return dReferencia;
    }

    /**
     * Define el valor de la propiedad dReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDReferencia(String value) {
        this.dReferencia = value;
    }

    /**
     * Obtiene el valor de la propiedad cProveedor.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCProveedor() {
        return cProveedor;
    }

    /**
     * Define el valor de la propiedad cProveedor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCProveedor(BigInteger value) {
        this.cProveedor = value;
    }

    /**
     * Obtiene el valor de la propiedad cMarca.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCMarca() {
        return cMarca;
    }

    /**
     * Define el valor de la propiedad cMarca.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCMarca(BigInteger value) {
        this.cMarca = value;
    }

    /**
     * Obtiene el valor de la propiedad cLinea.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCLinea() {
        return cLinea;
    }

    /**
     * Define el valor de la propiedad cLinea.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCLinea(BigInteger value) {
        this.cLinea = value;
    }

    /**
     * Obtiene el valor de la propiedad cCategoria.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCCategoria() {
        return cCategoria;
    }

    /**
     * Define el valor de la propiedad cCategoria.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCCategoria(BigInteger value) {
        this.cCategoria = value;
    }

    /**
     * Obtiene el valor de la propiedad cSubcategoria.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCSubcategoria() {
        return cSubcategoria;
    }

    /**
     * Define el valor de la propiedad cSubcategoria.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCSubcategoria(BigInteger value) {
        this.cSubcategoria = value;
    }

    /**
     * Obtiene el valor de la propiedad cSegmento.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCSegmento() {
        return cSegmento;
    }

    /**
     * Define el valor de la propiedad cSegmento.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCSegmento(BigInteger value) {
        this.cSegmento = value;
    }

    /**
     * Obtiene el valor de la propiedad cSector.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCSector() {
        return cSector;
    }

    /**
     * Define el valor de la propiedad cSector.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCSector(BigInteger value) {
        this.cSector = value;
    }

    /**
     * Obtiene el valor de la propiedad cGrupoTalla.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCGrupoTalla() {
        return cGrupoTalla;
    }

    /**
     * Define el valor de la propiedad cGrupoTalla.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCGrupoTalla(BigInteger value) {
        this.cGrupoTalla = value;
    }

    /**
     * Obtiene el valor de la propiedad cColeccion.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCColeccion() {
        return cColeccion;
    }

    /**
     * Define el valor de la propiedad cColeccion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCColeccion(BigInteger value) {
        this.cColeccion = value;
    }

    /**
     * Obtiene el valor de la propiedad cMaterial.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCMaterial() {
        return cMaterial;
    }

    /**
     * Define el valor de la propiedad cMaterial.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCMaterial(BigInteger value) {
        this.cMaterial = value;
    }

    /**
     * Obtiene el valor de la propiedad cBeneficio.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCBeneficio() {
        return cBeneficio;
    }

    /**
     * Define el valor de la propiedad cBeneficio.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCBeneficio(BigInteger value) {
        this.cBeneficio = value;
    }

    /**
     * Obtiene el valor de la propiedad cClasificacion.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCClasificacion() {
        return cClasificacion;
    }

    /**
     * Define el valor de la propiedad cClasificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCClasificacion(BigInteger value) {
        this.cClasificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad iva.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIva() {
        return iva;
    }

    /**
     * Define el valor de la propiedad iva.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIva(BigDecimal value) {
        this.iva = value;
    }

    /**
     * Obtiene el valor de la propiedad prCompra.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrCompra() {
        return prCompra;
    }

    /**
     * Define el valor de la propiedad prCompra.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrCompra(BigDecimal value) {
        this.prCompra = value;
    }

    /**
     * Obtiene el valor de la propiedad prVenta.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrVenta() {
        return prVenta;
    }

    /**
     * Define el valor de la propiedad prVenta.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrVenta(BigDecimal value) {
        this.prVenta = value;
    }

    /**
     * Obtiene el valor de la propiedad prPonderado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrPonderado() {
        return prPonderado;
    }

    /**
     * Define el valor de la propiedad prPonderado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrPonderado(BigDecimal value) {
        this.prPonderado = value;
    }

    /**
     * Obtiene el valor de la propiedad unidadEmpaque.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUnidadEmpaque() {
        return unidadEmpaque;
    }

    /**
     * Define el valor de la propiedad unidadEmpaque.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUnidadEmpaque(BigInteger value) {
        this.unidadEmpaque = value;
    }

    /**
     * Obtiene el valor de la propiedad presentacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentacion() {
        return presentacion;
    }

    /**
     * Define el valor de la propiedad presentacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentacion(String value) {
        this.presentacion = value;
    }

    /**
     * Obtiene el valor de la propiedad ptgMaxDscto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPtgMaxDscto() {
        return ptgMaxDscto;
    }

    /**
     * Define el valor de la propiedad ptgMaxDscto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPtgMaxDscto(BigDecimal value) {
        this.ptgMaxDscto = value;
    }

    /**
     * Obtiene el valor de la propiedad bCambiaPrecio.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBCambiaPrecio() {
        return bCambiaPrecio;
    }

    /**
     * Define el valor de la propiedad bCambiaPrecio.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBCambiaPrecio(BigInteger value) {
        this.bCambiaPrecio = value;
    }

    /**
     * Obtiene el valor de la propiedad categoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Define el valor de la propiedad categoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoria(String value) {
        this.categoria = value;
    }

    /**
     * Obtiene el valor de la propiedad bKit.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBKit() {
        return bKit;
    }

    /**
     * Define el valor de la propiedad bKit.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBKit(BigInteger value) {
        this.bKit = value;
    }

    /**
     * Obtiene el valor de la propiedad bExplocion.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBExplocion() {
        return bExplocion;
    }

    /**
     * Define el valor de la propiedad bExplocion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBExplocion(BigInteger value) {
        this.bExplocion = value;
    }

    /**
     * Obtiene el valor de la propiedad bPromocion.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBPromocion() {
        return bPromocion;
    }

    /**
     * Define el valor de la propiedad bPromocion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBPromocion(BigInteger value) {
        this.bPromocion = value;
    }

    /**
     * Obtiene el valor de la propiedad ubicacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * Define el valor de la propiedad ubicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUbicacion(String value) {
        this.ubicacion = value;
    }

    /**
     * Obtiene el valor de la propiedad cUnidadMedida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUnidadMedida() {
        return cUnidadMedida;
    }

    /**
     * Define el valor de la propiedad cUnidadMedida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUnidadMedida(String value) {
        this.cUnidadMedida = value;
    }

    /**
     * Obtiene el valor de la propiedad dsctoVta.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDsctoVta() {
        return dsctoVta;
    }

    /**
     * Define el valor de la propiedad dsctoVta.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDsctoVta(BigDecimal value) {
        this.dsctoVta = value;
    }

    /**
     * Obtiene el valor de la propiedad bSurtido.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBSurtido() {
        return bSurtido;
    }

    /**
     * Define el valor de la propiedad bSurtido.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBSurtido(BigInteger value) {
        this.bSurtido = value;
    }

    /**
     * Obtiene el valor de la propiedad bPrecioMax.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBPrecioMax() {
        return bPrecioMax;
    }

    /**
     * Define el valor de la propiedad bPrecioMax.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBPrecioMax(BigInteger value) {
        this.bPrecioMax = value;
    }

    /**
     * Obtiene el valor de la propiedad consumo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConsumo() {
        return consumo;
    }

    /**
     * Define el valor de la propiedad consumo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConsumo(BigDecimal value) {
        this.consumo = value;
    }

    /**
     * Obtiene el valor de la propiedad decimal.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDecimal() {
        return decimal;
    }

    /**
     * Define el valor de la propiedad decimal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDecimal(BigInteger value) {
        this.decimal = value;
    }

    /**
     * Obtiene el valor de la propiedad swSerial.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSwSerial() {
        return swSerial;
    }

    /**
     * Define el valor de la propiedad swSerial.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSwSerial(BigInteger value) {
        this.swSerial = value;
    }

    /**
     * Obtiene el valor de la propiedad swValidaMaxDscto.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSwValidaMaxDscto() {
        return swValidaMaxDscto;
    }

    /**
     * Define el valor de la propiedad swValidaMaxDscto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSwValidaMaxDscto(BigInteger value) {
        this.swValidaMaxDscto = value;
    }

    /**
     * Obtiene el valor de la propiedad swVentaNegativa.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSwVentaNegativa() {
        return swVentaNegativa;
    }

    /**
     * Define el valor de la propiedad swVentaNegativa.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSwVentaNegativa(BigInteger value) {
        this.swVentaNegativa = value;
    }

}
