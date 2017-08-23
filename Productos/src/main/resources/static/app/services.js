mainApp.factory('Productos', ['$http', function($http) {
	var dataFactory = {};
   	
	dataFactory.recuperarHabilitados = function(){
   	 	return $http.get('/productos/habilitados');
   	}
	
	dataFactory.actualizar = function(producto){
   	 	return $http.put('/productos',producto)
   	}
	
	dataFactory.buscarPorReferencia = function(referencia){
   	 	return $http.get('/productos/find/'+referencia)
   	}
   	
   	return dataFactory;
}]);

mainApp.factory('Detalles', ['$resource', function($resource) {
	return $resource('/productos/find/:linea/:marca/:genero/:desde/:hasta',null,{
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