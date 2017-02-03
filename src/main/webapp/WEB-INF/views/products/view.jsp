<div class="row" data-ng-controller="ProductsCtrl"
	data-ng-init="getProductView()">
	<div class="col-sm-12">
		<form class="form-horizontal" role="form" action="/Ecom/products/update"
			method="POST">
			<div>
				<div class="col-sm-5">
					<div class="form-group">
						<label class="col-sm-5 control-label">Name:</label>
						<div class="col-sm-7">
							<input class="form-control" type="text" name="name"
								data-ng-model="product.name" readonly>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-5 control-label">Price:</label>
						<div class="col-sm-7">
							<input class="form-control" type="text" name="price"
								data-ng-model="product.price | currency" readonly>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-5 control-label">Stock:</label>
						<div class="col-sm-7">
							<input class="form-control" type="text" name="stock"
								data-ng-model="product.stock" readonly>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-5 control-label">Create Date:</label>
						<div class="col-sm-7">
							<input class="form-control" type="text" name="createDate"
								data-ng-model="product.audit.createDate | date:'yyyy-MM-dd HH:mm:ss'" readonly>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-5 control-label">Modified Date:</label>
						<div class="col-sm-7">
							<input class="form-control" type="text" name="updateDate"
								data-ng-model="product.audit.updateDate | date:'yyyy-MM-dd HH:mm:ss'" readonly>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-5 control-label">Description:</label>
						<div class="col-sm-7">
							<textarea class="form-control" name="updateDate"
								data-ng-model="product.description" readonly></textarea>
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