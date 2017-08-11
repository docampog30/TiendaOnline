controllers
  .controller('ConsultaController',['$scope','Detalles','Productos','$uibModal','Upload',function($scope,Detalles,Productos, $uibModal,Upload) {
	  
	  $scope.lineas = ["CALZADO","ROPA","ACCESORIOS"];
	  $scope.generos = ["","HOMBRE","DAMA","NINO","JUVENIL"];
	  $scope.marcas = ["","NIKE","ADIDAS","PUMA","NEW BALANCE","LEVIS","LACOSTE","LOTTO","JORDAN","KAPPA"];
	  $scope.tiendas = [{codigo:"",nombre:''},
		  				{codigo:"3",nombre:'PALACIO'},
		  				{codigo:"4",nombre:'GIRARDOTA'},
		  				{codigo:"5",nombre:'SAN DIEGO'},
		  				{codigo:"8",nombre:'HOLLYWOOD'},
		  				{codigo:"9",nombre:'MAYORCA'},
		  				{codigo:"10",nombre:'PUERTA NORTE'},
		  				{codigo:"11",nombre:'IBAGUE'},
		  				{codigo:"12",nombre:'MOLINOS'},
		  				{codigo:"13",nombre:'PREMIUM'},
		  				{codigo:"14",nombre:'FLORIDA'}];
	  $scope.search = {};
	  $scope.lineaSelected = $scope.lineas[0];
	  $scope.agregar = {};
	  $scope.productosAgregados = [];
	  
	  $scope.consultarProductos = function(){
		  
		  var query = angular.copy($scope.search);
		  query.desde = query.desde.getTime();
		  query.hasta = query.hasta.getTime();
		  
		  var entries = Detalles.query(query).$promise.then(function(todo) {
			   $scope.productos = todo;
			}, function(errResponse) {
				alert("No existe disponibilidad de producto seleccionado");
			});
	  }
	  
	  $scope.publicar = function (producto) {
		  
		  $scope.productosAgregados = [];
		  $scope.agregar = {};
		  $scope.producto ={};
		  $scope.selectedItem = {};

			  $scope.producto = producto;
			  $scope.selectedItem = $scope.producto.tallas[0];
			   
			   $scope.almacenes = producto.almacenes;
			   
			    var modalInstance = $uibModal.open({
			      ariaLabelledBy: 'modal-title',
			      ariaDescribedBy: 'modal-body',
			      templateUrl: 'myModalPublicar.html',//myModalPhotos.html
			      size:'lg',
			      controller: 'ModalPublicarController',
			      scope:$scope
			    });
			    
			    modalInstance.result.then(function (selectedItem) {
			    	$scope.productosAgregados = selectedItem;
			     }, function () {
			        console.log('Modal dismissed at: ' + new Date());
			     });
	  }
	  
	  $scope.set_color = function (producto) {
		  if (producto.habilitado && producto.preciocompra == undefined) {
			    return { background: "#da9686" }
			  }
		  
		  if (producto.preciocompra != undefined) {
		    return { background: "#86DA86" }
		  }
		}
	  
	  $scope.habilitarProductos = function () {
		 var productosSeleccionados = $scope.productos.filter(function (p) {
			  return p.habilitado;
		  });
		 
		 angular.forEach(productosSeleccionados, function(value, key) {
			 Productos.actualizar(value).then(function(data) {
				 
			 });
		 });
	  }
	  
	  $scope.openAlmacenes = function (producto) {
		  
		  var almacenesproducto =[]; 
		  angular.forEach(producto.almacenes, function(almacen, key) {
			  var al = $scope.tiendas.find(x => x.codigo == almacen);
				almacenesproducto.push(al == undefined ? almacen : al.nombre);
			});
		  		    var modalInstance = $uibModal.open({
		  		      ariaDescribedBy: 'modal-body',
		  		      ariaLabelledBy: 'modal-title',
		  		      templateUrl: 'myModalAlmacenes.html',
		  		      controller: function($scope) {
		  		    	  $scope.almacenes = almacenesproducto;
		  		        }
		  		    });
		  	  }
}]);

