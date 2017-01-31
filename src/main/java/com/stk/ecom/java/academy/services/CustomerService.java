package com.stk.ecom.java.academy.services;

import java.util.List;

import com.stk.ecom.java.academy.domain.CustomerEntity;

public interface CustomerService {
	
	CustomerEntity addCustomer(CustomerEntity customer);
	CustomerEntity updateCustomer(CustomerEntity customer);
	List<CustomerEntity> listCustomers();
	CustomerEntity getCustomerById(Long id);
	boolean removeCustomer(Long id);

}
