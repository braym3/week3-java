package com.qa.coins;

public class Coins {

	public static void calculateChange(int cost, int amount) {
		// Check if they've given a smaller amount than the cost
		if (amount < cost) {
			System.out.print("You haven't given enough money.");
			return;
		}

		double difference = amount - cost;
		System.out.println("Pay change in: ");

		while (difference != 0) {
			if (difference >= 1000) {
				difference -= 1000;
				System.out.println("£10 note");
			} else if (difference >= 500) {
				difference -= 500;
				System.out.println("£5 note");
			} else if (difference >= 200) {
				difference -= 200;
				System.out.println("£2 coin");
			} else if (difference >= 100) {
				difference -= 100;
				System.out.println("£1 coin");
			} else if (difference >= 50) {
				difference -= 50;
				System.out.println("50p coin");
			} else if (difference >= 20) {
				difference -= 20;
				System.out.println("20p coin");
			} else if (difference >= 10) {
				difference -= 10;
				System.out.println("10p coin");
			} else if (difference >= 5) {
				difference -= 5;
				System.out.println("5p coin");
			} else if (difference >= 2) {
				difference -= 2;
				System.out.println("2p coin");
			} else if (difference >= 1) {
				difference -= 1;
				System.out.println("1p coin");
			} else {
				return;
			}
		}
	}

	public static void main(String[] args) {
		// in pence
		calculateChange(458, 2000);

	}

}
