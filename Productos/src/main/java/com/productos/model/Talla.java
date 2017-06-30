package com.productos.model;

public class Talla {
	private String descripcion;
	private int cantidad;
	
	public Talla(String key, Integer value) {
		this.descripcion = key;
		this.cantidad = value;
	}
	public Talla() {
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
}
