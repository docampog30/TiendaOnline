controllers
  .controller('ConsultaController',['$scope','Productos','Detalles','$uibModal','Upload',function($scope,Productos,Detalles, $uibModal,Upload) {
	  
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
	  
	  $scope.publicar = function (producto) {
		  
		  $scope.productosAgregados = [];
		  $scope.agregar = {};
		  $scope.producto ={};
		  $scope.selectedItem = {};
		  
		  var entries = Detalles.query({ ref: producto.referenciaProov}).$promise.then(function(todo) {
			  $scope.producto = todo[0];
			  $scope.selectedItem = $scope.producto.tallas[0];
			   
			   $scope.almacenes = producto.almacenes;
			   
			    var modalInstance = $uibModal.open({
			      ariaLabelledBy: 'modal-title',
			      ariaDescribedBy: 'modal-body',
			      templateUrl: 'myModalPhotos.html',
			      size:'lg',
			      controller: 'ModalPublicarController',
			      scope:$scope
			    });
			    
			    modalInstance.result.then(function (selectedItem) {
			    	$scope.productosAgregados = selectedItem;
			     }, function () {
			        console.log('Modal dismissed at: ' + new Date());
			     });
			   
			}, function(errResponse) {
				alert("Error");
			});		 
	  }
}]);

controllers.controller('ModalPublicarController',function($scope,$http, $uibModalInstance,Upload) {
	
	$scope.images = [];
	
	$scope.policy = {
			  "Id": "Policy1500059658317",
			  "Version": "2012-10-17",
			  "Statement": [
			    {
			      "Sid": "Stmt1500059648653",
			      "Action": "s3:*",
			      "Effect": "Allow",
			      "Resource": "arn:aws:s3:::david-test-s3",
			      "Principal": {
			        "AWS": [
			          "arn:aws:iam::822640148180:user/docampog30"
			        ]
			      }
			    }
			  ]
			};
	

	var Base64={_keyStr:"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=",encode:function(e){var t="";var n,r,i,s,o,u,a;var f=0;e=Base64._utf8_encode(e);while(f<e.length){n=e.charCodeAt(f++);r=e.charCodeAt(f++);i=e.charCodeAt(f++);s=n>>2;o=(n&3)<<4|r>>4;u=(r&15)<<2|i>>6;a=i&63;if(isNaN(r)){u=a=64}else if(isNaN(i)){a=64}t=t+this._keyStr.charAt(s)+this._keyStr.charAt(o)+this._keyStr.charAt(u)+this._keyStr.charAt(a)}return t},decode:function(e){var t="";var n,r,i;var s,o,u,a;var f=0;e=e.replace(/[^A-Za-z0-9+/=]/g,"");while(f<e.length){s=this._keyStr.indexOf(e.charAt(f++));o=this._keyStr.indexOf(e.charAt(f++));u=this._keyStr.indexOf(e.charAt(f++));a=this._keyStr.indexOf(e.charAt(f++));n=s<<2|o>>4;r=(o&15)<<4|u>>2;i=(u&3)<<6|a;t=t+String.fromCharCode(n);if(u!=64){t=t+String.fromCharCode(r)}if(a!=64){t=t+String.fromCharCode(i)}}t=Base64._utf8_decode(t);return t},_utf8_encode:function(e){e=e.replace(/rn/g,"n");var t="";for(var n=0;n<e.length;n++){var r=e.charCodeAt(n);if(r<128){t+=String.fromCharCode(r)}else if(r>127&&r<2048){t+=String.fromCharCode(r>>6|192);t+=String.fromCharCode(r&63|128)}else{t+=String.fromCharCode(r>>12|224);t+=String.fromCharCode(r>>6&63|128);t+=String.fromCharCode(r&63|128)}}return t},_utf8_decode:function(e){var t="";var n=0;var r=c1=c2=0;while(n<e.length){r=e.charCodeAt(n);if(r<128){t+=String.fromCharCode(r);n++}else if(r>191&&r<224){c2=e.charCodeAt(n+1);t+=String.fromCharCode((r&31)<<6|c2&63);n+=2}else{c2=e.charCodeAt(n+1);c3=e.charCodeAt(n+2);t+=String.fromCharCode((r&15)<<12|(c2&63)<<6|c3&63);n+=3}}return t}}
	$scope.policy = Base64.encode(JSON.stringify($scope.policy)).toString('base64');
	
	$scope.signature = Base64.encode("5e1501a74e19e37ab5abf17d6d7d86ae785d4c75");
	
	

	 $scope.uploadPic = function(file) {
		 		
		        Upload.upload({
		            url: 'https://david-test-s3.s3.amazonaws.com/', //S3 upload url including bucket name
		            method: 'POST',
		            data: {
		                key: file.name, // the key to store the file on S3, could be file name or customized
		                AWSAccessKeyId: '',
		                acl: 'public-read', // sets the access to the uploaded file in the bucket: private, public-read, ...
		                policy: $scope.policy, // base64-encoded json policy (see article below)
		                signature: $scope.signature, // base64-encoded signature based on policy string (see article below)
		                "Content-Type": file.type != '' ? file.type : 'application/octet-stream', // content type of the file (NotEmpty)
		                filename: file.name, // this is needed for Flash polyfill IE8-9
		                file: file
		            }
		        }).then(function(response) {
                    file.progress = parseInt(100);
                    if (response.status === 201) {
                        var data = xml2json.parser(response.data),
                        parsedData;
                        parsedData = {
                            location: data.postresponse.location,
                            bucket: data.postresponse.bucket,
                            key: data.postresponse.key,
                            etag: data.postresponse.etag
                        };
                        $scope.imageUploads.push(parsedData);

                    } else {
                        alert('Upload Failed');
                    };
		        });
	 }

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
});
	 
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
