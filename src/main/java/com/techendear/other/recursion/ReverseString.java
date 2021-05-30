package com.techendear.other.recursion;

public class ReverseString {

	public static void main(String[] args) {
		
			ReverseString reverseString = new ReverseString();
			
			String str="aswecfdrt";
			
			System.out.println(reverseString.reverseStr(str));
	}
	
	
	public String reverseStr(String str) {
		
		int index = str.length()-1;
		
		if(index < 0 || str == null) {
			return str;
		}
		
		str = str.charAt(index) + reverseStr(str.substring(0, index));
		return str;
	}

}
