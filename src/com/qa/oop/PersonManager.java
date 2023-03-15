package com.qa.oop;

import java.util.ArrayList;

public class PersonManager {

	private ArrayList<Person> people = new ArrayList<>();

	// Print out the details for all people in the list
	public void printAllDetails() {
		for (Person p : people) {
			System.out.println(p.printDetails());
			System.out.println();
		}
	}

	public Person findPerson(String name) {
		for (Person p : people) {
			if (p.getName().equals(name)) {
				return p;
			}
		}
		return null;
	}

	public void addPerson(Person p) {
		people.add(p);
	}
}
