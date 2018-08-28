package com.dominos.main;

public enum PizzaSize {

	SMALL(9), MEDIUM(12), LARGE(15);

	public int sizeVal;

	private PizzaSize(int sizeVal) {
		this.sizeVal = sizeVal;
	}

	public int getSizeVal() {
		return sizeVal;
	}

	public void setSizeVal(int sizeVal) {
		this.sizeVal = sizeVal;
	}

}
