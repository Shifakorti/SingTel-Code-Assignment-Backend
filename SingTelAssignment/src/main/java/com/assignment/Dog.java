package com.assignment;

public class Dog implements Animal{

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
		System.out.println("Woof woof");
		
	}

	@Override
	public void swim() {
		System.out.println("I can swim");
		
	}

}
