<div class="row" data-ng-controller="CustomersCtrl"
	data-ng-init="getCustomers()">
	<div class="col-lg-12">
		<div class="table-responsive">
			<table
				class="table table-bordered table-hover table-striped tablesorter">
				<thead>
					<tr>
						<th>Name</th>
						<th>Username</th>
						<th>Address</th>
						<th>Options</th>
					</tr>
				</thead>
				<tbody>
					<tr data-ng-repeat="customer in customers">
						<td data-ng-bind="customer.name"></td>
						<td data-ng-bind="customer.username"></td>
						<td data-ng-bind="customer.address"></td>
						<td align="center"><a
							href="customers/{{customer.customerId}}"
							class="btn btn-primary btn-xs"> <span class="fa fa-eye"></span>
								View
						</a> <a href="customers/{{customer.customerId}}"
							class="btn btn-warning btn-xs"> <span class="fa fa-edit"></span>
								Edit
						</a></td>
					</tr>
				</tbody>
			</table>
		</div>
		<a href="" class="btn btn-success btn-lg"> <span
			class="fa fa-plus"></span> Add customer
		</a>
	</div>
</div>