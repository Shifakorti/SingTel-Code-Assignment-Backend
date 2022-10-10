package com.assignment.fish;

import com.assignment.Animal;

public class Fish implements Animal{
	

	@Override
	public boolean walk() {
		System.out.println("I cannot Walk");
		return false;
		
	}

	@Override
	public boolean fly() {
		System.out.println("I cannot Fly");
		return false;
		
	}

	@Override
	public boolean sing() {
		System.out.println("I cannot Sing");
		return false;
		
	}

	@Override
	public boolean swim() {
		System.out.println("I can Swim");
		return true;
		
	}
	
}
