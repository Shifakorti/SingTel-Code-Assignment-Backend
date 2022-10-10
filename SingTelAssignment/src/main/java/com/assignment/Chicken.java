package com.assignment;

public class Chicken extends Bird {
	
	@Override
	public void fly() {
		System.out.println("I cannot fly");
		
	}
	
	@Override
	public void sing() {
		System.out.println("Cluck cluck");
		
	}

}
