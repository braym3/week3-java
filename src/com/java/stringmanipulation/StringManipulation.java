package com.java.stringmanipulation;

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

	public static void main(String[] args) {
		System.out.println(wordCount("Hello world how are you?"));
		System.out.println(wordCount("This is an example java exercise"));
		System.out.println(wordCount("Hello"));
		System.out.println(wordCount("Hello world "));
	}

}
