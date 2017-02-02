ecomApp.controller('CustomersCtrl' ,['$scope','$http','$location',
	function($scope, $http, $location){
	
	$scope.getCustomers = function(){
		$http({
			  method: 'POST',
			  url: 'http://localhost:8080/Ecom/customers'
			}).then(function successCallback(response) {
				$scope.customers = response.data;
				console.log(response.data);
			  }, function errorCallback(response) {
				  console.log(response);
			  });
	}
	
	$scope.editCustomer = function(){
		$http({
			  method: 'POST',
			  url: $location.absUrl()
			}).then(function successCallback(response) {
				$scope.customer = response.data;
				console.log(response.data);
			  }, function errorCallback(response) {
				  console.log(response);
			  });
	}
	
}]);