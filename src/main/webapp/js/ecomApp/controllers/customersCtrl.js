ecomApp.controller('CustomersCtrl' ,['$scope','$http','$location',
	function($scope, $http, $location){
	
	$scope.getCustomers = function(){
		$http({
			  method: 'GET',
			  url: 'http://localhost:8080/Ecom/customers/customers'
			}).then(function successCallback(response) {
				$scope.customers = response.data;
				console.log(response.data);
			  }, function errorCallback(response) {
				  console.log(response);
			  });
	}
	
	$scope.getCustomerView = function(){
		$http({
			  method: 'GET',
			  url: $location.absUrl() + '/view'
			}).then(function successCallback(response) {
				$scope.customer = response.data;
				console.log(response.data);
			  }, function errorCallback(response) {
				  console.log(response);
			  });
		
	}
	
	$scope.getCustomerEdit = function(){
		$http({
			  method: 'GET',
			  url: $location.absUrl() + '/edit'
			}).then(function successCallback(response) {
				$scope.customer = response.data;
				console.log(response.data);
			  }, function errorCallback(response) {
				  console.log(response);
			  });
		
	}
	
}]);