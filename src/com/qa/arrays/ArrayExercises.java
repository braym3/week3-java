package com.qa.arrays;

public class ArrayExercises {

	public static void main(String[] args) {
		int[] nums = new int[10];

		System.out.println("Populate array: ");
		for (int i = 0; i <= nums.length - 1; i++) {
			nums[i] = i;
			System.out.println(nums[i]);
		}
		System.out.println("Changing array: ");
		for (int i = 0; i <= nums.length - 1; i++) {
			nums[i] = i * i;
			System.out.println(nums[i]);
		}
	}

}
