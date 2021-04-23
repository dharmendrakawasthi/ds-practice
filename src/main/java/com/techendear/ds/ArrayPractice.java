package com.techendear.ds;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class ArrayPractice {

	private static Scanner sc;

	public static void main(String[] args) {

		Instant start = Instant.now();
		sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] a = null;
		for(int i=0; i<t;i++) {
			int size = sc.nextInt();
			int d = sc.nextInt();
			a = new int[size];

			for(int j=0; j<size; j++) {
				a[j] = sc.nextInt();
			}
			
			rightRotate(a, d);
			for (int el : a) {
				System.out.print(el+" ");
			}
			System.out.println("");

		}	
		
		Instant finish = Instant.now();
		 
	    long timeElapsed = Duration.between(start, finish).toMillis();  //in millis
	    System.out.println("Time::"+timeElapsed);
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
