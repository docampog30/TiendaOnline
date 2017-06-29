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
		return tallas == null ? new ArrayList<>() : this.tallas;
	}
	public void setTallas(List<Talla> tallas) {
		this.tallas = tallas;
	}
	public List<String> getAlmacenes() {
		return almacenes == null ? new ArrayList<>() : this.almacenes;
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
	
	public void addTalla(Talla talla){
		this.getTallas().add(talla);
	}
	
	public void addAlmacen(String almacen){
		this.getAlmacenes().add(almacen);
	}
}