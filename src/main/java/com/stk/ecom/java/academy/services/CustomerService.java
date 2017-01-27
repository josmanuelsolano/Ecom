package com.stk.ecom.java.academy.services;

import java.util.List;

import com.stk.ecom.java.academy.domain.Customer;

public interface CustomerService {
	
	void addCustomer(Customer customer);
	void updateCustomer(Customer customer);
	List<Customer> listCustomers();
	Customer getCustomerById(Long id);
	void removeCustomer(Long id);

}
