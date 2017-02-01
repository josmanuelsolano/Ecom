<div class="row" ng-controller="ProductsCtrl" ng-init="getProducts()">
    <div class="col-lg-12">
		<div class="table-responsive">
			<table
				class="table table-bordered table-hover table-striped tablesorter">
				<thead>
					<tr>
						<th> Name </th>
						<th> Price </th>
						<th> Stock Qty </th>
						<th> Create Date </th>
						<th> Modified Date </th>
						<th> Options </th>
					</tr>
				</thead>
				<tbody>
					<tr ng-repeat="product in products">
						<td data-ng-bind="product.name"></td>
						<td data-ng-bind="product.price | currency"></td>
						<td data-ng-bind="product.stock"></td>
						<td data-ng-bind="product.audit.createDate | date:'yyyy-MM-dd HH:mm:ss'"></td>
						<td data-ng-bind="product.audit.updateDate | date:'yyyy-MM-dd HH:mm:ss'"></td>
						<td align="center">
							<a href="products/{{product.productId}}" class="btn btn-primary btn-sm">
						      	<span class="fa fa-eye"></span> View 
						      </a>
						</td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
</div>