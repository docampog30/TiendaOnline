package com.productos.bd;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.productos.model.Producto;

@Repository
public class AmazonBD {
	
	@Autowired
	private DynamoDBMapper dbMapper;
	
	public void save(Producto customer) {
	    dbMapper.save(customer, new DynamoDBMapperConfig(DynamoDBMapperConfig.SaveBehavior.CLOBBER));
	  }
	
	public List<Producto> selectProductByLinea(String linea){

		 Map<String, AttributeValue> attributeValues = new HashMap<String, AttributeValue>();
		    attributeValues.put(":line", new AttributeValue().withS(linea));
		 
		    Map<String, String> attributeNames = new HashMap<String, String>();
		    attributeNames.put("#linea", "linea");
		    
		    
		  DynamoDBScanExpression scanExpression = new DynamoDBScanExpression();
		  scanExpression
		  .withExpressionAttributeValues(attributeValues)
		  .withExpressionAttributeNames(attributeNames)
		  .withFilterExpression("#linea = :line");
		  
		  

		 return dbMapper.parallelScan(Producto.class,scanExpression,2);
	}
	
	public Producto geyByID(String id){
		return dbMapper.load(Producto.class, id, new DynamoDBMapperConfig(DynamoDBMapperConfig.ConsistentReads.CONSISTENT)); 
	}

}
