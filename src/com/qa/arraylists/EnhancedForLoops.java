package com.qa.arraylists;

import java.util.ArrayList;

public class EnhancedForLoops {

	public static boolean isEven(int n) {
		if (n % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// Loop through array of strings
		ArrayList<String> names = new ArrayList<>();
		names.add("Mike");
		names.add("Debbie");
		names.add("Jane");
		names.add("Boris");
		names.add("Pam");

		for (String name : names) {
			System.out.println(name);
		}

		// Square array of integers
		int[] numbers = new int[20];

		// Populate array
		for (int i = 0; i < 20; i++) {
			// starting at 1, fill the array with numbers 1-20
			numbers[i] = i + 1;
		}

		for (int n : numbers) {
			System.out.println(n + " squared = " + n * n);
		}

		System.out.println();

		// Cube number if its even, square it if it's odd
		for (int n : numbers) {
			if (isEven(n)) {
				System.out.println(n + " cubed = " + n * n * n);
			} else {
				System.out.println(n + " squared = " + n * n);
			}

		}
	}

}
