package com.qa.oop.inheritance;

public class Car extends Vehicle {

	private boolean automatic;
	private String reg;

	public Car() {
		super();
	}

	public Car(int wheels, int seats, String model, String colour, double length, double width, double height,
			String reg, boolean automatic) {
		super(wheels, seats, model, colour, length, width, height);
		this.setAutomatic(automatic);
		this.setReg(reg);
	}

	public boolean isAutomatic() {
		return automatic;
	}

	public void setAutomatic(boolean automatic) {
		this.automatic = automatic;
	}

	public String getReg() {
		return reg;
	}

	public void setReg(String reg) {
		this.reg = reg;
	}

}
