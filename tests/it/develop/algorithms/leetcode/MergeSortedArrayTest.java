package it.develop.algorithms.leetcode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MergeSortedArrayTest {

	@Test
	void test_merge() {
		int[] expected = { 1, 2, 2, 3, 5, 6 };

		MergeSortedArray classUnderTest = new MergeSortedArray();

		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int[] nums2 = { 2, 5, 6 };
		int m = 3;
		int n = 3;

		classUnderTest.merge(nums1, m, nums2, n);

		assertArrayEquals(expected, nums1, "array is sorted");
	}

	@Test
	void test_merge_firstArrayShorterThanTheSecond() {
		int[] expected = { 1, 2, 2, 3, 5, 6 };

		MergeSortedArray classUnderTest = new MergeSortedArray();

		int[] nums1 = { 1, 2, 0, 0, 0, 0 };
		int[] nums2 = { 2, 3, 5, 6 };
		int m = 2;
		int n = 4;

		classUnderTest.merge(nums1, m, nums2, n);

		assertArrayEquals(expected, nums1, "array is sorted");
	}

	@Test
	void test_merge_SecondArrayShorterThanTheFirst() {
		int[] expected = { 1, 2, 2, 3, 5, 6 };

		MergeSortedArray classUnderTest = new MergeSortedArray();

		int[] nums1 = { 1, 2, 3, 5, 0, 0 };
		int[] nums2 = { 2, 6 };
		int m = 4;
		int n = 2;

		classUnderTest.merge(nums1, m, nums2, n);

		assertArrayEquals(expected, nums1, "array is sorted");
	}

	@Test
	void test_merge_WithEmtpyArray() {
		int[] expected = { 1 };

		MergeSortedArray classUnderTest = new MergeSortedArray();

		int[] nums1 = { 1 };
		int[] nums2 = {};
		int m = 1;
		int n = 0;

		classUnderTest.merge(nums1, m, nums2, n);

		assertArrayEquals(expected, nums1, "array is sorted");
	}

	@Test
	void test_merge_WithEmtpy1Array() {
		int[] expected = { 1 };

		MergeSortedArray classUnderTest = new MergeSortedArray();

		int[] nums1 = { 0 };
		int[] nums2 = { 1 };
		int m = 0;
		int n = 1;

		classUnderTest.merge(nums1, m, nums2, n);

		assertArrayEquals(expected, nums1, "array is sorted");
	}
}
