package com.stk.ecom.java.academy.services;

import java.sql.Timestamp;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.stk.ecom.java.academy.domain.Audit;
import com.stk.ecom.java.academy.domain.Product;
import com.stk.ecom.java.academy.repositories.ProductRepository;

@RunWith(MockitoJUnitRunner.class)
public class ProductServiceUT {
	
	@Mock
	private static ProductRepository productRepository;
	
	@InjectMocks
	private static ProductService productService = new ProductServiceImpl();
	
	private Product product;
	
	private Audit audit;

	@Test
	public void listProductsTest() {
		Long productId = new Long(1);
		product = new Product();
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
		Product retrivedProduct = productService.getProductById(productId);
		Assert.assertEquals(product, retrivedProduct);
	}

}
