package com.productos.integracion.mahalo.dto;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

public class Row {
	
	@XStreamAsAttribute
	private String almacen;
	
	@XStreamAsAttribute
	private String sku;
	
	@XStreamAsAttribute
	private String barra;

	@XStreamAsAttribute
	private String descripcion;
	
	@XStreamAsAttribute
	private String valor;
	
	@XStreamAsAttribute
	private String talla;
	
	@XStreamAsAttribute
	private String marca;
	
	@XStreamAsAttribute
	private String referenciaprov;
	
	@XStreamAsAttribute
	private String codproducto;
	
	@XStreamAsAttribute
	private String linea;
	
	@XStreamAsAttribute
	private String categoria;
	
	private Integer saldo;

	
	public String getReferenciaprov() {
		return referenciaprov;
	}

	public void setReferenciaprov(String referenciaprov) {
		this.referenciaprov = referenciaprov;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	

	public String getAlmacen() {
		return almacen;
	}

	public void setAlmacen(String almacen) {
		this.almacen = almacen;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getBarra() {
		return barra;
	}

	public void setBarra(String barra) {
		this.barra = barra;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}
	
	public String getMarca() {
		return marca;
	}

	public Integer getSaldo() {
		return saldo;
	}

	public void setSaldo(String saldo) {
		this.saldo = Integer.valueOf(saldo.replace(".0", ""));
	}

	public String getCodproducto() {
		return codproducto;
	}

	public void setCodproducto(String codproducto) {
		this.codproducto = codproducto;
	}

	public String getLinea() {
		return linea;
	}

	public void setLinea(String linea) {
		this.linea = linea;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void setSaldo(Integer saldo) {
		this.saldo = saldo;
	}
	
	
}
