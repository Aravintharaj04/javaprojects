package com.dominos.main;

public class DominosApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//VegPizza v=new VegPizza();
		Bill b=new Bill();
		b.vegPizza();
		b.customizeTopping();
		
		System.out.println(b.Toppings());
		b.crust();
		b.getSize();
		System.out.println(b.bill());
	}

}	
