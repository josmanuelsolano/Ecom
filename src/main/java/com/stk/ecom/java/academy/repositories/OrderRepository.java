package com.stk.ecom.java.academy.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stk.ecom.java.academy.domain.CartEntity;
import com.stk.ecom.java.academy.domain.OrderEntity;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Long>{
	
	public List<OrderEntity> findAllOrdersByCartId(CartEntity cartEntity);
	
}
