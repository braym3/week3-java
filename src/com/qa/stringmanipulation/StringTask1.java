package com.qa.stringmanipulation;

public class StringTask1 {

	public static void main(String[] args) {
		String s1 = "yesterday it was raining";
		String s2 = "today it is sunny";

		// concatenate both values, capitalise and print result
		String s3 = (s2 + ", " + s1).toUpperCase();
		System.out.println(s3);

		// use substring method to print out : TODAY IT IS RAINING
		String s4 = s2.substring(0, 11) + s1.substring(16, 24);
		System.out.println(s4);
	}

}
