package com.productos.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
	
	@RequestMapping("/")
	public String findItems() {
		return "HEllo world";
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
