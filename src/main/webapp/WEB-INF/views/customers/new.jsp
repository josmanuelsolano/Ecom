<div class="row" data-ng-controller="CustomersCtrl"
	data-ng-init="editCustomer()">
	<div class="col-sm-12">
		<form class="form-horizontal" role="form" action="/Ecom/customers/new"
			method="POST">
			<div>
				<div class="col-sm-4">
					<div class="form-group">
						<label class="col-sm-5 control-label">Username:</label>
						<div class="col-sm-6">
							<input class="form-control" type="text" name="username"
								data-ng-model="customer.username" required>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-5 control-label">Password:</label>
						<div class="col-sm-6">
							<input class="form-control" type="password" name="password"
								data-ng-model="customer.password" required>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-5 control-label">Name: </label>
						<div class="col-sm-6">
							<input class="form-control" type="text" name="name"
								data-ng-model="customer.name" required>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-5 control-label">Address: </label>
						<div class="col-sm-6">
							<input class="form-control" type="text" name="address"
								data-ng-model="customer.address" required>
						</div>
					</div>
					<div class="col-sm-3 col-sm-offset-2">
					<br>
					<button type="submit" name="create" class="btn btn-info btn-lg">Create</button>
				</div>
				</div>
			</div>
		</form>
	</div>
</div>