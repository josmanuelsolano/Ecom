package com.stk.ecom.java.academy.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "order")
public class Order implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private OrderKey orderId;
	
	@Column(name="quantity", nullable = false)
	private int quantity;
	
	@Column(name="amount", nullable = false)
	private double amount;
	
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}
