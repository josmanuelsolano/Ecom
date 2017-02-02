
	<div class="row" ng-controller="CartsCtrl" ng-init="editCart()">
          <div class="col-sm-12">
              <form class="form-horizontal" role="form" action="/Ecom/carts/update" method="POST">
                  <div class="col-sm-12">
                      <div class="col-sm-5">
                          <div class="form-group">
                            <label class="col-sm-5 control-label">Customer:</label>
                            <div class="col-sm-6">
                              <input class="form-control" type="text" name="id" ng-model="cart.cart.customerId.name" readonly="readonly">
                            </div>
                          </div>
                          <div class="form-group">
                            <label class="col-sm-5 control-label">Cart Amount:</label>
                            <div class="col-sm-6">
                              <input class="form-control" type="text" name="amount" ng-model="cart.cart.amount | currency" readonly="readonly">
                            </div>
                          </div>
                          <div class="form-group">
                            <label class="col-sm-5 control-label">Create Date</label>
                            <div class="col-sm-6">
                              <input class="form-control" type="text" name="createDate" ng-model="{{cart.cart.audit.createDate | date:'yyyy-MM-dd HH:mm:ss'}} " readonly="readonly">
                            </div>
                          </div>
                          <div class="form-group">
                            <label class="col-sm-5 control-label">Update Date</label>
                            <div class="col-sm-6">
                              <input class="form-control" type="text" name="updateDate" ng-model="{{cart.cart.audit.updateDate | date:'yyyy-MM-dd HH:mm:ss'}} " readonly="readonly">
                            </div>
                          </div>
                      </div>
                      <div class="col-sm-6">
                          <div class="table-responsive">
							<table
								class="table table-bordered table-hover table-striped tablesorter">
								<thead>
									<tr>
										<th> Name </th>
										<th> Price </th>
										<th> Quantity </th>
									</tr>
								</thead>
								<tbody>
									<tr ng-repeat="cart in carts">
										<td data-ng-bind="cart.customerId.name"></td>
										<td data-ng-bind="cart.amount | currency"></td>
										<td data-ng-bind="cart.audit.createDate | date:'yyyy-MM-dd HH:mm:ss'"></td>
									</tr>
								</tbody>
							</table>
						</div>
                  </div>
                  <div class="col-sm-3 col-sm-offset-1">
                      	<button type="submit" name="update" class="btn btn-info">Update</button>
                      </div>    
              </form>
          </div>
        </div>
	