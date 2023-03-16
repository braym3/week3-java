package com.qa.oop.paintwizard;

public class Runner {

	public static void main(String[] args) {
		PaintWizard paintWiz = new PaintWizard();
		Paint cheapest = paintWiz.findCheapest(1000);
		Paint cheapest2 = paintWiz.findCheapest(150);
	}

}
