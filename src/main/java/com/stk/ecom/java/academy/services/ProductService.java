package com.stk.ecom.java.academy.services;

import java.util.List;

import com.stk.ecom.java.academy.domain.Product;


public interface ProductService {
	
	void addProduct(Product product);
	void updateProduct(Product product);
	List<Product> listProducts();
	Product getProductById(Long id);
	void removeProduct(Long id);
}
