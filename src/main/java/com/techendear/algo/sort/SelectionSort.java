package com.techendear.algo.sort;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 20, -1, 3, 1, -10, -22, 0 };

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		selectionSort(arr);
		System.out.println();
		System.out.println("******After Sort *******");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	public static int[] selectionSort(int[] arr) {

		for (int i = arr.length - 1; i > 0; i--) {
			int index = 0;
			for (int j = 0; j < i; j++) {
				if (arr[index] < arr[j]) {
					index = j;
				}
			}

			swap(arr, index, i);
		}

		return arr;
	}

	public static void swap(int[] arr, int i, int j) {

		if (i == j)
			return;

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
