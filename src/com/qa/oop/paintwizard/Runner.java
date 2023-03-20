package com.qa.oop.paintwizard;

public class Runner {

	public static void main(String[] args) {
		PaintWizard paintWiz = new PaintWizard();
		// Cheapest
		Paint cheapest = paintWiz.findCheapest(1000);
		Paint cheapest2 = paintWiz.findCheapest(150);

		// Least waste
		Paint leastWasteful = paintWiz.findLeastWasteful(1020);
		Paint leastWasteful2 = paintWiz.findLeastWasteful(340);

	}

}
