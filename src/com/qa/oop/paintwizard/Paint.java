package com.qa.oop.paintwizard;

public class Paint {
	private String name;
	private double price;
	private int litre, coverage;

	public Paint() {
	}

	public Paint(String name, double price, int litre, int coverage) {
		this.setName(name);
		this.setPrice(price);
		this.setLitre(litre);
		this.setCoverage(coverage * litre);
	}

	public double calculateCost(int roomArea) {
		double cost = 0;
		return cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getLitre() {
		return litre;
	}

	public void setLitre(int litre) {
		this.litre = litre;
	}

	public int getCoverage() {
		return coverage;
	}

	public void setCoverage(int coverage) {
		this.coverage = coverage;
	}

}
