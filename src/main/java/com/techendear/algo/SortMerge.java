package com.techendear.algo;

public class SortMerge {

	public static void main(String[] args) {
		int[] arr = { 6, 3, 1, 0, -4, 10, 45, 8, -6, -15 };
		
		for(int a : arr) {
			System.out.println(a);
		}
		
		int start = 0;
		int end = arr.length;
		mergeSort(arr,start,end);
		
	}
	
	public static void mergeSort(int[] arr, int start, int end) {
		
		int mid = (start+end)/2;
		
		if(end-start <2) {
			return;
		}
		
		mergeSort(arr, start, mid);
		mergeSort(arr, mid, end);
		merge(arr, start, mid, end);
		
	}
	
	public static void merge(int[] arr, int start, int mid, int end) {
		
		if(arr[mid-1] <= arr[mid]) {
			return;
		}
		
		int i = start;
		int j =- mid;
		int tempIndex = 0;
		int[] temp = new int[end-start];
	    
		while(i<mid && j<end) {
			temp[tempIndex++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
		}
	}

}
