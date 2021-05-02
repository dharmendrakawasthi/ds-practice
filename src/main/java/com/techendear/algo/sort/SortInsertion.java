package com.techendear.algo.sort;

public class SortInsertion {
	public static void main(String[] args) {

		int[] arr = { 6, 3, 1, 0, -4, 10, 45, 8, -6, -15 };
		for (int i = 1; i < arr.length; i++) {
			int ele = arr[i];
			for (int j = i; j >= 0; j--) {

				if (arr[j] <= ele) {
					continue;
				}
				if (arr[j] > ele) {
					arr[j + 1] = arr[j];
				}
				arr[j]=ele;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
}
