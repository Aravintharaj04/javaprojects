package com.dominos.main;

public enum vegToppings {

	sweetcorn(100), onion(150), capsicum(200), tomato(250);
	public int topVal;

	private vegToppings(int topnVal) {
		this.topVal = topnVal;
	}

	public int getTopnVal() {
		return topVal;
	}

}
