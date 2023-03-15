package com.qa.oop.inheritance;

public class Bicycle extends Vehicle {
	private String type;

	public Bicycle() {
		super();
	}

	public Bicycle(int wheels, int seats, String model, String colour, double length, double width, double height,
			String type) {
		super(wheels, seats, model, colour, length, width, height);
		this.setType(type);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
