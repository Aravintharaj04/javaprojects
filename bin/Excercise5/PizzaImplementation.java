package com.dominos.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PizzaImplementation implements Pizza {

	int sum = 0;
	String pizzaType;
	float bill;
	private vegToppings vegType;
	private nonvegToppings nonvegType;

	private PizzaSize size;
	private BaseType baseType;

	Scanner scanner = new Scanner(System.in);

	public String pizzaType() {
		try {
			int choice = scanner.nextInt();
			if (choice == 1) {
				pizzaType = "vegType";
			} else if (choice == 2) {
				pizzaType = "nonVegType";
			} else {
				System.out.println("You entered wrongly kindly choose correct option");
				pizzaType();
			}
		} catch (InputMismatchException e) {
			System.out.println("You entered wrongly kindly choose correct option");
			pizzaType();
		}
		return pizzaType;
	}

	public PizzaSize getSize() {

		int count = 0;
		for (PizzaSize ps : PizzaSize.values()) {
			count++;
			System.out.println(count + " " + ps + " " + ps.sizeVal);
		}
		int choice1 = scanner.nextInt();

		switch (choice1) {
		case 1:
			setSize(PizzaSize.SMALL);
			break;
		case 2:
			setSize(PizzaSize.MEDIUM);
			break;
		case 3:
			setSize(PizzaSize.LARGE);
			break;
		default:
			System.out.println("Kindly enter correct option");

			getSize();
		}
		return size;
	}

	public void setSize(PizzaSize size) {
		this.size = size;
	}

	@Override
	public BaseType getBaseType() {
		System.out.println("We offer following pizza base types:");
		int cn = 0;
		do {
			int count = 0;
			for (BaseType bt : BaseType.values()) {
				count++;
				System.out.println(count + " " + bt + " " + bt.baseVal);
			}
			try {
				int choice2 = scanner.nextInt();

				switch (choice2) {
				case 1:
					setBaseType(BaseType.THINCRUST);
					break;
				case 2:
					setBaseType(BaseType.THICKCRUST);
					break;
				case 3:
					setBaseType(BaseType.CHEESEBURST);
					break;
				case 4:
					setBaseType(BaseType.HANDTOSSED);
					break;
				case 5:
					setBaseType(BaseType.PANPIZZA);
					break;
				default:
					System.out.println("wrong choice try again");
					getBaseType();
				}
			} catch (InputMismatchException ex) {
				System.out.println("plz enter correct choice");
				getBaseType();
				cn++;
			}
			return baseType;
		} while (cn <= 3);
	}

	public void setBaseType(BaseType baseType) {
		this.baseType = baseType;
	}

	public vegToppings getvegType() {
		System.out.println("Veg toppings are:");
		int cn = 0;
		do {
			int count = 0;
			for (vegToppings vt : vegToppings.values()) {
				count++;
				System.out.println(count + " " + vt + " " + vt.topVal);
			}
			try {
				System.out.println("Select your VegTopping");
				int choice3 = scanner.nextInt();

				switch (choice3) {
				case 1:
					setVeg(vegToppings.sweetcorn);
					break;
				case 2:
					setVeg(vegToppings.onion);
					break;
				case 3:
					setVeg(vegToppings.capsicum);
					break;
				case 4:
					setVeg(vegToppings.tomato);
					break;
				default:
					System.out.println("plz enter correct choice");
					getvegType();
				}
			} catch (InputMismatchException ex) {
				System.out.println("enter only number");
				getvegType();
				cn++;
			}
			return vegType;
		} while (cn <= 3);
	}

	public void setVeg(vegToppings vegType) {
		this.vegType = vegType;
	}

	public nonvegToppings getnonvegType() {
		System.out.println("Nonveg toppings are:");
		int cn = 0;
		do {
			int count = 0;
			for (nonvegToppings nvt : nonvegToppings.values()) {
				count++;
				System.out.println(count + " " + nvt + " " + nvt.ntopVal);
			}
			try {
				int choice4 = scanner.nextInt();

				switch (choice4) {
				case 1:
					setNonveg(nonvegToppings.BoiledChicken);
					break;
				case 2:
					setNonveg(nonvegToppings.GrilledChicken);
					break;
				case 3:
					setNonveg(nonvegToppings.TandooriChicken);
					break;
				case 4:
					setNonveg(nonvegToppings.BBQchicken);
					break;
				default:
					System.out.println("plz enter correct choice and  give again");

					getnonvegType();
				}
			} catch (InputMismatchException ex) {
				System.out.println("enter only number");

				getnonvegType();
				cn++;
			}
			return nonvegType;
		} while (cn <= 3);

	}

	public void setNonveg(nonvegToppings nonvegType) {
		this.nonvegType = nonvegType;
	}
	

}
