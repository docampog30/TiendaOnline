package com.productos.bd;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.DeleteItemRequest;
import com.productos.model.Producto;

@Repository
public class AmazonBD {
	
	@Autowired
	private DynamoDBMapper dbMapper;
	
	@Autowired
	private AmazonDynamoDB dynamoDB;
	
	public void save(Producto customer) {
		
		try {
			dbMapper.save(customer, new DynamoDBMapperConfig(DynamoDBMapperConfig.SaveBehavior.CLOBBER));
		} catch (Exception e) {
			System.err.println("Error guardando producto "+e.getMessage());
		}
		
	  }
	
	public void deleteAll(){
		DeleteItemRequest request = new DeleteItemRequest("Producto", new HashMap<>());
		dynamoDB.deleteItem(request);
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

	public List<Producto> selectProductByFilter(String linea, String marca, String genero) {

		 Map<String, AttributeValue> attributeValues = new HashMap<String, AttributeValue>();
		    attributeValues.put(":line", new AttributeValue().withS(linea));
		    attributeValues.put(":marca", new AttributeValue().withS(linea).withNULL(true));
		    attributeValues.put(":genero", new AttributeValue().withS(linea).withNULL(true));
		 
		    Map<String, String> attributeNames = new HashMap<String, String>();
		    attributeNames.put("#linea", "linea");
		    attributeNames.put("#marca", "marca");
		    attributeNames.put("#genero", "genero");
		    
		  DynamoDBScanExpression scanExpression = new DynamoDBScanExpression();
		  scanExpression
		  .withExpressionAttributeValues(attributeValues)
		  .withExpressionAttributeNames(attributeNames)
		  .withFilterExpression("#linea = :line")
		  .withFilterExpression("#marca = :marca")
		  .withFilterExpression("#genero = :genero");
		  
		 return dbMapper.parallelScan(Producto.class,scanExpression,3);
	}
	

	public List<Producto> selectProductByEstado(String estado) {

	 	Map<String, AttributeValue> attributeValues = new HashMap<String, AttributeValue>();
	    attributeValues.put(":estado", new AttributeValue().withS(estado));
	 
	    Map<String, String> attributeNames = new HashMap<String, String>();
	    attributeNames.put("#estado", "estado");
	    
	  DynamoDBScanExpression scanExpression = new DynamoDBScanExpression();
	  scanExpression
	  .withExpressionAttributeValues(attributeValues)
	  .withExpressionAttributeNames(attributeNames)
	  .withFilterExpression("#estado = :estado");
	  
	 return dbMapper.parallelScan(Producto.class,scanExpression,2);
	}

}
