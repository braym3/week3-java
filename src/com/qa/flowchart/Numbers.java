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

	public static void printNTimes(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println(n);
		}
	}

	public static void main(String[] args) {
		printNumbers();
		printNTimes(10);
		printNTimes(3);
	}

}
