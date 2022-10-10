package com.assignment.test;

import org.junit.jupiter.api.Test;

import com.assignment.Chicken;

class ChickenTest {

	@Test
	void testChicken() {
		Chicken testChicken=new Chicken();
		testChicken.fly();
		testChicken.sing();
	}

}
