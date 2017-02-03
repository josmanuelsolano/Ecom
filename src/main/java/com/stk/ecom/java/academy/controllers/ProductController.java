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

import com.stk.ecom.java.academy.domain.ProductEntity;
import com.stk.ecom.java.academy.services.ProductService;

@Controller
@RequestMapping("products")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String listProductsView(){
		return "productsList";	
	}
	
	@RequestMapping(value = "products", method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ProductEntity>> listProducts(){
		List<ProductEntity> products = productService.listProducts();
		return new ResponseEntity<List<ProductEntity>>(products, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{productId}", method = RequestMethod.GET)
	public String productView() {
		return "productView";
	}
	
	@RequestMapping(value = "/{productId}/view", method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ProductEntity> product(@PathVariable("productId") Long productId){
		ProductEntity product = productService.getProductById(productId);
		return new ResponseEntity<ProductEntity>(product, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/products/{productId}", method = RequestMethod.GET)
	public String productEditView() {
		return "productEdit";
	}
	
	@RequestMapping(value = "/products/{productId}/edit", method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ProductEntity> productEdit(@PathVariable("productId") Long productId){
		ProductEntity product = productService.getProductById(productId);
		return new ResponseEntity<ProductEntity>(product, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/update", method=RequestMethod.POST)
	public String update(@RequestParam("productId") Long productId,
			@RequestParam("name") String name,
			@RequestParam("price") double price,
			@RequestParam("stock") double stock,
			@RequestParam("description") String description){
		
		ProductEntity product = productService.getProductById(productId);
		product.setProductId(productId);
		product.setName(name);
		product.setPrice(price);
		product.setStock(stock);
		product.setDescription(description);
		
		if(product == productService.updateProduct(product)){
			return "productsList";
		}
		
		
		return "productsList";
		
	}
	
}
