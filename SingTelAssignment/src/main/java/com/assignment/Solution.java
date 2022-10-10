package com.assignment;

public class Solution {
	
	public static void main(String[] args)
	{
		String newLine=System.lineSeparator();
		System.out.print("I am Bird"+ newLine );
		System.lineSeparator();
		Bird bird=new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
		System.out.print( newLine );
		
		System.out.print("I am Duck" +newLine);
		Duck duck=new Duck();
		duck.sing();
		duck.swim();
		System.out.print( newLine );
		
		System.out.print("I am Chicken"+newLine);
		Chicken chicken=new Chicken();
		chicken.sing();
		chicken.fly();
		System.out.print( newLine );
		
		System.out.print("I am Rooster"+newLine);
		Rooster rooster=new Rooster();
		rooster.sing();
		rooster.fly();
		System.out.print( newLine );
		
		System.out.print("I am RoosterDelegation"+ newLine);
		Rooster roosterDelegation=new Rooster();
		roosterDelegation.fly();
		roosterDelegation.sing();
		System.out.print( newLine );
		
		
	}

}
