controllers
  .controller('ConsultaController',['$scope','Productos','$uibModal',function($scope,Productos,$uibModal) {
	  
	  $scope.consultarProductos = function(){
		  var entries = Productos.query().$promise.then(function(todo) {
			   $scope.productos = todo;
			}, function(errResponse) {
				alert("Error");
			});
	  }
	  
	  $scope.openTallas = function (producto) {

		    var modalInstance = $uibModal.open({
		      ariaLabelledBy: 'modal-title',
		      ariaDescribedBy: 'modal-body',
		      templateUrl: 'myModalContent.html',
		      controller: function($scope) {
		    	  $scope.tallas = producto.tallas;
		        }
		    });
	  }
	  
	  $scope.openAlmacenes = function (producto) {
		    var modalInstance = $uibModal.open({
		      ariaLabelledBy: 'modal-title',
		      ariaDescribedBy: 'modal-body',
		      templateUrl: 'myModalAlmacenes.html',
		      controller: function($scope) {
		    	  $scope.almacenes = producto.almacenes;
		        }
		    });
	  }
	  
	  $scope.publicar = function (producto) {
		    var modalInstance = $uibModal.open({
		      ariaLabelledBy: 'modal-title',
		      ariaDescribedBy: 'modal-body',
		      templateUrl: 'myModalPublicar.html',
		      controller: function($scope) {
		    	  $scope.producto = producto;
		        }
		    });
	  }
	  
	 
}]);