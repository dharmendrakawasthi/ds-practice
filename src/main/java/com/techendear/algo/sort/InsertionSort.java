package com.techendear.algo.sort;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 20, -1, 3, 1, -10, -22, 0 };
		insertionSort(arr);
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i]+" ");

	}

	public static int[] insertionSort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			int insEle = arr[i];

			int j;
			for (j = i; j > 0 && arr[j - 1] > insEle; j--) {
				arr[j] = arr[j-1];
			}
			
			arr[j] = insEle;
		}

		return arr;
	}

}
