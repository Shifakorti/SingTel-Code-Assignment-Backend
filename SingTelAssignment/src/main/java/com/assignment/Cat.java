package com.assignment;

public class Cat implements Animal {

	@Override
	public void walk() {
		System.out.println("I can Walk");
		
	}

	@Override
	public void fly() {
		System.out.println("I cannot fly");
		
	}

	@Override
	public void sing() {
		System.out.println("Me ow");
		
	}

	@Override
	public void swim() {
		System.out.println("I cannot swim");
		
	}

}
