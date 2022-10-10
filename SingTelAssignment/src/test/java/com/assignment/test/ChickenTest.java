package com.assignment.test;

import org.junit.jupiter.api.Test;

import com.assignment.bird.Chicken;

class ChickenTest {

	@Test
	void testChicken() {
		Chicken testChicken=new Chicken();
		testChicken.fly();
		testChicken.sing();
	}

}
