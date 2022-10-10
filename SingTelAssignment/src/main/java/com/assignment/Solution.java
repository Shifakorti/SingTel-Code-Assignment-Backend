package com.assignment;

import com.assignment.bird.Bird;
import com.assignment.bird.Chicken;
import com.assignment.bird.Duck;
import com.assignment.bird.Parrot;
import com.assignment.bird.Rooster;
import com.assignment.fish.ClownFish;
import com.assignment.fish.Fish;
import com.assignment.fish.Shark;

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
		
		System.out.print("I am Parrot living with dog"+ newLine);
		Parrot parrotLivingWithDog=new Parrot(new Dog());
		parrotLivingWithDog.sing();
		System.out.print( newLine );
		
		System.out.print("I am Parrot living with cat"+ newLine);
		Parrot parrotLivingWithCat=new Parrot(new Cat());
		parrotLivingWithCat.sing();
		System.out.print( newLine );
		
		System.out.print("I am Parrot living with Rooster"+ newLine);
		Parrot parrotLivingWithRooster=new Parrot(new Rooster());
		parrotLivingWithRooster.sing();
		System.out.print( newLine );
		
		System.out.print("I am Parrot living with Ducks"+ newLine);
		Parrot parrotLivingWithDuck=new Parrot(new Duck());
		parrotLivingWithDuck.sing();
		System.out.print( newLine );


		System.out.print("I am ClownFish"+ newLine);
		ClownFish clownFish=new ClownFish();
		clownFish.makeJokes();
		System.out.print( newLine );
		
		
		System.out.print("I am Shark"+ newLine);
		Shark shark=new Shark();
		shark.eatOtherFish();
		System.out.print( newLine );
		
		System.out.print("I am Dolphin"+ newLine);
		Dolphin dolphin=new Dolphin(new Fish());
		dolphin.swim();
		System.out.print( newLine );
		
		
	}

}
