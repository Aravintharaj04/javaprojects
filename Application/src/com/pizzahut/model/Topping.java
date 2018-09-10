package com.pizzahut.model;

public class Topping {
	private String name;
	private String defaultQty;
	private PizzaType type;
	
	public Topping(String name, PizzaType type) {
		super();
		this.name = name;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public PizzaType getType() {
		return type;
	}
	public void setType(PizzaType type) {
		this.type = type;
	}
	public String toString(){
		return name;
	}
}
