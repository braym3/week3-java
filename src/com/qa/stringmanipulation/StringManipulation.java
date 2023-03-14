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
//		int lastSpaceIndex = 0;
//		for (int i = 0; i < s.length(); i++) {
//			// if a space is found or if it is the last character of the last word
//			if (s.charAt(i) == ' ' || (i == s.length() - 1)) {
//				System.out.println(s.substring(lastSpaceIndex, i));
//				lastSpaceIndex = i + 1;
//			}
//		}

		// simpler version - print all chars and make new line when there's a space
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				System.out.print("\n");
			} else {
				System.out.print(s.charAt(i));
			}

		}
	}

	public static void printReverseVertical(String s) {
		int lastSpaceIndex = s.length();
		for (int i = s.length() - 1; i >= 0; i--) {
			// if a space is found or if it is the last character of the first word
			if (s.charAt(i) == ' ') {
				System.out.println(s.substring(i + 1, lastSpaceIndex));
				lastSpaceIndex = i;
			} else if (i == 0) {
				System.out.println(s.substring(i, lastSpaceIndex));
			}
		}
	}

	public static boolean findSubstring(String message, String sub) {
		boolean found = false;

		/**
		 * // recursive? - look for first matching char - then next, repeat for(int i =
		 * 0; i <= message.length() - 1; i++) { // if fisrt char of sub matches message
		 * if(message.charAt(i) == sub.charAt(0)) { findSubstring((message.substring(i,
		 * message.length()-1)), sub.substring(i)) } }
		 **/
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
		System.out.println();

		printReverseVertical("This is an example java exercise");
	}

}