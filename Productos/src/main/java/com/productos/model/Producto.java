package com.productos.model;

import java.util.ArrayList;
import java.util.List;

public class Producto {
	private String descripcion;
	private Integer saldo;
	private List<Talla> tallas;
	private List<String> almacenes;
	
	private String linea;
	private String sexo;
	private String marca;
	private String referenciaProov;
	
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
	public List<Talla> getTallas() {
		return tallas == null ? new ArrayList<>() : tallas;
	}
	public void setTallas(List<Talla> tallas) {
		this.tallas = tallas;
	}
	public List<String> getAlmacenes() {
		return almacenes == null ? new ArrayList<>() :almacenes;
	}
	public void setAlmacenes(List<String> almacenes) {
		this.almacenes = almacenes;
	}
	public String getLinea() {
		return linea;
	}
	public void setLinea(String linea) {
		this.linea = linea;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getReferenciaProov() {
		return referenciaProov;
	}
	public void setReferenciaProov(String referenciaProov) {
		this.referenciaProov = referenciaProov;
	}
	@Override
	public String toString() {
		return "Producto [descripcion=" + descripcion + ", saldo=" + saldo + ", tallas=" + tallas + ", almacenes="
				+ almacenes + ", linea=" + linea + ", sexo=" + sexo + ", marca=" + marca + ", referenciaProov="
				+ referenciaProov + "]";
	}
}