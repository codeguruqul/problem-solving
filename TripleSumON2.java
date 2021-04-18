package com.array.problem.solution;

import java.util.Arrays;

public class TripleSumTCN2 {

	public static boolean findTriplet(int arr[], int sum) {

		if (arr.length < 3) {
			return false;
		}
		Arrays.sort(arr); //{1,5,2,3,9,20}
		for (int i = 0; i < arr.length; i++) {
			int start = i+1;
			int end = arr.length-1;
			while (start < end) {
				if (arr[i] + arr[start] + arr[end] == sum) {
					return true;
				} else if (arr[i] + arr[start] + arr[end] < sum) {
					start++;
				} else {
					end--;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {

		int array[] = {1,5,2,3,9,8};
		boolean gotTriplet = findTriplet(array, 20);
		if(gotTriplet)
		System.out.println("Array contains triplet for sum 20");
		else {
			System.out.println("Array does not contains triplet for sum 20");
		}
	}

}
