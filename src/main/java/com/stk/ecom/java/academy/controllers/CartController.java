package com.stk.ecom.java.academy.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.stk.ecom.java.academy.domain.CartEntity;
import com.stk.ecom.java.academy.services.CartService;
import com.stk.ecom.java.academy.services.OrderService;

@Controller
@RequestMapping("carts")
public class CartController {

	@Autowired
	private CartService cartService;

	@Autowired
	private OrderService orderService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String listCartsView() {
		return "carts";
	}

	@RequestMapping(value = "", method = RequestMethod.POST, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<CartEntity>> listCarts() {
		List<CartEntity> carts = cartService.listCarts();
		return new ResponseEntity<List<CartEntity>>(carts, HttpStatus.OK);
	}

	@RequestMapping(value = "/{cartId}", method = RequestMethod.GET)
	public String cartView() {
		return "cartEdit";
	}

	@RequestMapping(value = "/{cartId}", method = RequestMethod.POST,
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<Map<String, Object>> cart(@PathVariable("cartId") Long cartId) {
		Map<String, Object> cartMap = new HashMap<String, Object>();
		cartMap.put("cart", cartService.getCartById(cartId));
		cartMap.put("products", orderService.listOrdersByCart(cartService.getCartById(cartId)));
		return new ResponseEntity<Map<String, Object>>(cartMap, HttpStatus.OK);
	}

}
