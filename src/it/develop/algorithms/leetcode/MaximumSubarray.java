package it.develop.algorithms.leetcode;

public class MaximumSubarray {
	/*
	 * Given an integer array nums, find the contiguous subarray (containing at
	 * least one number) which has the largest sum and return its sum.
	 * 
	 * Example:
	 * 
	 * Input: [-2,1,-3,4,-1,2,1,-5,4], Output: 6 Explanation: [4,-1,2,1] has the
	 * largest sum = 6. Follow up:
	 * 
	 * If you have figured out the O(n) solution, try coding another solution using
	 * the divide and conquer approach, which is more subtle.
	 */

	public int maxSubArray(int[] nums) {
		int max = nums[0];
		int acc = max;
		for (int i = 1; i < nums.length; i++) {
			acc += nums[i];
			if (nums[i] > acc) {
				acc = nums[i];
			}
			if (acc > max)
				max = acc;
		}
		return max;
	}

	public int maxSubArray2(int[] nums) {

		int maximum = nums[0];
		for (int i = 1; i < nums.length; i++) {
			int tmpMax = nums[0];
			if (nums[i] > 0) {
				tmpMax = maximum + nums[i];
			}
			if (nums[i] > tmpMax) {
				tmpMax = nums[i];
			}
			if (tmpMax > maximum)
				maximum = tmpMax;
		}

		return maximum;
	}

}
