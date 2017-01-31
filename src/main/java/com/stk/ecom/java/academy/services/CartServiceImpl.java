package com.stk.ecom.java.academy.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stk.ecom.java.academy.domain.CartEntity;
import com.stk.ecom.java.academy.repositories.CartRepository;

@Service
public class CartServiceImpl implements CartService{
	
	@Autowired
	CartRepository cartRepository;

	public CartEntity addCart(CartEntity cart) {
		if (isValidCart(cart)) {
			return cartRepository.saveAndFlush(cart);
		}else{
			return null;
		}
	}

	public CartEntity updateCart(CartEntity cart) {
		if (isValidCart(cart)) {
			if (cartRepository.exists(cart.getCarId())) {
				CartEntity updatedCart =  cartRepository.findOne(cart.getCarId());
				return cartRepository.saveAndFlush(updatedCart);
			}
		}
		return null;
	}

	public List<CartEntity> listCarts() {
		return cartRepository.findAll();
	}

	public CartEntity getCartById(Long id) {
		return cartRepository.findOne(id);
	}

	public boolean removeCart(Long id) {
		//TODO add functionality
		return false;
		
	}
	
	private boolean isValidCart(CartEntity cart){
		if (cart.getAmount() == 0.0d) {
			return false;
		}
		return true;
	}
	
}
