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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
