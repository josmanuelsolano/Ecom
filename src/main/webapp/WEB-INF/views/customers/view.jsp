<div class="row" data-ng-controller="CustomersCtrl"
	data-ng-init="getCustomerView()">
	<div class="col-sm-12">
		<form class="form-horizontal" role="form"
			action="/Ecom/customers/update" method="POST">
			<div>
				<div class="col-sm-5">
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
						<br> <a href="/Ecom/customers" class="btn btn-success btn-lg">
							<span class="fa fa-back"></span>Back to List
						</a>
					</div>
				</div>
			</div>
		</form>
	</div>
</div>