package com.stk.ecom.java.academy.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stk.ecom.java.academy.domain.Cart;
import com.stk.ecom.java.academy.repositories.CartRepository;

@Service
public class CartServiceImpl implements CartService{
	
	@Autowired
	CartRepository cartRepository;

	public Cart addCart(Cart cart) {
		if (isValidCart(cart)) {
			return cartRepository.saveAndFlush(cart);
		}else{
			return null;
		}
	}

	public Cart updateCart(Cart cart) {
		if (isValidCart(cart)) {
			if (cartRepository.exists(cart.getCarId())) {
				Cart updatedCart =  cartRepository.findOne(cart.getCarId());
				return cartRepository.saveAndFlush(updatedCart);
			}
		}
		return null;
	}

	public List<Cart> listCarts() {
		return cartRepository.findAll();
	}

	public Cart getCartById(Long id) {
		return cartRepository.findOne(id);
	}

	public boolean removeCart(Long id) {
		//TODO add functionality
		return false;
		
	}
	
	private boolean isValidCart(Cart cart){
		if (cart.getAmount() == 0.0d) {
			return false;
		}
		return true;
	}
	
}
