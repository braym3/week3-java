package com.qa.flowchart;

public class IterationFlowchart2 {

	public static void main(String[] args) {
		for (int a = 100; a <= 200; a++) {
			if (a % 2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
		}
	}

}
