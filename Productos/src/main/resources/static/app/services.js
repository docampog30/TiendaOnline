mainApp.factory('Productos', ['$resource', function($resource) {
	return $resource('/productos/query/:linea');
}]);