package com.sourav.HackerRank;

import java.util.Arrays;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		int s = 7;
		int t = 11;
		int a = 5; // apple tree
		int b = 15;// orange tree
		List<Integer> apples = Arrays.asList(-2, 2, 1);
		List<Integer> ornages = Arrays.asList(5, -6);
		int count = countApplesAndOranges(s, t, a, b, apples, ornages);
		System.out.println(count);

	}

	private static int countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> ornages) {

		int count = 0;
		for (Integer i : apples) {
			if (a + i >= s && a + i <= t) {
				count += 1;
			}
		}

		for (Integer i : ornages) {
			if (b + i >= s && b + i <= t) {
				count += 1;
			}
		}
		return count;
	}

}
