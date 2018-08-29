package com.dominos.main;
import java.util.*;
public interface Pizza {
	public List<String> Toppings();
	public CrustType crust();
	public PizzaSize getSize();
}
