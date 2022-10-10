package com.assignment.test;

import org.junit.jupiter.api.Test;

import com.assignment.Butterfly;

class ButterflyTest {

	@Test
	void testButterfly() {
		Butterfly butterfly=new Butterfly();
		butterfly.fly();
		butterfly.sing();
		butterfly.walk();
		butterfly.swim();
		
	}
	
	@Test
	void testCaterpillar() {
		Butterfly caterpillar=new Butterfly();
		caterpillar.fly();
		caterpillar.sing();
		caterpillar.walk();
		caterpillar.swim();
		
	}

}
