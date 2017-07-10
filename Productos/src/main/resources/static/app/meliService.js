mainApp.factory('meli', ['$resource', '$q', function($resource, $q) {
	
	var service = {
		publicar : publicar
	}
	
	function getApiResource(resource, pathParameters) {
		return $resource(resource, pathParameters);
	}
	
	function publicar(query, token){
		return getResourcePostPromise("https://api.mercadolibre.com/items?access_token=" + token, query);
	}
	
	function getResourcePostPromise(resource, body) {
		var deferred = $q.defer();
		
		getApiResource(resource).save(body).$promise.then(function (data) {
			deferred.resolve(data);
		}, function (error) {
			deferred.reject(error);
		});
		
		return deferred.promise;
	}
	
	return service;
	
}]);