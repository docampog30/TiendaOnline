controllers
  .controller('ConsultaController',['$scope','Detalles','Productos','$window','$location','$uibModal','GENERAL_SERVICES','$filter',function($scope,Detalles,Productos,$window,$location,$uibModal,GENERAL_SERVICES,$filter) {
	  
	  $scope.lineas = ["CALZADO","PRENDAS DE VESTIR","ACCESORIOS"];
	  $scope.generos = ["","HOMBRE","DAMA","NINO","JUVENIL"];
	  $scope.marcas = ["","NIKE","ADIDAS","PUMA","NEW BALANCE","LEVIS","LACOSTE","LOTTO","JORDAN","KAPPA","VANS","CONVERSE","TOMMY HILFIGER","DC","OAKLEY","UNDER ARMOUR"];
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
	  $scope.tallasProducto = [];
	  
	  var token;
	  
		$scope.validarToken = function(){
			var hashParams = $location.hash();
			token = hashParams.substring(hashParams.lastIndexOf("#access_token=")+14,hashParams.lastIndexOf("&expires_in="));
			if (token === undefined || token === null || token === ""){
				$window.location.href = "https://auth.mercadolibre.com.co/authorization?response_type=token&client_id=" + GENERAL_SERVICES.APP_ID;
			}
			$scope.variaciones;
		}
		
		$scope.validarToken();
	  
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
	  
	  $scope.consultarProductosReferencia = function(){
		  var entries = Productos.buscarPorReferencia($scope.referenciaSearch).then(function(todo) {
			   $scope.productos = [todo.data];
			}, function(errResponse) {
				alert("No existe disponibilidad de producto seleccionado");
			});
	  }
	  
	  
	  
	  $scope.homologarTallas = function (tallasMahalo){
		  
		  var tallaProducto = {
						id : "",
						name : "",
						cantidad : ""
					}
		  
		  tallasMahalo.forEach(function (tallaMahalo, index){
			  
				var talla = GENERAL_SERVICES.TALLAS.filter(function ( obj ) {
				    return obj.mahalo === tallaMahalo.descripcion;
				})[0];
				
				if (talla){
					tallaProducto.id = talla.id;
					tallaProducto.name = talla.name;
					tallaProducto.cantidad = tallaMahalo.cantidad;
					
				}else{
					tallaProducto.name = "error";
				}
				$scope.tallasColombia.push(angular.copy(tallaProducto));
				
			});
	  }
	  
	  $scope.publicar = function (producto) {
		  
		  $scope.productosAgregados = [];
		  $scope.agregar = {};
		  $scope.producto ={};
		  $scope.selectedItem = {};
		  $scope.tallasColombia = [];
		  
		  $scope.producto = producto;
		  $scope.selectedItem = $scope.producto.tallas[0];
			   
			   $scope.almacenes = producto.almacenes;
			   $scope.homologarTallas($scope.producto.tallas);
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
		  
		if (producto.preciocompra != undefined) {
			return { background: "#86DA86" }
		}else if (producto.estado == 'S') {
			return { background: "#da9686" }
		}else if(producto.estado == 'H'){
			return { background: "rgb(255, 249, 176)"}
		}
	}
	  
	  $scope.habilitarProductos = function () {
		 var productosSeleccionados = $scope.productos.filter(function (p) {
			 return p.estado == 'S';
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

controllers.controller('ModalPublicarController',function($scope,$http, $uibModalInstance, $filter, GENERAL_SERVICES, meli, $location, Productos) {
	
	$scope.images = [];

	$scope.selectedItem = {};
	$scope.$watch('selectedItem',function(newValue,oldValue){
		  $scope.changeTalla(newValue);
	  });
	  
	  $scope.changeTalla = function(newValue){
		  $scope.agregar.talla = newValue.name;
		  $scope.agregar.cantidad = newValue.cantidad;
		  $scope.agregar.idtalla = newValue.id;
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
	
	$scope.adicionarImagen = function(){
		if ($scope.images.length < 6){
			$scope.images.push($scope.producto.imagen);
			 document.getElementById("imagenesView").innerHTML += '<img src="' + $scope.producto.imagen + '" height="90px">';
			 $scope.producto.imagen = "";
		}else{
			alert("Solo se puede ingresar hasta 6 imagenes");
		}
	}
	
	var productoMeli = {
			title : "",
			category_id : "", //definir se se selecciona
			currency_id: "COP",
			buying_mode : "buy_it_now",
			listing_type_id : "bronze",
			condition : "new",
			description : "",
			warranty : "2 meses",
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
		productoMeli.variations = [];
		$scope.productosAgregados.forEach(function (producto, index){
			$scope.variationElement.attribute_combinations[0].value_id = producto.idtalla;
			$scope.variationElement.attribute_combinations[0].value_name = producto.talla;
			$scope.variationElement.price = producto.precio;
			$scope.variationElement.available_quantity = producto.cantidad;
			$scope.variationElement.picture_ids = $scope.images;
			productoMeli.variations.push(angular.copy($scope.variationElement));
		});
	}
	
	$scope.publicar = function(){
		$scope.productosAgregados;
		var categoria = $filter('filter')(GENERAL_SERVICES.MARCAS, {'nombre':$scope.producto.marca,'genero': $scope.producto.genero}); 
		
		if (categoria.length == 0){
			categoria = $filter('filter')(GENERAL_SERVICES.MARCAS, {'nombre': 'OTRAS MARCAS','genero': $scope.producto.genero});
		}
		
		productoMeli.category_id = categoria[0].id;
		productoMeli.title = $scope.producto.descripcion;
		productoMeli.description = $scope.producto.descripcion;
		
		$scope.adicionarVariacion();
		var hashParams = $location.hash();
		var token = hashParams.substring(hashParams.lastIndexOf("#access_token=")+14,hashParams.lastIndexOf("&expires_in="));
		meli.publicar(productoMeli, token).then(function (data){
			
			$scope.producto.id = data.id;
			Productos.actualizar($scope.producto).then(function(data) {
			  }, function(response) {
			  });
			
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
			$window.location.href = "https://auth.mercadolibre.com.co/authorization?response_type=token&client_id=" + GENERAL_SERVICES.APP_ID+"&redirect_uri=http://localhost:8080/#!/home";
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

controllers.controller('PreciosController',['$scope', 'Productos','$location',function($scope, Productos,$location) {
	
	$scope.recuperar = function(){
		console.log($location.path());
		
		if($location.path() == '/habilita')
		{
			Productos.recuperarProductosPorEstado('S').then(function(data) {
			  $scope.productos = $scope.parseData(data.data);
			}, function(response) {
		    alert("Error consultando los productos");
			});
		}else{
			$scope.recuperarConfirmados();
		}
	}
	
	$scope.recuperarConfirmados = function(){
		Productos.recuperarProductosPorEstado('H').then(function(data) {
			  $scope.productos = $scope.parseData(data.data);
			}, function(response) {
		    alert("Error consultando los productos");
			});
	}
	
	$scope.habilitarPaquete = function(){
		angular.forEach($scope.productos,function(producto){
			producto.estado='H';
		});
		Productos.habilitarPaqueteProductos($scope.productos).then(function(data) {
			$scope.recuperarConfirmados();
			alert("Productos habilitados correctamente");
		  }, function(response) {
		    alert("Error consultando los productos");
		  });
	}
	
	
	$scope.guardar = function(producto){
		Productos.actualizar(producto).then(function(data) {
			alert("Precio actualizado correctamente");
		  }, function(response) {
			$scope.recuperar();
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
