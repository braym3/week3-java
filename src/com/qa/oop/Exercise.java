package com.qa.oop;

public class Exercise {

	public static void main(String[] args) {
		// Create person 1
		Person p1 = new Person("Bob", 24, "Teacher");

		// Create person 2
		Person p2 = new Person("Jane", 36, "Writer");

		// Create person 3
		Person p3 = new Person("Mike", 41, "Mechanic");

		// Add person 1, 2 & 3 to PersonManager ArrayList
		PersonManager pManager = new PersonManager();
		pManager.addPerson(p1);
		pManager.addPerson(p2);
		pManager.addPerson(p3);

		try {
			// Find 'Jane'
			System.out.println(pManager.findPerson("Jane").getName());
			System.out.println();
			// Try to find 'Boris'
			System.out.println(pManager.findPerson("Boris").getName());
			System.out.println();

		} catch (NullPointerException e) {
			System.out.println("No such person\n");
		}

		// Change Mick's job to Plumber and increment age by 1
		System.out.println("Before: ");
		System.out.println(p3.printDetails());

		p3.setJob("Plumber");
		p3.setAge(p3.getAge() + 1);

		System.out.println("\nAfter: ");
		System.out.println(p3.printDetails());

		// Print details of all people in the list
		System.out.println();
		pManager.printAllDetails();
	}

}
