ecomApp.controller('ProductsCtrl' ,['$scope','$http','$location',
	function($scope, $http, $location){
	
	$scope.getProducts = function(){
		$http({
			  method: 'POST',
			  url: 'http://localhost:8080/Ecom/products'
			}).then(function successCallback(response) {
				$scope.products = response.data;
				console.log(response.data);
			  }, function errorCallback(response) {
				  console.log(response);
			  });
	}
	
}]);