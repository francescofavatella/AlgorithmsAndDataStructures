package it.develop.algorithms.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaximumSubarrayTest {

	@Test
	void test() {
		int[] input = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int expectedOutput = 6;

		MaximumSubarray classUnderTest = new MaximumSubarray();

		int output = classUnderTest.maxSubArray(input);

		assertEquals(expectedOutput, output, "maximum found");
	}

}
