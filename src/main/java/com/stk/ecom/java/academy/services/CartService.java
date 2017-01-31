package com.stk.ecom.java.academy.services;

import java.util.List;

import com.stk.ecom.java.academy.domain.Cart;

public interface CartService {
	
	Cart addCart(Cart cart);
	Cart updateCart(Cart cart);
	List<Cart> listCarts();
	Cart getCartById(Long id);
	boolean removeCart(Long id);

}
