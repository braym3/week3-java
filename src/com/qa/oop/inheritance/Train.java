package com.qa.oop.inheritance;

public class Train extends Vehicle {
	private int numberOfCarriages, horsepower;

	public Train() {
		super();
	}

	public Train(int wheels, int seats, String model, String colour, double length, double width, double height,
			int numberOfCarriages, int horsepower) {
		super(wheels, seats, model, colour, length, width, height);
		this.setNumberOfCarriages(numberOfCarriages);
		this.setHorsepower(horsepower);
	}

	@Override
	public double calculateBill() {
		double bill = (this.getWheels() * 1.5) + (this.getLength() + this.getWidth() + this.getHeight())
				+ (this.getNumberOfCarriages() * 5.3) + (this.getHorsepower() * 6);
		return bill;
	}

	public int getNumberOfCarriages() {
		return numberOfCarriages;
	}

	public void setNumberOfCarriages(int numberOfCarriages) {
		this.numberOfCarriages = numberOfCarriages;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}

}
