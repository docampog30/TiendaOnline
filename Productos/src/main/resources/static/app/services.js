mainApp.factory('Productos', ['$resource', function($resource) {
	return $resource('/productos/query/:linea');
}]);

mainApp.factory('Detalles', ['$resource', function($resource) {
	return $resource('/productos/find/:ref',null,{
		 query: {
		      method: 'GET',
		      isArray: true,
		      transformResponse: function(data) {
		        return [angular.fromJson(data)];
		      }
		  }
	});
}]);