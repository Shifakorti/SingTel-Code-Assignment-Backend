package com.assignment.test;



import org.junit.jupiter.api.Test;

import com.assignment.Cat;
import com.assignment.Dog;
import com.assignment.Duck;
import com.assignment.Parrot;
import com.assignment.Phone;
import com.assignment.Rooster;

class ParrotTest {

	@Test
	void parrotLivingWithDogTest() {
		Parrot parrotLivingWithDog=new Parrot(new Dog());
		parrotLivingWithDog.sing();
	}
	
	@Test
	void parrotLivingWithCatTest() {
		Parrot parrotLivingWithCat=new Parrot(new Cat());
		parrotLivingWithCat.sing();
	}
	
	@Test
	void parrotLivingWithRoosterTest() {
		Parrot parrotLivingWithRooster=new Parrot(new Rooster());
		parrotLivingWithRooster.sing();
	}
	
	@Test
	void parrotLivingWithDuckTest() {
		Parrot parrotLivingWithDuck=new Parrot(new Duck());
		parrotLivingWithDuck.sing();
	}
	
	@Test
	void parrotLivingWithPhoneTest() {
		Parrot parrotLivingWithPhone=new Parrot(new Phone());
		parrotLivingWithPhone.sing();
	}
	
	@Test
	void parrotLivingWithPhoneMethodTest() {
		Parrot parrotLivingWithPhoneMethod=new Parrot();
		parrotLivingWithPhoneMethod.livingWith(new Phone());
		parrotLivingWithPhoneMethod.sing();
	}

}
