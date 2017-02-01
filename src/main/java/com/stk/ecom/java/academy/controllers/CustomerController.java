package com.stk.ecom.java.academy.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.stk.ecom.java.academy.domain.CustomerEntity;
import com.stk.ecom.java.academy.services.CustomerService;

@Controller
@RequestMapping("customers")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String listCustomersView(){
		return "customers";
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<CustomerEntity>> listCustomer(){
		List<CustomerEntity> customers = customerService.listCustomers();
		return new ResponseEntity<List<CustomerEntity>>(customers, HttpStatus.OK);
	}

}
