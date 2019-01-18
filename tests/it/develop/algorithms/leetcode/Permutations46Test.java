package it.develop.algorithms.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;

class Permutations46Test {

	@Test
	void test_1() {
		int[] input = { 1 };
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		expected.add(Arrays.asList(new Integer(1)));

		Permutations46 classUnderTest = new Permutations46();

		assertEquals(expected, classUnderTest.permute(input));
	}

	@Test
	void test_2() {
		int[] input = { 1, 2 };
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		expected.add(Arrays.asList(new Integer(1), new Integer(2)));
		expected.add(Arrays.asList(new Integer(2), new Integer(1)));

		Permutations46 classUnderTest = new Permutations46();

		assertEquals(expected, classUnderTest.permute(input));
	}

	@Test
	void test_3() {
		int[] input = { 1, 2, 3 };
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		expected.add(Arrays.asList(new Integer(1), new Integer(2), new Integer(3)));
		expected.add(Arrays.asList(new Integer(1), new Integer(3), new Integer(2)));

		expected.add(Arrays.asList(new Integer(2), new Integer(1), new Integer(3)));
		expected.add(Arrays.asList(new Integer(3), new Integer(1), new Integer(2)));
		expected.add(Arrays.asList(new Integer(2), new Integer(3), new Integer(1)));
		expected.add(Arrays.asList(new Integer(3), new Integer(2), new Integer(1)));

		Permutations46 classUnderTest = new Permutations46();
		List<List<Integer>> result = classUnderTest.permute(input);

		Collections.sort(expected, getComparator());
		Collections.sort(result, getComparator());

		assertEquals(expected, result);
	}

	private Comparator getComparator() {
		return new Comparator<List<Integer>>() {

			@Override
			public int compare(List<Integer> o1, List<Integer> o2) {
				if (o1.size() != o2.size()) {
					throw new RuntimeException("Lista di lunghezza diversa");
				}

				if (o1.get(0) > o2.get(0)) {
					return 1;
				} else if (o1.get(0) < o2.get(0)) {
					return -1;
				} else if (o1.size() == 1) {
					return 0;
				} else {
					return compare(o1.subList(1, o1.size()), o2.subList(1, o2.size()));
				}
			}

		};
	}

}
