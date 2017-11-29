package com.abstraction;

public class Concrete extends Abstraction {
 int num = 20;
	@Override
	public void add(int sum) {
		int a = sum + 5;
		System.out.println(a);
		
	}

	@Override
	public void divide(int div) {
		int d = div/2;
		System.out.println(d);
		
	}
	
	public int multiply(int num){
		int m = num * 25;
		
		System.out.println(m);
		return m;
	}
	

}
