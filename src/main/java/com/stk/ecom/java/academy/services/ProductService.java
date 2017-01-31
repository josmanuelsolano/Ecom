package com.stk.ecom.java.academy.services;

import java.util.List;

import com.stk.ecom.java.academy.domain.ProductEntity;


public interface ProductService {
	
	ProductEntity addProduct(ProductEntity product);
	ProductEntity updateProduct(ProductEntity product);
	List<ProductEntity> listProducts();
	ProductEntity getProductById(Long id);
	boolean removeProduct(Long id);
}
