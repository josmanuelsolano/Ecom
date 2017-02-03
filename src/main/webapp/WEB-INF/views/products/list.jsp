<div class="row" data-ng-controller="ProductsCtrl"
	data-ng-init="getProducts()">
	<div class="col-lg-12">
		<div class="table-responsive">
			<table
				class="table table-bordered table-hover table-striped tablesorter">
				<thead>
					<tr>
						<th>Name</th>
						<th>Price</th>
						<th>Stock Qty</th>
						<th>Create Date</th>
						<th>Modified Date</th>
						<th>Options</th>
					</tr>
				</thead>
				<tbody>
					<tr data-ng-repeat="product in products">
						<td data-ng-bind="product.name"></td>
						<td data-ng-bind="product.price | currency"></td>
						<td data-ng-bind="product.stock"></td>
						<td
							data-ng-bind="product.audit.createDate | date:'yyyy-MM-dd HH:mm:ss'"></td>
						<td
							data-ng-bind="product.audit.updateDate | date:'yyyy-MM-dd HH:mm:ss'"></td>
						<td align="center">
							<a data-ng-href="products/{{product.productId}}" class="btn btn-primary btn-xs">
							 <span class="fa fa-eye"></span>View
							</a>
							<a data-ng-href="products/products/{{product.productId}}" class="btn btn-warning btn-xs">
							 <span class="fa fa-edit"></span>Edit
							</a>
						</td>
					</tr>
				</tbody>
			</table>
		</div>
		<a href="" class="btn btn-success btn-lg"> <span
			class="fa fa-plus"></span> Add product
		</a>
	</div>
</div>