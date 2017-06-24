package com.productos.model;

public class Producto {
	private String descripcion;
	private Integer saldo;
	private String talla;
	private String almacen;
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getSaldo() {
		return saldo;
	}
	public void setSaldo(Integer saldo) {
		this.saldo = saldo;
	}
	public String getTalla() {
		return talla;
	}
	public void setTalla(String talla) {
		this.talla = talla;
	}
	public String getAlmacen() {
		return almacen;
	}
	public void setAlmacen(String almacen) {
		this.almacen = almacen;
	}
	@Override
	public String toString() {
		return "Productos [descripcion=" + descripcion + ", saldo=" + saldo + ", talla=" + talla + ", almacen="
				+ almacen + "]";
	}
	
}