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
		Train t1 = new Train(12, 100, "Orient Express", "Blue", 3000, 100, 200, 10, 5000);
		g1.addVehicle(t1);

		// Add a motorbike to the garage
		Motorbike m1 = new Motorbike(2, 1, "Harley Davidson", "Yellow", 75, 45, 60, "Cruiser", 500);
		g1.addVehicle(m1);

		// Add a second bicycle to the garage
		Bicycle b2 = new Bicycle(2, 1, "Dirt Jumper", "Orange", 45, 20, 30, "BMX");
		g1.addVehicle(b2);

		// Add a second train to the garage
		Train t2 = new Train(14, 150, "Flying Scotsman", "Green", 3000, 100, 200, 10, 5000);
		g1.addVehicle(t2);

		// Print model of all vehicles in garage
		System.out.println(g1.listVehicleModels());

		// Remove the second train
		g1.removeVehicle(t2);
		// Print all models again
		System.out.println("Removed 2nd train: ");
		System.out.println(g1.listVehicleModels());

		// remove all bicycles
		g1.removeVehicleType(Bicycle.class);
		// Print all models again
		System.out.println("Removed bicycles: ");
		System.out.println(g1.listVehicleModels());

		// re-add 2nd train & bicycles
		g1.addVehicle(t2);
		g1.addVehicle(b1);
		g1.addVehicle(b2);

		// Print bill for all vehicles
		System.out.println(g1.calculateAllBills());

		// List all vehicle ID's
		System.out.println(g1.listVehicleIDs());
		// Remove vehicle by its ID
		g1.removeVehicle(4);
		// List all vehicles again
		System.out.println("After removing ID 4: ");
		System.out.println(g1.listVehicleModels());

		// Empty the garage
		g1.clearGarage();
		// List all vehicles
		System.out.println("Cleared garage: ");
		System.out.println(g1.listVehicleModels());
	}

}
