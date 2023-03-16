package com.qa.oop.paintwizard;

import java.util.ArrayList;

public class PaintWizard {

	ArrayList<Paint> paints = new ArrayList<Paint>();

	public PaintWizard() {
		Paint cheapoMax = new Paint("Cheapo Max", 19.99, 21, 10);
		this.paints.add(cheapoMax);
		Paint thatOneWithTheDog = new Paint("That One With The Dog", 34.38, 40, 12);
		this.paints.add(thatOneWithTheDog);
		Paint averageJoes = new Paint("Average Joes", 17.99, 16, 11);
		this.paints.add(averageJoes);
		Paint duluxourousPaints = new Paint("Deluxourous Paints", 25.0, 10, 22);
		this.paints.add(duluxourousPaints);
	}

	public Paint findLeastWasteful() {
		return paints.get(0);
	}
}
