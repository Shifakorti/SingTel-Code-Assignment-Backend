package com.assignment.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.assignment.bird.Rooster;

class RoosterTest {

	@Test
	void test() {
		Rooster testRooster=new Rooster();
		testRooster.fly();
		testRooster.sing();
	}
	
	@Test
	void testSing() {
		Rooster testRooster=new Rooster();
		assertEquals(testRooster.sing("French"),true);
		assertEquals(testRooster.sing(),true);

	}

}
