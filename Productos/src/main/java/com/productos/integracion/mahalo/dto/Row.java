package com.productos.integracion.mahalo.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

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
}
