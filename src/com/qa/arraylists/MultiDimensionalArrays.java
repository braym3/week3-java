package com.qa.arraylists;

public class MultiDimensionalArrays {

	public static void main(String[] args) {
		int[][] array2d = new int[10][15];
		int[][][] array3d = new int[3][4][5];

		// length 1
		System.out.println(array2d.length);
		// length 2
		System.out.println(array2d[0].length);

		// populate 2d array
		for (int i = 0; i < array2d.length; i++) {
			for (int j = 0; j < array2d[0].length; j++) {
				array2d[i][j] = j + 1;
			}

		}

		// print 2d array
		for (int i = 0; i < array2d.length; i++) {
			for (int j = 0; j < array2d[0].length; j++) {
				System.out.print(array2d[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();

		// populate 3d array
		for (int i = 0; i < array3d.length; i++) {
			for (int j = 0; j < array3d[0].length; j++) {
				for (int y = 0; y < array3d[1].length; y++)
					array3d[i][j][y] = y + 1;
			}

		}

		// print 3d array
		for (int[][] a2d : array3d) {
			for (int[] a1d : a2d) {
				for (int n : a1d) {
					System.out.print(n + " ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
