package com.assignment;

import com.assignment.bird.Chicken;

public class RoosterDelegation {
	
	Chicken chickenDelegation=new Chicken();
	
	
	
	public void fly() {
		chickenDelegation.fly();
	}
	
	public void sing() {
		System.out.println("Cock-a-doodle-doo");
		
	}
	

}
