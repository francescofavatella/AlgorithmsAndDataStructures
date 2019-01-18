package it.develop.algorithms.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HouseRobberTest {

	@Test
	void test_1() {
		int[] input = { 1, 2, 3, 1 };
		int expected = 4;

		HouseRobber classUnderTest = new HouseRobber();

		assertEquals(expected, classUnderTest.rob(input));
	}

	@Test
	void test_2() {

		int[] input = { 2, 7, 9, 3, 1 };
		int expected = 12;

		HouseRobber classUnderTest = new HouseRobber();

		assertEquals(expected, classUnderTest.rob(input));
	}
	
	@Test
	void test_3() {
		
		int[] input = {};
		int expected = 0;
		
		HouseRobber classUnderTest = new HouseRobber();
		
		assertEquals(expected, classUnderTest.rob(input));
	}
	
	@Test
	void test_4() {
		
		int[] input = {2,1,1,2};
		int expected = 4;
		
		HouseRobber classUnderTest = new HouseRobber();
		
		assertEquals(expected, classUnderTest.rob(input));
	}


}
