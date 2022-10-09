package com.assignment.test;

import org.junit.jupiter.api.Test;

import com.assignment.Bird;

class BirdTest {

	@Test
	void testBird() {
		Bird testBird=new Bird();
		testBird.walk();
		testBird.fly();
		testBird.sing();
	}

}
