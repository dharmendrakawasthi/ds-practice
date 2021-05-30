package com.techendear.recursion;

public class DirectRecuer {

	public static void main(String[] args) {
		
		var dr = new DirectRecuer();
		
		dr.print(10);
	}

	public void print(int n) {		
		if(n < 0) {
			return;
		}
		
		System.out.println("Before: "+ n);
		print(n-1);
		System.out.println("After: "+ n);
	}
}
