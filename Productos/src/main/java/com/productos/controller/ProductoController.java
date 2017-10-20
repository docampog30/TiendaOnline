package com.productos.controller;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.productos.model.Paquete;
import com.productos.model.Producto;
import com.productos.services.ProductoService;

@RestController
@RequestMapping("productos")
public class ProductoController {
	
	@Autowired
	private ProductoService productoService;
	
	@RequestMapping(method = RequestMethod.GET,value="/find/{desde}/{hasta}")
	public List<Producto> recuperarProductosxFiltro(@RequestParam(name="linea",required=false) String linea,@RequestParam(name="marca",required=false) String marca,@RequestParam(name="genero",required=false) String genero,@PathVariable Long desde,@PathVariable Long hasta,@RequestParam(name="almacen",required=false) String almacen) {
		
		LocalDate dateDesde = Instant.ofEpochMilli(desde).atZone(ZoneId.systemDefault()).toLocalDate();
		LocalDate dateHasta = Instant.ofEpochMilli(hasta).atZone(ZoneId.systemDefault()).toLocalDate();
		
		return productoService.recuperarProductosxFiltro(linea, marca, dateDesde, dateHasta, almacen, genero);
	}
	
	@RequestMapping(method = RequestMethod.GET,value="/find/{ref}")
	public Producto buscarProductosById(@PathVariable String ref) {
		return productoService.getDetailsByID(ref);
	}
	
	
	@RequestMapping(method = RequestMethod.PUT)
	public void actualizar(@RequestBody Producto producto) {
		productoService.actualizarProducto(producto);
	}
	  
	  @RequestMapping(method = RequestMethod.GET,value="{estado}")
	  public List<Producto> findProductosByState(@PathVariable String estado) {
	    return productoService.recuperarProductosPorEstado(estado);
	  }
	  
	  @RequestMapping(method = RequestMethod.PUT,value="habilitarPaquete")
	  public void habilitarPaqueteProductos(@RequestBody List<Producto> productos) {
	    productoService.habilitarPaqueteProductos(productos);
	  }
	  
	  @RequestMapping(method = RequestMethod.PUT,value="actualizarProductos")
	  public void actualizarProductos(@RequestBody List<Producto> productos) {
	    productoService.actualizarProductos(productos);
	  }
	  
	  @RequestMapping(method = RequestMethod.GET,value="/paquetes")
	  public List<Paquete> getAllPaquetes() {
	    return productoService.recuperarPaquetes();
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
