<div class="row" ng-controller="CustomersCtrl" ng-init="getCustomers()">
    <div class="col-lg-12">
		<div class="table-responsive">
			<table
				class="table table-bordered table-hover table-striped tablesorter">
				<thead>
					<tr>
						<th> Name </th>
						<th> Username </th>
						<th> Address </th>
						<th> Options </th>
					</tr>
				</thead>
				<tbody>
					<tr ng-repeat="customer in customers">
						<td data-ng-bind="customer.name"></td>
						<td data-ng-bind="customer.username"></td>
						<td data-ng-bind="customer.address"></td>
						<td align="center">
							<a href="customer/{{customer.customerId}}" class="btn btn-primary btn-sm">
						      	<span class="fa fa-eye"></span> View 
						      </a>
						</td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
</div>