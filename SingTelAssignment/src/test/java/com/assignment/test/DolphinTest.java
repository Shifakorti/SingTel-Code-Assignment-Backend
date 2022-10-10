package com.assignment.test;

import org.junit.jupiter.api.Test;

import com.assignment.Dolphin;
import com.assignment.fish.Fish;

class DolphinTest {
	

	@Test
	void testDolphinFish() {
		Dolphin testDolphin=new Dolphin(new Fish());
		testDolphin.walk();
		testDolphin.fly();
		testDolphin.sing();
		testDolphin.swim();
	}

}
