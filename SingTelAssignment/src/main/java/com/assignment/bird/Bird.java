package com.assignment.bird;

import com.assignment.Animal;

public class Bird implements Animal{

	@Override
	public boolean walk() {
		System.out.println("I can Walk");
		return true;
		
	}
	
	@Override
	public boolean fly() {
		System.out.println("I can fly");
		return true;
		
	}
	
	@Override
	public boolean sing() {
		System.out.println("I can sing");
		return true;
		
	}


	@Override
	public boolean swim() {
		System.out.println("I cannot swim");
		return false;
		
	}

}
