package com.qa.arrays;

import java.util.ArrayList;

public class Numbers {

	public static int addDigits(int num) {
		int sum = 0;
		int digit = 0;
		// Add each digit to the sum
		while (num > 0) {
			// Get the last digit
			digit = num % 10;
			// Add current digit to the sum
			sum += digit;
			// Divide the number by 10 (to get the next digit in the next loop)
			num = num / 10;
		}
		return sum;
	}

	public static String convertToWord(int num) {
		ArrayList<Integer> digits = new ArrayList<Integer>();
		int n;

		if (num == 0) {
			digits.add(0);
		}
		// Add each digit to the digits arrayList
		while (num > 0) {
			// Get the last digit
			n = num % 10;
			// Add current digit to the digits arrayList
			digits.add(n);
			// Divide the number by 10 (to get the next digit in the next loop)
			num = num / 10;
		}

		String[] singleDigits = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		String[] tens = { "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
		String[] teens = { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
				"eighteen", "nineteen" };
		String word = "";

		// Loop through digits array - backwards (the first digit is at the end of the
		// array)
		// Match corresponding word to the digit - add to word
		for (int i = digits.size() - 1; i >= 0; i--) {
			// if second-to-last digit - add teen or tens number as word
			if (i == 1 && digits.get(i) != 0) {
				// if penultimate digit is a 1 - add corresponding teen number and break
				if (digits.get(i) == 1) {
					word = word + teens[digits.get(i - 1)];
					break;
				}
				word = word + tens[digits.get(i) - 2];
			} else {
				// skip zeros (unless that is the only number)
				if (!(digits.get(i) == 0 && digits.size() > 1)) {
					word = word + singleDigits[digits.get(i)];
				}
				// if it's 3rd to last digit - add hundred after word
				if (i == 2) {
					word = word + "-hundred";
					// if it's 4th to last digit - add thousand after word
				} else if (i == 3) {
					word = word + "-thousand";
				}
			}
			// add a dash between words
			if (i != 0 && digits.get(i - 1) != 0) {
				word = word + "-";
			}
		}
		return word;
	}

	public static void main(String[] args) {
		System.out.println(addDigits(192));
		System.out.println(addDigits(74));
		System.out.println(addDigits(3462));
		System.out.println(addDigits(11));

		System.out.println();

		for (int i = 0; i <= 999; i++) {
			System.out.println(convertToWord(i));
		}

	}

}
