package com.techendear.other;

public class RecursionPractice {

	public static void main(String[] args) {
		System.out.println(recTest(5));
	}
	
	public static int recTest(int n) {
		
		if(n==0) {
			return 1;
		}
		return n*recTest(n-1);
	}
}
