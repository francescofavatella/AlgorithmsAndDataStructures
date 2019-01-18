package it.develop.algorithms.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations46 {
	/*
	 * Given a collection of distinct integers, return all possible permutations.
	 * 
	 * Example:
	 * 
	 * Input: [1,2,3] Output: [ [1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], [3,2,1]
	 * ]
	 */

	public List<Integer> clone(List<Integer> list) {
		List<Integer> result = new ArrayList<>();
		for (Integer elem : list) {
			result.add(elem);
		}
		return result;
	}

	public List<List<Integer>> permute(int[] nums) {

		List<List<Integer>> result = new ArrayList<List<Integer>>();

		if (nums.length == 0) {
			throw new RuntimeException("Wrong Input");
		}
		
		if (nums.length == 1) {
			List<Integer> tmpResult = new ArrayList<Integer>();
			tmpResult.add(nums[0]);
			result.add(tmpResult);
			return result;
		}

		// 1. fix the first element of the vector
		int elem = nums[0]; // 1

		// 2. call the permute method passing the rest of the vector
		final List<List<Integer>> prevResult = permute(Arrays.copyOfRange(nums, 1, nums.length));
		for (int i = 0; i < nums.length; i++) {
			// 3. move the fixed element on each position for each of the permutation
			// obtained
			for (final List<Integer> prevPermutation : prevResult) {
				List<Integer> permutedList = clone(prevPermutation);
				permutedList.add(i, elem);
				// 4. add each permutation to the result list
				result.add(permutedList);
			}
		}
		return result;
	}
}

/* Solution 2
Given a list of n numbers
I know that the set of the permutations
is a set that is the union
of n sets, one for each i in n,
set for i being
the set of permutations
each permutation being
the concatenation of
i (fixed in first position)
and each of the permutations of the remaining n-1 numbers.



1,2,3,4

	1,X,X,X
		1,2,X,X
			1,2,3,4
			1,2,4,3
		1,3,X,X
		1,4,X,X
	2,X,X,X
		2,1,X,X
		2,3,X,X
	3,X,X,X
	4,X,X,X
	
*/
