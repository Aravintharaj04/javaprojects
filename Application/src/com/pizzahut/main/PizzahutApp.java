package com.pizzahut.main;
import com.pizzahut.model.Order;
import com.pizzahut.model.PizzaType;
import com.pizzahut.model.Topping;
import com.pizzahut.model.Pizza;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.List;
import java.util.Map;


public class PizzahutApp {
	public static Scanner sc=new Scanner(System.in);
	public static List<Topping> toppings;
	public static int choice;
	public static void main(String[] args) {
		toppings=loadToppings();
		String name=greeting();
		Order order=new Order(name);
		showMenu();
	}
	private static String greeting(){
		System.out.println("Welcome To Pizzahut, Please enter your name to register");
		String name=sc.next();
		return name;
	}
	private static void showMenu(){
		System.out.println("Pizza Types:"+PizzaType.VEG+" & "+PizzaType.NON_VEG );
		showPizzaList(getPizzaType());
	}
	private static Pizza pizzaOrder(){
		PizzaType type=getPizzaType();
		Pizza pizza=new Pizza(type);
		
		return pizza;
	}
	private static void showPizzaList(PizzaType type){
		if(type.equals(PizzaType.VEG)){
			System.out.print("1.Deluxe_Veggie: \tToppings");
			System.out.println(toppings.subList(0,4));
			System.out.print("2.Panner Pizza: \tToppings");

			System.out.println(toppings.subList(2,6));
			System.out.print("3.Veg Extravaganza: \tToppings");

			System.out.println(toppings.subList(1,5));
			System.out.print("4.Cheeseburst: \t\tToppings");

			System.out.println(toppings.subList(3,7));

		}else if(type.equals(PizzaType.NON_VEG)){
			System.out.print("1.Chicken Supreme: \tToppings");
			System.out.println(toppings.subList(8, 11));
			System.out.print("2.Chicken Tikka: \tToppings");

			System.out.println(toppings.subList(9, 12));
			System.out.print("3.BBQ Chicken Pizza: \tToppings");

			System.out.println(toppings.subList(10,13));
			System.out.print("4.Chicken Deluxe: \tToppings");

			System.out.println(toppings.subList(9,13));
		}
		else{
			System.out.println("Pizzatype is not choosed");
		}
		
	}
	private static List<Topping> loadToppings(){
		List<Topping> topping = new ArrayList<>();
		topping.add((new Topping("onion",PizzaType.VEG)));
		topping.add((new Topping("capsicum",PizzaType.VEG)));
		topping.add((new Topping("grilled",PizzaType.VEG)));
		topping.add((new Topping("mushroom",PizzaType.VEG)));
		topping.add((new Topping("corn",PizzaType.VEG)));
		topping.add((new Topping("Roasted Garlic",PizzaType.VEG)));
		topping.add((new Topping("Pepproni",PizzaType.VEG)));
		topping.add((new Topping("Green olives",PizzaType.VEG)));
		
		topping.add((new Topping("BBQ",PizzaType.NON_VEG)));
		topping.add((new Topping("garlic chicken",PizzaType.NON_VEG)));
		topping.add((new Topping("Roasted Red Peppers",PizzaType.NON_VEG)));
		topping.add((new Topping("Pepper chicken",PizzaType.NON_VEG)));
		topping.add((new Topping("Hot banana Peppers",PizzaType.NON_VEG)));
		topping.add((new Topping("grilled chicken",PizzaType.NON_VEG)));
		return topping;
		
	}
	private static PizzaType getPizzaType() {
		int count = 0;
		System.out.println("Select : (1) for VEG and (2) for Non VEG");
		String type = null;

		Map<String, PizzaType> mapValue = new HashMap<>();
		mapValue.put("1", PizzaType.VEG);
		mapValue.put("2", PizzaType.NON_VEG);

		do {
			type = sc.nextLine();
			if (!mapValue.keySet().contains(type) ){
				if (count >= 3) {
					System.out.println("You selected more than 3 times, Pizza order terminated");
					System.exit(0);
				} else {
					count++;
					System.out.println("Please enter correct value");
				}

			} else {
				break;
			}
		} while (count < 4);

		return mapValue.get(type);
	}
}
