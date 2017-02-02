package com.stk.ecom.java.academy.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stk.ecom.java.academy.domain.CartEntity;
import com.stk.ecom.java.academy.domain.OrderEntity;
import com.stk.ecom.java.academy.repositories.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	OrderRepository orderRepository;

	public OrderEntity addOrder(OrderEntity order) {
		if (isValidOrder(order)) {
			return orderRepository.saveAndFlush(order);
		}else{
			return null;
		}
	}

	public OrderEntity updateOrder(OrderEntity order) {
		if(isValidOrder(order)){
			if(orderRepository.exists(order.getOrderId())){
				return orderRepository.saveAndFlush(order);
			}
		}
		return null;
	}

	public List<OrderEntity> listOrders() {
		return orderRepository.findAll();
	}

	public OrderEntity getOrderById(Long id) {
		return orderRepository.getOne(id);
	}

	public boolean removeOrder(Long id) {
		return false;
		
	}
	
	public List<OrderEntity> listOrdersByCart(CartEntity cartEntity) {
		return orderRepository.findAllOrdersByCartId(cartEntity);
	}
	
	private boolean isValidOrder(OrderEntity order){
		if (order.getCartId() == null
				|| order.getProductId() == null
				|| order.getQuantity() == 0.0d) {
			return false;
		}
		return true;
	}

}
