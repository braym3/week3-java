package com.qa.oop;

public class Exercise {

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

			// Change Mick's job to Plumber and increment age by 1
			System.out.println("Before: ");
			System.out.println(p3.printDetails());
		} catch (NullPointerException e) {
			System.out.println("No such person");
			System.out.println();
		}

		p3.setJob("Plumber");
		p3.setAge(p3.getAge() + 1);

		System.out.println("After: ");
		System.out.println(p3.printDetails());
	}

}
