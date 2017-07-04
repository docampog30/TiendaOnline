controllers
  .controller('ConsultaController',['$scope','Productos',function($scope,Productos) {
	  
	  $scope.consultarProductos = function(){
		  var entries = Productos.query().$promise.then(function(todo) {
			   $scope.productos = todo;
			}, function(errResponse) {
				alert("Error");
			});
	  }
}]);