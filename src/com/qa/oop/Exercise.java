package com.qa.oop;

import java.util.ArrayList;

public class Exercise {

	public static String findPerson(String name, ArrayList<Person> people) {

		for (Person p : people) {
			if (p.getName().equals(name)) {
				return p.printDetails();
			}
		}

		return "Name not found";
	}

	public static void main(String[] args) {
		// Create person 1 & print details
		Person p1 = new Person("Bob", 24, "Teacher");
		System.out.println(p1.printDetails());

		System.out.println();

		// Create person 2 & print details
		Person p2 = new Person("Jane", 36, "Writer");
		System.out.println(p2.printDetails());

		System.out.println();

		// Create person 3 & print details
		Person p3 = new Person("Mike", 41, "Mechanic");
		System.out.println(p3.printDetails());

		System.out.println();

		// Add person 1, 2 & 3 to ArrayList
		ArrayList<Person> people = new ArrayList<>();
		people.add(p1);
		people.add(p2);
		people.add(p3);

		// Find 'Jane'
		System.out.println(findPerson("Jane", people));
		System.out.println();
		// Try to find 'Boris'
		System.out.println(findPerson("Boris", people));
		System.out.println();

		// Change Mick's job to Plumber and increment age by 1
		System.out.println("Before: ");
		System.out.println(p3.printDetails());
		System.out.println();

		p3.setJob("Plumber");
		p3.setAge(p3.getAge() + 1);

		System.out.println("After: ");
		System.out.println(p3.printDetails());
	}

}
