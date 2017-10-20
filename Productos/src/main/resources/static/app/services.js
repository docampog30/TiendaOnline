mainApp.factory('Productos', ['$http', function($http) {
	var dataFactory = {};
   	
	dataFactory.recuperarProductosPorEstado = function(estado){
   	 	return $http.get('/productos/'+estado);
   	}
	
	dataFactory.actualizar = function(producto){
   	 	return $http.put('/productos',producto)
   	}
	
	dataFactory.habilitarPaqueteProductos = function(productos){
   	 	return $http.put('/productos/habilitarPaquete',productos)
   	}
	dataFactory.actualizarPrecioProducto = function(productos){
		return $http.put('/productos/actualizarProductos',productos)
	}
	dataFactory.buscarPorReferencia = function(referencia){
   	 	return $http.get('/productos/find/'+referencia)
   	}
	
	dataFactory.consultarPaquetes = function(){
   	 	return $http.get('/productos/paquetes')
   	}
   	
   	return dataFactory;
}]);

mainApp.factory('Detalles', ['$resource', function($resource) {
	return $resource('/productos/find/:desde/:hasta',null,{
		 query: {
		      method: 'GET',
		      isArray: true,
		      transformResponse: function(data) {
		    	  
		    	  if(data == undefined || data == '')
		    		  return [];
		    	  else
		    		  return angular.fromJson(data);
		      }
		  }
	});
}]);