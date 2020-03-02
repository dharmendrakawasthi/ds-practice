package com.techendear.other;

public class RecursionPractice {

	public static void main(String[] args) {
		
		System.out.println(recTest(5));
	}
	
	public static int recTest(int n) {
		int temp=0;
		if(n>0) {
			temp =  n*recTest(n-1);
		}
		return temp;
	}

}
