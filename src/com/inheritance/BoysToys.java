package com.inheritance;

public class BoysToys extends GirlsToys {
	String boyName = "Bob";
	String toyName = "car";
	String color = "blue";
	int count = 5;
	
	public void charge() {
		System.out.println(boyName + " is charging his " + toyName);
	}
	public int count() {
    	System.out.println(boyName + " has " + count + " " + toyName);
    	return count;
	}
	
	public void play() {
		 System.out.println(boyName + " is playing " + toyName);
	}
	
}
