ecomApp.controller('ProductsCtrl' ,['$scope','$http','$location',
	function($scope, $http, $location){
	
	$scope.getProducts = function(){
		$http({
			  method: 'GET',
			  url: 'http://localhost:8080/Ecom/products/products'
			}).then(function successCallback(response) {
				$scope.products = response.data;
				console.log(response.data);
			  }, function errorCallback(response) {
				  console.log(response);
			  });
	}
	
	$scope.getProductView = function(){
		$http({
			  method: 'GET',
			  url: $location.absUrl() + '/view'
			}).then(function successCallback(response) {
				$scope.product = response.data;
				console.log(response.data);
			  }, function errorCallback(response) {
				  console.log(response);
			  });
	}
	
	$scope.getProductEdit = function(){
		$http({
			  method: 'GET',
			  url: $location.absUrl() + '/edit'
			}).then(function successCallback(response) {
				$scope.product = response.data;
				console.log(response.data);
			  }, function errorCallback(response) {
				  console.log(response);
			  });
	}
	
}]);