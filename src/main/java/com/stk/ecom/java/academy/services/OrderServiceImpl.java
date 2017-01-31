package com.stk.ecom.java.academy.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stk.ecom.java.academy.domain.Order;
import com.stk.ecom.java.academy.repositories.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	OrderRepository orderRepository;

	public Order addOrder(Order order) {
		if (isValidOrder(order)) {
			return orderRepository.saveAndFlush(order);
		}else{
			return null;
		}
	}

	public Order updateOrder(Order order) {
		if(isValidOrder(order)){
			if(orderRepository.exists(order.getOrderId())){
				return orderRepository.saveAndFlush(order);
			}
		}
		return null;
	}

	public List<Order> listOrders() {
		return orderRepository.findAll();
	}

	public Order getOrderById(Long id) {
		return orderRepository.getOne(id);
	}

	public boolean removeOrder(Long id) {
		return false;
		
	}
	
	private boolean isValidOrder(Order order){
		if (order.getCartId() == null
				|| order.getProductId() == null
				|| order.getQuantity() == 0.0d) {
			return false;
		}
		return true;
	}

}
