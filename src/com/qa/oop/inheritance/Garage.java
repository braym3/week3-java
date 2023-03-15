package com.qa.oop.inheritance;

import java.util.ArrayList;

public class Garage {

	private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

	public ArrayList<Vehicle> getVehicles() {
		return vehicles;
	}

	public void addVehicle(Vehicle vehicle) {
		this.vehicles.add(vehicle);
	}

}
