controllers
  .controller('ConsultaController',['$scope','Productos','$uibModal',function($scope,Productos,$uibModal) {
	  
	  $scope.consultarProductos = function(){
		  var entries = Productos.query().$promise.then(function(todo) {
			   $scope.productos = todo;
			}, function(errResponse) {
				alert("Error");
			});
	  }
}]);