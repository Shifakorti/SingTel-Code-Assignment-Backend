package com.assignment;

public class Frog implements Animal {

	@Override
	public boolean walk() {
		System.out.println("I can walk");
		return true;
		
	}
	
	@Override
	public boolean fly() {
		System.out.println("I cannot fly");
		return false;
	}
	
	@Override
	public boolean sing() {
		System.out.println("I can sing");
		return true;
		
	}


	@Override
	public boolean swim() {
		System.out.println("I can swim");
		return true;
		
	}

}
