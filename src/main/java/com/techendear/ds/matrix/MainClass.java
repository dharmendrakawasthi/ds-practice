package com.techendear.ds.matrix;

public class MainClass {

	public static void main(String[] args) {

		int[][] mat = new int[4][4];
		int val = 1;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				mat[i][j] = val;
				val++;
			}
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(mat[i][j] + "  ");
			}
			System.out.println("");
		}

		System.out.println("");

		printSpiral(4, 4, mat);
	}

	public static void printSpiral(int m, int n, int[][] a) {

		int i, k = 0, l = 0;

		while (k < m && l < n) {

			for (i = l; i < n; i++) {
				System.out.print(a[k][i]+" ");
			}

			k++;

			System.out.println("");
			
			for (i = k; i < m; i++) {
				System.out.print(a[i][n - 1]+" ");
			}

			n--;
			
			if(k<m) {
				
			}
		}
	}
}
