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
			s += v.getClass().getSimpleName() + " -		" + v.getModel() + "\n";
		}
		return s;
	}

	public void removeVehicle(Vehicle vehicle) {
		this.vehicles.remove(vehicle);
	}

	public void removeVehicleType(Vehicle vehicleClass) {
		ArrayList<Vehicle> toRemove = new ArrayList<Vehicle>();
		for (Vehicle v : vehicles) {
			// for each object that matches the type - add to list to remove after loop
			if (v.getClass().equals(vehicleClass.getClass())) {
				toRemove.add(v);
			}
		}
		// remove the objects from the vehicles list
		for (Vehicle v : toRemove) {
			removeVehicle(v);
		}

	}

	public void addVehicle(Vehicle vehicle) {
		this.vehicles.add(vehicle);
	}

}
