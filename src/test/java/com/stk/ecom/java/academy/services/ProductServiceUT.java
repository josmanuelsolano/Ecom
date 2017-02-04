package com.stk.ecom.java.academy.services;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.stk.ecom.java.academy.domain.Audit;
import com.stk.ecom.java.academy.domain.ProductEntity;
import com.stk.ecom.java.academy.repositories.ProductRepository;

@RunWith(MockitoJUnitRunner.class)
public class ProductServiceUT {
	
	@Mock
	private static ProductRepository productRepository;
	
	@InjectMocks
	private static ProductService productService = new ProductServiceImpl();
	
	private ProductEntity product;
	
	private Audit audit;

	@Test
	public void listProductsTest() {
		Long productId = new Long(1);
		product = new ProductEntity();
		product.setProductId(productId);
		product.setName("Coca-Cola");
		product.setDescription("Refresco de cola 600ml");
		product.setPrice(12.50);
		audit = new Audit();
		audit.setCreateDate(new Date(1485490350000L));
		audit.setUpdateDate(new Date(1485490350000L));
		product.setAudit(audit);
		product.setStock(19.00);
		
		Mockito.when(productRepository.findOne(productId)).thenReturn(product);
		ProductEntity retrivedProduct = productService.getProductById(productId);
		Assert.assertEquals(product, retrivedProduct);
	}
	
	@Test
	public void addProductTest(){
		product = new ProductEntity();
		product.setName("Cheetos");
		product.setDescription("description");
		product.setPrice(12.50);
		audit = new Audit();
		audit.setCreateDate(new Date(1485490350000L));
		audit.setUpdateDate(new Date(1485490350000L));
		product.setAudit(audit);
		product.setStock(20.00);
		
		Mockito.when(productRepository.saveAndFlush(product)).thenReturn(product);
		ProductEntity retrievedProduct = productService.addProduct(product);
		Assert.assertNotNull(retrievedProduct);
		
	}

}
