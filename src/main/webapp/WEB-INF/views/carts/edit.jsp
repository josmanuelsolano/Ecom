<div class="row" data-ng-controller="CartsCtrl"
	data-ng-init="editCart()">
	<div class="col-sm-12">
		<form class="form-horizontal" role="form" action="/Ecom/carts/update"
			method="POST">
			<div>
				<div class="col-sm-4">
					<div class="form-group">
						<label class="col-sm-5 control-label">Customer:</label>
						<div class="col-sm-7">
							<input class="form-control" type="text" name="id"
								data-ng-model="cart.cart.customerId.name" readonly="readonly">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-5 control-label">Cart Amount:</label>
						<div class="col-sm-7">
							<input class="form-control" type="text" name="amount"
								data-ng-model="cart.cart.amount | currency" readonly="readonly">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-5 control-label">Create Date</label>
						<div class="col-sm-7">
							<input class="form-control" type="text" name="createDate"
								data-ng-model="cart.cart.audit.createDate | date:'yyyy-MM-dd HH:mm:ss' "
								readonly="readonly">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-5 control-label">Update Date</label>
						<div class="col-sm-7">
							<input class="form-control" type="text" name="updateDate"
								data-ng-model="cart.cart.audit.updateDate | date:'yyyy-MM-dd HH:mm:ss' "
								readonly="readonly">
						</div>
					</div>
				</div>
				<div class="col-sm-8">
					<div class="panel panel-default">
						<div class="panel-heading">
							<b>Products</b>
						</div>
						<div class="panel-body">
							<div class="table-responsive">
								<table class="table table-striped">
									<thead>
										<tr>
											<th>Name</th>
											<th>Description</th>
											<th>Price</th>
											<th>Qty</th>
										</tr>
									</thead>
									<tbody>
										<tr data-ng-repeat="product in cart.products">
											<td data-ng-bind="product.productId.name"></td>
											<td data-ng-bind="product.productId.description"></td>
											<td data-ng-bind="product.productId.price | currency"></td>
											<td data-ng-bind="product.quantity"></td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
				<a href="/Ecom/carts" class="btn btn-primary btn-lg">
					<span class="fa fa-back"></span> Back to List
				</a>
			</div>
		</form>
	</div>
</div>
