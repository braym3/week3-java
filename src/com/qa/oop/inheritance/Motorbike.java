package com.qa.oop.inheritance;

public class Motorbike extends Vehicle {
	private String type;
	private int engine;

	public Motorbike() {
		super();
	}

	public Motorbike(int wheels, int seats, String model, String colour, double length, double width, double height,
			String type, int engine) {
		super(wheels, seats, model, colour, length, width, height);
		this.setType(type);
		this.setEngine(engine);
	}

	@Override
	public double calculateBill() {
		double bill = (this.getWheels() * 1.5) + (this.getLength() + this.getWidth() + this.getHeight())
				+ (this.getEngine() / 3);
		return bill;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getEngine() {
		return engine;
	}

	public void setEngine(int engine) {
		this.engine = engine;
	}

}
