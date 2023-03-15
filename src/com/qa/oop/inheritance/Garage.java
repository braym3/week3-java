package com.qa.oop.inheritance;

import java.util.ArrayList;

public class Garage {

	private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

	public ArrayList<Vehicle> getVehicles() {
		return vehicles;
	}

	public String listVehicleModels() {
		String s = "";
		for (Vehicle v : vehicles) {
			s += "Vehicle model: " + v.getModel() + "\n";
		}
		return s;
	}

	public void removeVehicles(Vehicle vehicle) {
		this.vehicles.remove(vehicle);
	}

	public void addVehicle(Vehicle vehicle) {
		this.vehicles.add(vehicle);
	}

}
