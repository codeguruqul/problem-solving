package com.array.problem.solution;

import java.util.HashMap;
import java.util.Map;

public class TwoSumArray {

	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		/*
		 * Approach step by step: 1. traverse the array. and Subtract the element, which
		 * we are considering
		 * 
		 */

		for (int i = 0; i < nums.length; i++) {
			int comp = target - nums[i];
			if (map.containsKey(comp)) {
				result[0] = map.get(comp);
				result[1] = i;
			} else {
				map.put(nums[i], i);
			}
		}
		return result;
	}

	public static void main(String[] args) {

		TwoSumArray test = new TwoSumArray();
		int[] nums = { 1, 5, 2, 7 };
		test.twoSum(nums, 9);
	}
}
