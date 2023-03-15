package com.qa.oop;

public class Person {

	private String name, job;
	private int age;

	public Person(String name, int age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;
	}

	public String printDetails() {
		String s = "Name: " + this.name;
		s += "\nAge: " + this.age;
		s += "\nJob title: " + this.job;

		return s;
	}

}
