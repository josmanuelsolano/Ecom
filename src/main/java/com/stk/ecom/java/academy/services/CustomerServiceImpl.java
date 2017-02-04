package com.stk.ecom.java.academy.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stk.ecom.java.academy.domain.CustomerEntity;
import com.stk.ecom.java.academy.repositories.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerRepository customerRepository;

	public CustomerEntity addCustomer(CustomerEntity customer) {
		return customerRepository.saveAndFlush(customer);	
	}

	public CustomerEntity updateCustomer(CustomerEntity customer) {
		if (isValidCustomer(customer)) {
			if(customerRepository.exists(customer.getCustomerId())){
				CustomerEntity updatedCustomer = customerRepository.findOne(customer.getCustomerId());
				updatedCustomer.setCustomerId(customer.getCustomerId());
				updatedCustomer.setUsername(customer.getUsername());
				updatedCustomer.setPassword(customer.getPassword());
				updatedCustomer.setName(customer.getName());
				updatedCustomer.setAddress(customer.getAddress());
				return customerRepository.saveAndFlush(updatedCustomer);
			}
		}
		return null;
	}

	public List<CustomerEntity> listCustomers() {
		return customerRepository.findAll();
	}

	public CustomerEntity getCustomerById(Long id) {
		return customerRepository.findOne(id);
	}

	public boolean removeCustomer(Long id) {
		return false;
		
	}
	
	private boolean isValidCustomer(CustomerEntity customer){
		if(customer.getUsername().isEmpty()
				|| customer.getUsername() == null
				|| customer.getPassword().isEmpty()
				|| customer.getPassword() == null
				|| customer.getName().isEmpty()
				|| customer.getName() == null
				|| customer.getAddress().isEmpty()
				|| customer.getAddress() == null){
			return false;
		}
		return true;
	}

}
