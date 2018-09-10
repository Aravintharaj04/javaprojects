package com.assignment;

public class TestMedicine {
	public static void main(String arg[]){
		Medicine m[]=new Medicine[5];
		int random=(int)Math.floor(Math.random()*3);
		m[random]=new Tablet();
		int random1=(int)Math.floor(Math.random()*3);
		m[random1]=new Syrup();
		int random2=(int)Math.floor(Math.random()*3);

		m[random2]=new Ointment();
		m[1].displayLabel();
	}
}
