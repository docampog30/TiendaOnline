controllers
  .controller('ConsultaController',['$scope','Productos',function($scope,Productos) {
	  
	  $scope.lineas = ["CALZADO","ROPA","ACCESORIOS"];
	  $scope.lineaSelected = $scope.lineas[0];	
	  
	  $scope.consultarProductos = function(){
		  var entries = Productos.query({ linea: $scope.lineaSelected}).$promise.then(function(todo) {
			   $scope.productos = todo;
			}, function(errResponse) {
				alert("Error");
			});
	  }
}]);