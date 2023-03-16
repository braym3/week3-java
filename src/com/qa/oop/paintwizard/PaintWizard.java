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

	public Paint findLeastWasteful(int roomSize) {
		return paints.get(0);
	}

	public Paint findCheapest(int roomSize) {
		double cheapestCost = -1;
		double pCost = 0;
		int tinNum = 0;
		Paint cheapestPaint = null;

		for (Paint p : paints) {
			// calculate cost of using current paint for room size
			// Need at least 1 tin of paint
			tinNum = roomSize / p.getCoverage();
			if (tinNum == 0) {
				tinNum = 1;
			}
			pCost = tinNum * p.getPrice();
			// System.out.println(p.getCoverage());
			if (cheapestCost == -1 || pCost < cheapestCost) {
				cheapestCost = pCost;
				cheapestPaint = p;
			}
		}
		System.out.println("The cheapest paint to use for a room of size " + roomSize + "m** is "
				+ cheapestPaint.getName() + " for £" + cheapestCost + "\n");
		return cheapestPaint;
	}
}
