package com.pizzahut.model;
import java.util.concurrent.ThreadLocalRandom;
public class Order {

	public String name;
	public String orderId;
	
	public Order(String name) {
		super();
		this.name = name;
		this.orderId =String.valueOf(ThreadLocalRandom.current().nextInt(1,1000));
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
}
