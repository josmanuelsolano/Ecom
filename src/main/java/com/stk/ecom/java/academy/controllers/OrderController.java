package com.stk.ecom.java.academy.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.stk.ecom.java.academy.domain.OrderEntity;
import com.stk.ecom.java.academy.services.OrderService;

@Controller
@RequestMapping("orders")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String listOrdersView(){
		return "orders";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<OrderEntity>> listOrders(){
		List<OrderEntity> orders = orderService.listOrders();
		return new ResponseEntity<List<OrderEntity>>(orders, HttpStatus.OK);
	}

}
