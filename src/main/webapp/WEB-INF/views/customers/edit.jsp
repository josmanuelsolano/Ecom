<div class="row" data-ng-controller="CustomersCtrl"
	data-ng-init="editCustomer()">
	<div class="col-sm-12">
		<form class="form-horizontal" role="form" action="/Ecom/customers/update"
			method="POST">
			<div>
				<div class="col-sm-4">
					<div class="form-group">
						<label class="col-sm-5 control-label">Id:</label>
						<div class="col-sm-6">
							<input class="form-control" type="text" name="id"
								data-ng-model="customer.customerId" readonly>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-5 control-label">Username:</label>
						<div class="col-sm-6">
							<input class="form-control" type="text" name="username"
								data-ng-model="customer.username" readonly>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-5 control-label">Password:</label>
						<div class="col-sm-6">
							<input class="form-control" type="password" name="password"
								data-ng-model="customer.password" readonly>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-5 control-label">Name: </label>
						<div class="col-sm-6">
							<input class="form-control" type="text" name="name"
								data-ng-model="customer.name" readonly>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-5 control-label">Address: </label>
						<div class="col-sm-6">
							<input class="form-control" type="text" name="address"
								data-ng-model="customer.address" readonly>
						</div>
					</div>
					<div class="col-sm-3 col-sm-offset-2">
					<br>
					<button type="submit" name="update" class="btn btn-info btn-lg">Update</button>
				</div>
				</div>
			</div>
		</form>
	</div>
</div>