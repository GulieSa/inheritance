package com.inheritance;

public class ToysTest {
 public static void main(String[] args) {
	Toys toys=new Toys();
	toys.play();
	
	GirlsToys gT=new GirlsToys();
	gT.play();
	gT.count();
	gT.sleep();
	
	BoysToys bT=new BoysToys();
	bT.count();
	bT.charge();
	bT.play();
	}
 
	 
 }

