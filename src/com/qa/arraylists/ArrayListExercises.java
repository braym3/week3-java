package com.qa.arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercises {

	public static void main(String[] args) {
		ArrayList<String> food = new ArrayList<>();

		food.add("Cheese");
		food.add("Cucumber");
		food.add("Bread");
		food.add("Cake");
		food.add("Beef");
		food.add("Chocolate");
		food.add("Celery");

		System.out.println(food);

		// normal loop
		System.out.println("\nNormal loop: ");
		for (int i = 0; i < food.size(); i++) {
			System.out.println(food.get(i));
		}

		// enhanced loop
		System.out.println("\nFor each loop: ");
		for (String item : food) {
			System.out.println(item);
		}

		// find specific elements
		System.out.println("\nIndex 3: " + food.get(3));
		System.out.println("\nCelery index: " + food.indexOf("Celery"));

		// set different elements
		System.out.println("\nIndex 2: " + food.get(2));
		food.set(2, "Strawberry");
		System.out.println("Index 2: " + food.get(2));

		// remove elements
		System.out.println("\nBefore removal: " + food);
		food.remove(2);
		System.out.println("After removal: " + food);

		// sort arrayList
		List<Integer> numbers = new ArrayList<>();
		System.out.println("\nUnsorted: " + food);
		Collections.sort(food);
		System.out.println("Sorted: " + food);

		numbers.add(372);
		numbers.add(2834);
		numbers.add(23);
		numbers.add(5657887);
		numbers.add(67842);
		System.out.println("\nUnsorted: " + numbers);
		Collections.sort(numbers);
		System.out.println("Sorted: " + numbers);
		Collections.reverse(numbers);
		System.out.println("Reverse: " + numbers);

		// swap method
		ArrayList<String> names = new ArrayList<>();

		names.add("Brian");
		names.add("Donald");
		names.add("Jackie");
		names.add("Mick");

		System.out.println("\nNames: " + names);
		Collections.swap(names, 0, 1);
		System.out.println("Swapped: " + names);

		// clear method
		names.clear();
		System.out.println("Cleared: " + names);
	}

}
