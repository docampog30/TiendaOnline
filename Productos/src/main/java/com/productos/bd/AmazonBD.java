package com.productos.bd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.productos.model.Producto;

@Repository
public class AmazonBD {
	
	@Autowired
	private DynamoDBMapper dbMapper;
	
	public void save(Producto customer) {
	    dbMapper.save(customer);
	  }

}
