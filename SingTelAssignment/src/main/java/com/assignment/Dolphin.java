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
	public boolean walk() {
		if (fish==null)
			return false;
		else
		return fish.walk();
		
	}

	@Override
	public boolean fly() {
		if (fish==null)
			return false;
		else
		return fish.fly();
		
	}

	@Override
	public boolean sing() {
		if (fish==null)
			return false;
		else
		return fish.sing();
		
	}

	@Override
	public boolean swim() {
		if (fish==null)
			return true;
		else
		return fish.swim();
		
	}

}
