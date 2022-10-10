package com.assignment;

public class Solution {
	
	public static void main(String[] args)
	{
		Bird bird=new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
		
		Duck duck=new Duck();
		duck.sing();
		duck.swim();
		
		Chicken chicken=new Chicken();
		chicken.sing();
		chicken.fly();
	}

}
