package com.productos.integracion.mahalo.dto;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamImplicit;

public class Select {
	@XStreamImplicit(itemFieldName = "row")
	private List<Row> rows;
	
	public List<Row> getRows() {
		return rows;
	}
}
