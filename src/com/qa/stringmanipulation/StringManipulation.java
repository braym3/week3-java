package com.qa.stringmanipulation;

public class StringManipulation {

	public static int wordCount(String s) {
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			// if a space is found or if it is the last character of the last word - add 1
			// to word count
			if (s.charAt(i) == ' ' || (i == s.length() - 1)) {
				count++;
			}
		}
		return count;
	}

	public static void printVertical(String s) {
		int lastSpaceIndex = 0;
		for (int i = 0; i < s.length(); i++) {
			// if a space is found or if it is the last character of the last word
			if (s.charAt(i) == ' ' || (i == s.length() - 1)) {
				System.out.println(s.substring(lastSpaceIndex, i + 1));
				lastSpaceIndex = i + 1;
			}
		}
	}

	public static void printReverseVertical(String s) {
		int lastSpaceIndex = s.length() - 1;
		for (int i = s.length() - 1; i >= 0; i--) {
			// if a space is found or if it is the last character of the last word
			if (s.charAt(i) == ' ') {
				System.out.println(s.substring(i + 1, lastSpaceIndex));
				lastSpaceIndex = i;
			} else if (i == 0) {
				System.out.println(s.substring(i, lastSpaceIndex));
				lastSpaceIndex = i;
			}
		}
	}

	public static boolean findSubstring(String message, String sub) {
		boolean found = true;
		return found;
	}

	public static void main(String[] args) {
		System.out.println(wordCount("Hello world how are you?"));
		System.out.println(wordCount("This is an example java exercise"));
		System.out.println(wordCount("Hello"));
		System.out.println(wordCount("Hello world "));

		System.out.println();

		printVertical("This is an example java exercise");

		System.out.println();

		printReverseVertical("This is an example java exercise");
	}

}