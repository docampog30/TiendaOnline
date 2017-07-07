controllers
  .controller('ConsultaController',['$scope','Productos','$uibModal',function($scope,Productos, $uibModal) {
	  
	  $scope.lineas = ["CALZADO","ROPA","ACCESORIOS"];
	  $scope.lineaSelected = $scope.lineas[0];
	  $scope.agregar = {};
	  $scope.productosAgregados = [];
	  
	  $scope.consultarProductos = function(){
		  var entries = Productos.query({ linea: $scope.lineaSelected}).$promise.then(function(todo) {
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
		  $scope.producto = producto;
		  $scope.almacenes = producto.almacenes;
		    var modalInstance = $uibModal.open({
		      ariaLabelledBy: 'modal-title',
		      ariaDescribedBy: 'modal-body',
		      templateUrl: 'myModalPublicar.html',
		      size:'lg',
		      scope:$scope
		    });
	  }
	  
	  $scope.agregarProducto = function(){
		  $scope.agregar.nombre = $scope.producto.descripcion;
		  $scope.agregar.referencia = $scope.producto.referenciaProov;
		  $scope.productosAgregados.push(angular.copy($scope.agregar));
	  }
	  
	 
}]);