controllers.controller('ModalPublicarController',function($scope,$http, $uibModalInstance,Upload, $filter, GENERAL_SERVICES, meli, $location) {
	
	$scope.images = [];

	$scope.selectedItem = {};
	$scope.$watch('selectedItem',function(newValue,oldValue){
		  $scope.changeTalla(newValue);
	  });
	  
	  $scope.changeTalla = function(newValue){
		  $scope.agregar.talla = newValue.descripcion;
		  $scope.agregar.cantidad = newValue.cantidad;
	  }
	  
	  $scope.agregarCantidad = function(talla){
		  $scope.agregar.talla = talla.descripcion;
		  $scope.agregar.cantidad = talla.cantidad;
	  }
	  
	  $scope.agregarProducto = function(){
		  $scope.agregar.nombre = $scope.producto.descripcion;
		  $scope.agregar.referencia = $scope.producto.referenciaProov;
		  $scope.productosAgregados.push(angular.copy($scope.agregar));
	  }
	  
	  $scope.ok = function () {
		  
		  $uibModalInstance.close($scope.productosAgregados);
		  
	  };

	 $scope.cancel = function () {
		    $uibModalInstance.dismiss('cancel');
	};
	
	$scope.stepsModel = [];
	
	$scope.add =function(event){
		 var file = document.getElementById('file').files[0];
	        var reader  = new FileReader();
	        reader.onload = function(e)  {
	            var image = document.createElement("img");
	            image.src = e.target.result;
	            document.body.appendChild(image);
	         }
	         reader.readAsDataURL(file);
	}
	
	var productoMeli = {
			title : "Item de test - No Ofertar",
			category_id : "MCO3530", //definir se se selecciona
			currency_id: "COP",
			buying_mode : "buy_it_now",
			listing_type_id : "bronze",
			condition : "new",
			description : "Item de test - No Ofertar",
			warranty : "12 months",
			variations : []
	}
	
	$scope.variationElement = {
			attribute_combinations : [
				{
					id : "103000",
					name : "Talla",
					value_id : "",
					value_name : ""
				},
				{
					id : "11000",
					name : "Color Primario",
					value_id : "2105d8e",
					value_name : "Negro"
				}],
		        price: 0,
		        available_quantity: 0,
		        picture_ids:[ 
		            "http://mla-s2-p.mlstatic.com/968521-MLA20805195516_072016-O.jpg"
		         ]
		};
	
	$scope.adicionarVariacion = function(){
		
		$scope.productosAgregados.forEach(function (producto, index){
			var talla = $filter('filter')(GENERAL_SERVICES.TALLAS, {'mahalo' : producto.talla});
			$scope.variationElement.attribute_combinations[0].value_id = talla[0].id;
			$scope.variationElement.attribute_combinations[0].value_name = talla[0].name;
			$scope.variationElement.price = producto.precio;
			$scope.variationElement.available_quantity = producto.cantidad;
			productoMeli.variations.push(angular.copy($scope.variationElement));
		});
	}
	
	$scope.publicar = function(){
		$scope.productosAgregados;
		var categoria = $filter('filter')(GENERAL_SERVICES.MARCAS, {'nombre':$scope.producto.marca,'genero': $scope.producto.genero}); 
		productoMeli.category_id = categoria[0].id;
		
		$scope.adicionarVariacion();
		var hashParams = $location.hash();
		var token = hashParams.substring(hashParams.lastIndexOf("#access_token=")+14,hashParams.lastIndexOf("&expires_in="));
		meli.publicar(productoMeli, token).then(function (data){
			alert("Registro publicado correctamente");
		}, function (response) {
			alert("Error publicando el producto");
		});
	}
	
	$scope.eliminarProducto = function(index){
		$scope.productosAgregados.splice(index, 1);
	}
	
});

controllers.controller('PublicarController',['$scope', 'meli', '$window' , '$location', 'GENERAL_SERVICES', '$filter' ,function($scope, meli, $window, $location, GENERAL_SERVICES, $filter) {
	 
	var token;
	
	$scope.variationElement = {
			attribute_combinations : [
				{
					id : "103000",
					name : "Talla",
					value_id : "",
					value_name : ""
				},
				{
					id : "11000",
					name : "Color Primario",
					value_id : "2105d8e",
					value_name : "Negro"
				}],
		        price: 0,
		        available_quantity: 0,
		        picture_ids:[ 
		            "http://mla-s2-p.mlstatic.com/968521-MLA20805195516_072016-O.jpg"
		         ]
		};
	
	$scope.validarToken = function(){
		var hashParams = $location.hash();
		token = hashParams.substring(hashParams.lastIndexOf("#access_token=")+14,hashParams.lastIndexOf("&expires_in="));
		if (token === undefined || token === null || token === ""){
			$window.location.href = "https://auth.mercadolibre.com.co/authorization?response_type=token&client_id=" + GENERAL_SERVICES.APP_ID;
		}
		$scope.variaciones;
	}
	
	$scope.validarToken();
	
	var producto = {
			title : "Item de test - No Ofertar",
			category_id : "MCO3530", //definir se se selecciona
			currency_id: "COP",
			buying_mode : "buy_it_now",
			listing_type_id : "bronze",
			condition : "new",
			description : "Item de test - No Ofertar",
			warranty : "12 months",
			variations : []
	}
	
	$scope.adicionarVariacion = function(){
			
		var talla = $filter('filter')(GENERAL_SERVICES.TALLAS, {'name':'38'});
		$scope.variationElement.attribute_combinations[0].value_id = talla[0].id;
		$scope.variationElement.attribute_combinations[0].value_name = talla[0].name;
		$scope.variationElement.price = 10000;
		$scope.variationElement.available_quantity = 10;
		producto.variations.push(angular.copy($scope.variationElement));
	}
	
	$scope.publicar = function(){
		var categoria = $filter('filter')(GENERAL_SERVICES.MARCAS, {'nombre':'ADIDAS','genero':'HOMBRE'}); 
		producto.category_id = categoria[0].id;
		
		$scope.adicionarVariacion();
		meli.publicar(producto, token).then(function (data){
			alert("Registro publicado correctamente");
		}, function (response) {
			alert("Error publicando el producto");
		});
	}
	
}]);

controllers.controller('PreciosController',['$scope', 'Productos',function($scope, Productos) {
	
	$scope.recuperar = function(){
		Productos.recuperarHabilitados().then(function(data) {
			  $scope.productos = $scope.parseData(data.data);
		  }, function(response) {
		    alert("Error consultando los productos");
		  });
	}
	
	
	
	$scope.guardar = function(producto){
		Productos.actualizar(producto).then(function(data) {
			$scope.recuperar();
		  }, function(response) {
		    alert("Error consultando los productos");
		  });
	}
	
	$scope.recuperar();
	
	 $scope.parseData = function(data){
		 angular.forEach(data, function(value, key) {
		 	value.preciocompra = parseInt(value.preciocompra);
		 })
		 return data;
	 }
	
}]);
