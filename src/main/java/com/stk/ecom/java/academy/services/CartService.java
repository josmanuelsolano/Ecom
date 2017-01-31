package com.stk.ecom.java.academy.services;

import java.util.List;

import com.stk.ecom.java.academy.domain.CartEntity;

public interface CartService {
	
	CartEntity addCart(CartEntity cart);
	CartEntity updateCart(CartEntity cart);
	List<CartEntity> listCarts();
	CartEntity getCartById(Long id);
	boolean removeCart(Long id);

}
