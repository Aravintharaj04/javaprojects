package com.dominos.main;
public class Bill extends VegPizza {
	
	float bill(){
		float total_amount=0;
		total_amount=total_amount+Deluxe_Veggie+getCrustType().crustValue+getPizzaSize().sizeValue;
		return total_amount;
	}
}
