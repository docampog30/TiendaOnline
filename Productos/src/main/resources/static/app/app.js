var controllers = angular.module('myApp.controllers', []);
var mainApp = angular.module("myApp", ['ngRoute',
'myApp.controllers',
'ngResource',
'chieffancypants.loadingBar',
'ui.bootstrap']);
mainApp.config(['$routeProvider',
	   function($routeProvider) {
	      $routeProvider.
	         when('/home', {
	            templateUrl: 'consulta.html',
	            controller: 'ConsultaController'
	         }).
	         when('/precios', {
	            templateUrl: 'precios.html',
	            controller: 'PreciosController'
	         }).
	         when('/habilita', {
		            templateUrl: 'habilitar.html',
		            controller: 'PreciosController'
		         }).
	         when('/publicar', {
		            templateUrl: 'publicar.html',
		            controller: 'PublicarController'
		         }).
	         otherwise({
	            redirectTo: '/home'
	         });

	   }]);