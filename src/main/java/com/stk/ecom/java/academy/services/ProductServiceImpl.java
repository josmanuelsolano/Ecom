package com.stk.ecom.java.academy.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stk.ecom.java.academy.domain.Audit;
import com.stk.ecom.java.academy.domain.ProductEntity;
import com.stk.ecom.java.academy.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepository productRepository;

	public ProductEntity addProduct(ProductEntity product) {
		product.setAudit(new Audit(new Date(), new Date()));
		return productRepository.saveAndFlush(product);
	}

	public ProductEntity updateProduct(ProductEntity product) {
		if(isValidProduct(product)){
			if(productRepository.exists(product.getProductId())){
				ProductEntity updatedProduct = productRepository.findOne(product.getProductId());
				updatedProduct.setProductId(product.getProductId());
				updatedProduct.setName(product.getName());
				updatedProduct.setDescription(product.getDescription());
				updatedProduct.setPrice(product.getPrice());
				updatedProduct.setStock(product.getStock());
				updatedProduct.getAudit().setUpdateDate(new Date());
				return productRepository.saveAndFlush(updatedProduct);
			}
		}
		return null;
	}

	public List<ProductEntity> listProducts() {	
		return productRepository.findAll();
	}

	public ProductEntity getProductById(Long id) {
		return productRepository.findOne(id);
	}

	public boolean removeProduct(Long id) {
		return false;
		
	}
	
	private Boolean isValidProduct(ProductEntity product){
		if (product.getName().isEmpty()
				|| product.getName() == null
				|| product.getPrice() == 0.0d
				|| product.getDescription().isEmpty()
				|| product.getDescription() == null) {
			return false;
		}
		return true;
	}

}
