<div class="row" data-ng-controller="ProductsCtrl">
	<div class="col-sm-12">
		<form class="form-horizontal" role="form" action="/Ecom/products/new"
			method="POST">
			<div>
				<div class="col-sm-5">
					<div class="form-group">
						<label class="col-sm-5 control-label">Name:</label>
						<div class="col-sm-7">
							<input class="form-control" type="text" name="name"
								data-ng-model="product.name" required>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-5 control-label">Price:</label>
						<div class="col-sm-7">
							<input class="form-control" type="number" step="any" name="price"
								data-ng-model="product.price" required>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-5 control-label">Stock:</label>
						<div class="col-sm-7">
							<input class="form-control" type="number" step="any" name="stock"
								data-ng-model="product.stock" required>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-5 control-label">Description:</label>
						<div class="col-sm-7">
							<textarea class="form-control" name="description"
								data-ng-model="product.description" required></textarea>
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