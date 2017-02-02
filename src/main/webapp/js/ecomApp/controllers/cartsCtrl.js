ecomApp.controller('CartsCtrl' ,['$scope','$http','$location',
	function($scope, $http, $location){
	
	$scope.getCarts = function(){
		$http({
			  method: 'POST',
			  url: 'http://localhost:8080/Ecom/carts'
			}).then(function successCallback(response) {
				$scope.carts = response.data;
			  }, function errorCallback(response) {
				  console.log(response);
			  });
	}
	
	$scope.editCart = function(){
		$http({
			  method: 'POST',
			  url: $location.absUrl()
			}).then(function successCallback(response) {
				$scope.cart = response.data;
				console.log(response.data);
			  }, function errorCallback(response) {
				  console.log(response);
			  });
	}
	
}]);