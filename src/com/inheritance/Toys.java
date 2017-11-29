package com.inheritance;

public class Toys {

	String color;
	String toyName = "toys";
	int toyCount;

	public Toys() {
		System.out.println("This is parent constractor");
	};

	public void play() {
		System.out.println("Kids playing :" + toyName);
	}

}
