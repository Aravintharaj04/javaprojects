package com.dominos.main;

public class DominosApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaImplementation pizza = new PizzaImplementation();
		System.out.println("Welcome to dominos Pizza");
		System.out.println("Select the PizzaType: Veg-Pizza(1) Non-veg Pizza(2)");
		// pizza.pizzaType();
		if (pizza.pizzaType() == "vegType") {
			pizza.getvegType();
		} else {
			pizza.getnonvegType();
		}
		pizza.getSize();
		pizza.getBaseType();
	}

}
