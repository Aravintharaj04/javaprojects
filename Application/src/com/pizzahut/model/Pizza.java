package com.pizzahut.model;

public class Pizza {
	private PizzaType type;

	public Pizza(PizzaType type) {
		super();
		this.type = type;
	}

	public PizzaType getType() {
		return type;
	}

	public void setType(PizzaType type) {
		this.type = type;
	}

	public String toString(){
		return type.toString();
	}
}
