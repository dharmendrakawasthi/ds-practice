package com.techendear.hashtable;

public class MainClass {

	public static void main(String[] args) {
		HashObj s1 = new HashObj("Hello","Hello World");
		HashObj s2 = new HashObj("Java","Hello World");
		HashObj s3 = new HashObj("Hello","Hello World");
		HashObj s4 = new HashObj("Python","Hello World");
		HashObj s5 = new HashObj("World","Hello World");


		HashTable hashTable = new HashTable(10);
		hashTable.put("Hello", s1);
		hashTable.put("Java", s2);
		hashTable.put("Python", s3);
		hashTable.put("Js", s4);
		hashTable.put("World", s5);

		hashTable.printHash();
	}

}
