package com.techendear.other.recursion;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		 printFact(10);
		
		System.out.println(Math.pow(100, 1.0/3));
	}
	
	public static int printFact(int n) {
		
		if(n == 0) {
			System.out.println("Factorial of: "+ n +":"+ 1);
			return 1;
		}
		
		int fact = (n*printFact(n-1));
		System.out.println("Factorial of: "+ n +":"+ fact);
		return fact;
	}

}
