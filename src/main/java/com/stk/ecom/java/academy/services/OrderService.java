package com.stk.ecom.java.academy.services;

import java.util.List;

import com.stk.ecom.java.academy.domain.OrderEntity;

public interface OrderService {
	
	OrderEntity addOrder(OrderEntity order);
	OrderEntity updateOrder(OrderEntity order);
	List<OrderEntity> listOrders();
	OrderEntity getOrderById(Long id);
	boolean removeOrder(Long id);
}
