package com.qa.oop.inheritance;

public class Runner {

	public static void main(String[] args) {

		Garage g1 = new Garage();

		// Add a car to the garage
		Car c1 = new Car(4, 5, "Volkswagen Golf", "White", 200, 130, 60, "SH739", false);
		g1.addVehicle(c1);

		// Add a bicycle to the garage
		Bicycle b1 = new Bicycle(2, 1, "Cervelo", "Red", 50, 20, 30, "Mountain Bike");
		g1.addVehicle(b1);

		// Add a train to the garage
		Train t1 = new Train(12, 100, "Orient Express", "Green", 3000, 100, 200, 10, 5000);
		g1.addVehicle(t1);

		// Add a motorbike to the garage
		Motorbike m1 = new Motorbike(2, 1, "Harley Davidson", "Yellow", 75, 45, 60, "Cruiser");
		g1.addVehicle(m1);

		// Print model of all vehicles in garage
		System.out.println(g1.listVehicleModels());

		// Remove the train
		g1.removeVehicles(t1);
		// Print all models again
		System.out.println(g1.listVehicleModels());
	}

}
