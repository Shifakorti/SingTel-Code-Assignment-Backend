package com.assignment;

public class Cat implements Animal {

	@Override
	public boolean walk() {
		System.out.println("I can Walk");
		return true;
		
	}

	@Override
	public boolean fly() {
		System.out.println("I cannot fly");
		return false;
		
	}

	@Override
	public boolean sing() {
		System.out.println("Me ow");
		return true;
		
	}

	@Override
	public boolean swim() {
		System.out.println("I cannot swim");
		return false;
		
	}

}
