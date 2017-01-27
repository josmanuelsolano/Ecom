package com.stk.ecom.java.academy.services;

import java.util.List;

import com.stk.ecom.java.academy.domain.Order;

public interface OrderService {
	
	void addOrder(Order order);
	void updateOrder(Order order);
	List<Order> listOrders();
	Order getOrderById(Long id);
	void removeOrder(Long id);
}
