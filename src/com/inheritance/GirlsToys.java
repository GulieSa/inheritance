package com.inheritance;

public class GirlsToys extends Toys{
	String girlName="Macy";
	String toyName="doll";
	String color="red";
	int count=2;
	
	public GirlsToys(){
		super();
		System.out.println("This is girls constractor");
	}
	
	
	public void sleep(){
		System.out.println(girlName+"'s " + toyName + " is sleeping");
	}
    public int count(){
    	System.out.println(girlName + " has " + count + " " + toyName + "(s)");
    	return count;
    }
    public void play(){
    	System.out.println(girlName+" is playing " + toyName);
    }
}
