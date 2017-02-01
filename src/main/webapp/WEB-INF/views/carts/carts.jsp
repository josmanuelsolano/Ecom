<div class="row" ng-controller="CartsCtrl" ng-init="getCarts()">
    <div class="col-lg-12">
		<div class="table-responsive">
			<table
				class="table table-bordered table-hover table-striped tablesorter">
				<thead>
					<tr>
						<th> Customer </th>
						<th> Cart Amount </th>
						<th> Created Date </th>
						<th> Modified Date </th>
						<th> Options </th>
					</tr>
				</thead>
				<tbody>
					<tr ng-repeat="cart in carts">
						<td data-ng-bind="cart.customerId.name"></td>
						<td data-ng-bind="cart.amount | currency"></td>
						<td data-ng-bind="cart.audit.createDate | date:'yyyy-MM-dd HH:mm:ss'"></td>
						<td data-ng-bind="cart.audit.updateDate | date:'yyyy-MM-dd HH:mm:ss'"></td>
						<td align="center">
							<a href="carts/{{cart.cartId}}" class="btn btn-primary btn-sm">
						      	<span class="fa fa-eye"></span> View 
						      </a>
						</td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
</div>