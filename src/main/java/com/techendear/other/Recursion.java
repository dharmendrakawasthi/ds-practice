package com.techendear.other;

public class Recursion {

	public static void main(String[] args) {
	
		print(1);
	}
	
	public static void print(int i) {
		
		 if(i==20) {
			 return;
		 }
		 
		System.out.println("Recuraing "+ i++);
		
		print(i);
		
		System.out.println("new call "+ i);
		
	}
	
}
