package com.qa.oop;

public class Exercise {

	public static void main(String[] args) {

		Person p1 = new Person("Bob", 24, "Teacher");
		System.out.println(p1.printDetails());

		System.out.println();

		Person p2 = new Person("Jane", 36, "Writer");
		System.out.println(p2.printDetails());
	}

}
