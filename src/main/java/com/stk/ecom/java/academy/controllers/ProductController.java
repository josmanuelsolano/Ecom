package com.stk.ecom.java.academy.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.stk.ecom.java.academy.domain.ProductEntity;
import com.stk.ecom.java.academy.services.ProductService;

@Controller
@RequestMapping("products")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String listProductsView(){
		return "products";	
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ProductEntity>> listProducts(){
		List<ProductEntity> products = productService.listProducts();
		return new ResponseEntity<List<ProductEntity>>(products, HttpStatus.OK);
	}

}
