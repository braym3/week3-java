package com.qa.flowchart;

public class Numbers {

	public static void printNumbers() {
		for (int i = 1; i <= 10; i++) {
			for (int n = 1; n <= 10; n++) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		printNumbers();
	}

}
