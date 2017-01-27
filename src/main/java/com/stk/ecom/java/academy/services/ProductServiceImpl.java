package com.stk.ecom.java.academy.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stk.ecom.java.academy.domain.Product;
import com.stk.ecom.java.academy.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepository productRepository;

	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		
	}

	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		
	}

	public List<Product> listProducts() {
		
		return productRepository.findAll();
	}

	public Product getProductById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeProduct(Long id) {
		// TODO Auto-generated method stub
		
	}

}
