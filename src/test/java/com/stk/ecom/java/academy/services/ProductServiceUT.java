package com.stk.ecom.java.academy.services;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import com.stk.ecom.java.academy.repositories.ProductRepository;

@RunWith(MockitoJUnitRunner.class)
public class ProductServiceUT {
	
	@InjectMocks
	private ProductServiceImpl productServiceImpl;
	
	@Mock
	ProductRepository productRepository;

	@Test
	public void listProductsTest() {
		Mockito.when(productRepository.findAll()).thenReturn(null);
		
		Assert.assertNotNull(productServiceImpl.listProducts());
	}

}
