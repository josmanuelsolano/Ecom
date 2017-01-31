package com.stk.ecom.java.academy.services;

import java.util.List;

import com.stk.ecom.java.academy.domain.Customer;

public interface CustomerService {
	
	Customer addCustomer(Customer customer);
	Customer updateCustomer(Customer customer);
	List<Customer> listCustomers();
	Customer getCustomerById(Long id);
	boolean removeCustomer(Long id);

}
