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
	  
	 
}]).controller('PublicarController',['$scope', 'meli', '$window' , '$location', 'GENERAL_SERVICES' ,function($scope, meli, $window, $location, GENERAL_SERVICES) {
	 
	
	var token;
	
	$scope.validarToken = function(){
		var hashParams = $location.hash();
		token = hashParams.substring(hashParams.lastIndexOf("#access_token=")+14,hashParams.lastIndexOf("&expires_in="));
		if (token === undefined || token === null || token === ""){
			$window.location.href = "https://auth.mercadolibre.com.co/authorization?response_type=token&client_id=" + GENERAL_SERVICES.APP_ID;
		}
	}
	
	$scope.validarToken();
	
	var producto = {
			title : "Item de test - No Ofertar",
			category_id : "MCO3530", //definir se se selecciona
			price : 10,
			currency_id: "COP",
			available_quantity: 1,
			buying_mode : "buy_it_now",
			listing_type_id : "bronze",
			condition : "new",
			description : "Item de test - No Ofertar",
			warranty : "12 months"
	}
	
	$scope.publicar = function(){
		meli.publicar(producto, token).then(function (data){
			alert("Registro publicado correctamente");
		}, function (response) {
			alert("Error publicando el producto");
		});
	}
	
}]);