package com.assignment.test;

import org.junit.jupiter.api.Test;

import com.assignment.fish.Fish;

class FishTest {

	@Test
	void testFish() {
		Fish testFish=new Fish();
		testFish.walk();
		testFish.fly();
		testFish.sing();
		testFish.swim();
	}

}
