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
			s += "Model: " + v.getModel() + "\n";
		}
		return s;
	}

	public void removeVehicle(Vehicle vehicle) {
		this.vehicles.remove(vehicle);
	}

	/**
	 * public void removeVehicleType(Class<?> c) { for (Vehicle v : vehicles) { if(v
	 * instanceof c) { removeVehicle(v); } } }
	 **/

	public void addVehicle(Vehicle vehicle) {
		this.vehicles.add(vehicle);
	}

}
