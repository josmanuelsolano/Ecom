package com.stk.ecom.java.academy.services;

import java.util.List;

import com.stk.ecom.java.academy.domain.Product;


public interface ProductService {
	
	Product addProduct(Product product);
	Product updateProduct(Product product);
	List<Product> listProducts();
	Product getProductById(Long id);
	boolean removeProduct(Long id);
}
