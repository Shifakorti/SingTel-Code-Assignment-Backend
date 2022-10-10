package com.assignment.test;

import org.junit.jupiter.api.Test;

import com.assignment.Rooster;

class RoosterTest {

	@Test
	void test() {
		Rooster testRooster=new Rooster();
		testRooster.fly();
		testRooster.sing();
	}

}
