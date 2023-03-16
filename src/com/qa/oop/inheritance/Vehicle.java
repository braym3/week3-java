package com.qa.oop.inheritance;

public abstract class Vehicle {

	private int wheels, seats, id;
	private String model, colour;
	private double length, width, height;

	public Vehicle() {
	}

	public Vehicle(int wheels, int seats, String model, String colour, double length, double width, double height) {
		this.setWheels(wheels);
		this.setSeats(seats);
		this.setModel(model);
		this.setColour(colour);
		this.setLength(length);
		this.setWidth(width);
		this.setHeight(height);
	}

	public abstract double calculateBill();

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
