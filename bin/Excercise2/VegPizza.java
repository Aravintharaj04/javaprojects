package com.dominos.main;

import java.util.*;

public class VegPizza implements Pizza {
	List<String> vegTopping = new ArrayList<String>();
	public CrustType crustType;
	public PizzaSize pizzaSize;
	
	int Deluxe_Veggie=265;
	Scanner sc = new Scanner(System.in);
	Iterator i = vegTopping.iterator();

	public List<String> Toppings() {
		// TODO Auto-generated method stub
		if (vegTopping.isEmpty()) {
			vegTopping.add("onion");
			vegTopping.add("capsicum");
			vegTopping.add("grilled");
			vegTopping.add("mushroom");
			vegTopping.add("corn");
		}
		return vegTopping;
	}

	public void addRemoveTopping(String topping) {
		if (vegTopping.contains(topping)) {
			vegTopping.remove(topping);
		} else {
			vegTopping.add(topping);
		}
	}

	public void vegPizza() {
		System.out.println("Deluxe_Veggie");
		System.out.println(Toppings());
	}

	public void customizeTopping() {
		System.out.println("Add new Topping(1) or Replace Existing Topping(2)");
		int choice = sc.nextInt();
		if (choice == 1) {
			String topping = sc.next();
			addRemoveTopping(topping);
		} else {

			System.out.println("Which topping you want to remove");
			System.out.println(Toppings());
			String choice1 = sc.next();
			addRemoveTopping(choice1);
			System.out.println("Enter your preferable toppings");
			String choice2 = sc.next();
			addRemoveTopping(choice2);
		}

	}

	int count = 1;

	public CrustType getCrustType() {
		return crustType;
	}

	public void setCrustType(CrustType crustType) {
		this.crustType = crustType;
	}

	public CrustType crust() {
		for (CrustType b : CrustType.values()) {
			System.out.println(count + ".  " + b + " - " + b.crustValue);
			count++;
		}
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			setCrustType(CrustType.New_Hand_Tossed);
			break;
		case 2:
			setCrustType(CrustType.Wheat_Thin_Crust);
			break;
		case 3:
			setCrustType(CrustType.Cheese_Burst);
			break;
		case 4:
			setCrustType(CrustType.Fresh_Pan_Pizza);
			break;
		case 5:
			setCrustType(CrustType.Classic_Hand_Tossed);
			break;
		}
		return crustType;
	}
	public PizzaSize getPizzaSize() {
		return pizzaSize;
	}

	public void setPizzaSize(PizzaSize pizzaSize) {
		this.pizzaSize = pizzaSize;
	}
	public PizzaSize getSize(){
		int count=1;
		for(PizzaSize s:PizzaSize.values()){
			System.out.println(count+".  "+ s+" - "+s.sizeValue);
			count++;
		}
		int choice=sc.nextInt();
    	switch(choice){
		case 1:setPizzaSize(PizzaSize.Medium);break;
		case 2:setPizzaSize(PizzaSize.Regular);break;
		case 3:setPizzaSize(PizzaSize.Large);break;
		}
		return pizzaSize;
	}
}
