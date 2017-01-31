package com.stk.ecom.java.academy.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.stk.ecom.java.academy.domain.CartEntity;
import com.stk.ecom.java.academy.services.CartService;

@Controller
@RequestMapping("carts")
public class CartController {
	
	@Autowired
	private CartService cartService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String listCartsView(){
		return "carts";	
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<CartEntity>> listCarts(){
		List<CartEntity> carts = cartService.listCarts();
		return new ResponseEntity<List<CartEntity>>(carts, HttpStatus.OK);
	}

}
