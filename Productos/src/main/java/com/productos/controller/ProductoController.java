package com.productos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.productos.model.Producto;
import com.productos.services.ProductoService;

@RestController
@RequestMapping("productos")
public class ProductoController {
	
	@Autowired
	private ProductoService productoService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Producto> buscarProductos() {
		return productoService.consultarProductos();
	}
  
	@RequestMapping(method = RequestMethod.GET)
	public void publicar() {
		
	}
  
//  @RequestMapping(method = RequestMethod.GET)
//  public List<Item> findItems() {
//    return repo.findAll();
//  }
//  
//  @RequestMapping(method = RequestMethod.POST)
//  public Item addItem(@RequestBody Item item) {
//    item.setId(null);
//    return repo.saveAndFlush(item);
//  }
//  
//  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
//  public Item updateItem(@RequestBody Item updatedItem, @PathVariable Integer id) {
//    updatedItem.setId(id);
//    return repo.saveAndFlush(updatedItem);
//  }
//  
//  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
//  public void deleteItem(@PathVariable Integer id) {
//    repo.delete(id);
//  }
}
