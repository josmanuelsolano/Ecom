package com.stk.ecom.java.academy.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.stk.ecom.java.academy.domain.CustomerEntity;
import com.stk.ecom.java.academy.services.CustomerService;

@Controller
@RequestMapping("customers")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String listCustomersView() {
		return "customersList";
	}

	@RequestMapping(value = "customers", method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<CustomerEntity>> listCustomer() {
		List<CustomerEntity> customers = customerService.listCustomers();
		return new ResponseEntity<List<CustomerEntity>>(customers, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{customerId}", method = RequestMethod.GET)
	public String customerView() {
		return "customerView";
	}
	
	@RequestMapping(value = "/{customerId}/view", method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CustomerEntity> customer(@PathVariable("customerId") Long customerId){
		CustomerEntity customer = customerService.getCustomerById(customerId);
		return new ResponseEntity<CustomerEntity>(customer, HttpStatus.OK);
		
	}

	@RequestMapping(value = "/customers/{customerId}", method = RequestMethod.GET)
	public String customerEditView() {
		return "customerEdit";
	}

	@RequestMapping(value = "/customers/{customerId}/edit", method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<CustomerEntity> customerEdit(@PathVariable("customerId") Long customerId) {
		CustomerEntity customer = customerService.getCustomerById(customerId);
		return new ResponseEntity<CustomerEntity>(customer, HttpStatus.OK);
	}
	
	@RequestMapping(value = "", method=RequestMethod.POST)
	public String update(@RequestParam("customerId") Long customerId,
			@RequestParam("username") String username,
			@RequestParam("password") String password,
			@RequestParam("name") String name,
			@RequestParam("address") String address){
		CustomerEntity customer = new CustomerEntity(customerId, username, password, name, address);
		customerService.updateCustomer(customer);
		return "redirect:/customers";
		
	}
	
	@RequestMapping(value = "new", method = RequestMethod.GET)
	public String customerNewView() {
		return "customerNew";
	}
	
	@RequestMapping(value = "new", method = RequestMethod.POST)
	public String customerNew(@RequestParam("username") String username,
			@RequestParam("password") String password,
			@RequestParam("name") String name,
			@RequestParam("address") String address) {
		CustomerEntity customer = new CustomerEntity(username,password, name, address);
		customerService.addCustomer(customer);
		return "redirect:/customers";
		
	}
}
