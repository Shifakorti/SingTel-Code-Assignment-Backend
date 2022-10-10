package com.assignment.fish;

import com.assignment.Animal;

public class Fish implements Animal{
	

	@Override
	public void walk() {
		System.out.println("I cannot Walk");
		
	}

	@Override
	public void fly() {
		System.out.println("I cannot Fly");
		
	}

	@Override
	public void sing() {
		System.out.println("I cannot Sing");
		
	}

	@Override
	public void swim() {
		System.out.println("I can Swim");
		
	}
	
}
