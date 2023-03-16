package com.qa.oop.inheritance;

import java.util.ArrayList;

public class Garage {

	private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

	public ArrayList<Vehicle> getVehicles() {
		return vehicles;
	}

	public void clearGarage() {
		vehicles.clear();
	}

	public double fixVehicle(Vehicle v) {
		return v.calculateBill();
	}

	public String calculateAllBills() {
		String billDetails = "";
		for (Vehicle v : vehicles) {
			billDetails += v.getModel() + " = £" + v.calculateBill() + "\n";
		}
		return billDetails;
	}

	public String listVehicleModels() {
		String s = "";
		for (Vehicle v : vehicles) {
			s += v.getClass().getSimpleName() + " - " + v.getModel() + "\n";
		}
		return s;
	}

	public String listVehicleIDs() {
		String s = "";
		for (int i = 0; i <= vehicles.size() - 1; i++) {
			s += "ID: " + i + " - " + vehicles.get(i).getModel() + "\n";
		}
		return s;
	}

	public void removeVehicle(Vehicle vehicle) {
		this.vehicles.remove(vehicle);
	}

	public void removeVehicle(int id) {
		this.vehicles.remove(id);
	}

	public void removeVehicleType(Class<?> clazz) {
		ArrayList<Vehicle> toRemove = new ArrayList<Vehicle>();
		for (Vehicle v : vehicles) {
			// for each object that matches the type - add to list to remove after loop
			if (v.getClass() == clazz) {
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
