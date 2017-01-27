package com.stk.ecom.java.academy.services;

import java.util.List;

import com.stk.ecom.java.academy.domain.Cart;

public interface CartService {
	
	void addCart(Cart cart);
	void updateCart(Cart cart);
	List<Cart> listCarts();
	Cart getCartById(Long id);
	void removeCart(Long id);

}
