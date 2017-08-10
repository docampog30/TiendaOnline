package com.productos.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

@DynamoDBDocument
public class Talla {
	
	@DynamoDBAttribute
	private String descripcion;
	
	 @DynamoDBAttribute
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
