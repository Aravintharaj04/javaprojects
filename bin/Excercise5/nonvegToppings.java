package com.dominos.main;

public enum nonvegToppings {

	BoiledChicken(50), GrilledChicken(75), TandooriChicken(100), BBQchicken(125);

	public int ntopVal;

	private nonvegToppings(int ntopnVal) {
		this.ntopVal = ntopnVal;
	}

	public int getTopnVal() {
		return ntopVal;
	}
}
