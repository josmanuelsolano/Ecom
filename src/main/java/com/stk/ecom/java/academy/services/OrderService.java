package com.stk.ecom.java.academy.services;

import java.util.List;

import com.stk.ecom.java.academy.domain.Order;

public interface OrderService {
	
	Order addOrder(Order order);
	Order updateOrder(Order order);
	List<Order> listOrders();
	Order getOrderById(Long id);
	boolean removeOrder(Long id);
}
