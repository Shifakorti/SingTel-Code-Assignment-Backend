package com.assignment.test;


import org.junit.jupiter.api.Test;

import com.assignment.RoosterDelegation;

class RoosterDelegationTest {

	@Test
	void test() {
		RoosterDelegation testRoosterDelegation=new RoosterDelegation();
		testRoosterDelegation.fly();
		testRoosterDelegation.sing();
	}

}
