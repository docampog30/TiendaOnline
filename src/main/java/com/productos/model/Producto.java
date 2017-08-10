package com.productos.model;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBIgnore;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "Producto")
public class Producto {
	@DynamoDBAttribute
	private String descripcion;
	@DynamoDBIgnore
	private Integer saldo;
	
	@DynamoDBIgnore
	private List<Talla> tallas;
	@DynamoDBIgnore
	private List<String> almacenes;
	
	@DynamoDBAttribute
	private String linea;
	@DynamoDBAttribute
	private String genero;
	@DynamoDBAttribute
	private String marca;
	
	@DynamoDBAttribute
	private String habilitado;
	
	@DynamoDBAttribute
	private String preciocompra;
	
	@DynamoDBHashKey(attributeName = "referencia")
	@NotNull(message = "referencia must not be empty")
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
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
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
				+ almacenes + ", linea=" + linea + ", genero=" + genero + ", marca=" + marca + ", referenciaProov="
				+ referenciaProov + "]";
	}
	
	public String getHabilitado() {
		return habilitado;
	}
	public void setHabilitado(String habilitado) {
		this.habilitado = habilitado;
	}
	
	public String getPreciocompra() {
		return preciocompra;
	}
	
	public void setPreciocompra(String preciocompra) {
		this.preciocompra = preciocompra;
	}
}