mainApp.factory('Productos', ['$resource', function($resource) {
	return $resource('/productos/query/:linea');
}]);

mainApp.factory('Detalles', ['$resource', function($resource) {
	return $resource('/productos/find/:linea/:marca/:genero/:desde/:hasta/:almacen',null,{
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