package com.dominos.main;

public enum PizzaSize {
	Medium (50),
	Regular (0),
	Large(100);
	public int sizeValue;
	PizzaSize(int sizeValue){
		this.sizeValue=sizeValue;
	}
}
