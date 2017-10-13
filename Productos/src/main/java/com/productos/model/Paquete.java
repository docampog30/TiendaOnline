package com.productos.model;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "Paquete")
public class Paquete {
	
	@DynamoDBHashKey(attributeName = "consecutivo")
	@NotNull(message = "consecutivo must not be empty")
	private Integer consecutivo;
	
	@DynamoDBAttribute
	private Date fecha;

	public Integer getConsecutivo() {
		return consecutivo;
	}
	public void setConsecutivo(Integer consecutivo) {
		this.consecutivo = consecutivo;
	}


	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
}
