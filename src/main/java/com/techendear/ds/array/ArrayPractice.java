package com.techendear.ds.array;

public class ArrayPractice {

	public static void main(String[] args) {
		int[] arr = { 2, 1, 5, 3, -4, 9, 1, -3, -9, -14 };

//		leftRotateArray(arr, 3);
//		for (int a : arr) {
//			System.out.println(a);
//		}

		rightRotate(arr, 3);
		for (int a : arr) {
			System.out.println(a);
		}
	}

	public static void leftRotateArray(int[] a, int n) {

		while (n > 0) {
			int temp = a[0];
			for (int j = 0; j < a.length - 1; j++) {
				a[j] = a[j + 1];
			}
			a[a.length - 1] = temp;
			n--;
		}
	}

	public static void rightRotate(int[] a, int n) {

		while (n > 0) {
			int temp = a[a.length - 1];
			for (int i = a.length - 2; i >= 0; i--) {
				a[i + 1] = a[i];
			}
			a[0] = temp;
			n--;
		}
	}
}
