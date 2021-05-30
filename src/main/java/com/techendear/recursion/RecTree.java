package com.techendear.recursion;

public class RecTree {

	public static void main(String[] args) {
		var recTree = new RecTree();
		System.out.println(recTree.printRec(9));
	}
	
	public int printRec(int n) {
		if(n <= 1) return n;
		return printRec(n-1) + printRec(n-2);
	}

}
