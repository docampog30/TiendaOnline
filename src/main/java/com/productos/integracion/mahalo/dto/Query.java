package com.productos.integracion.mahalo.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("QUERY")
public class Query {
	
	@XStreamAlias("SELECT0")
	private Select select;
	
	public Select getSelect() {
		return select;
	}
}
