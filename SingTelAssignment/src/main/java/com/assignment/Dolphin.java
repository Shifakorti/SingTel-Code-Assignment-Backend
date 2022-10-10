package com.assignment;

import com.assignment.fish.Fish;

public class Dolphin implements Animal {
	
	Fish fish;
	
	public Dolphin()
	{
		
	}
	public Dolphin(Fish fish)
	{
		this.fish=fish;
	}
	
	public void hasFishBehaviour(Fish fish) {
		this.fish=fish;
	}

	@Override
	public void walk() {
		fish.walk();
		
	}

	@Override
	public void fly() {
		fish.fly();
		
	}

	@Override
	public void sing() {
		fish.sing();
		
	}

	@Override
	public void swim() {
		fish.swim();
		
	}

}
