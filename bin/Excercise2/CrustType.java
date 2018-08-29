package com.dominos.main;

public enum CrustType {
	
	New_Hand_Tossed(10),Wheat_Thin_Crust(30),Cheese_Burst(50),Fresh_Pan_Pizza(10),Classic_Hand_Tossed(20);
	int crustValue;
	
	private CrustType(int crustValue){
		this.crustValue=crustValue;
	}
}
