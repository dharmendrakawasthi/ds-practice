package com.techendear.hashtable;

public class MainClass {

	public static void main(String[] args) {
		Employee employee1 = new Employee("Joi", "Jonas", "UK");
		Employee employee2 = new Employee("Jams", "Jonas", "UK");
		Employee employee3 = new Employee("Jatin", "Kumar", "UK");
		Employee employee4 = new Employee("Joi", "Jamini", "UK");
		Employee employee5 = new Employee("Joi", "Dumin", "UK");

		MyHashTable hashTable = new MyHashTable();
		
		hashTable.put("Jonas", employee1);
		hashTable.put("Jonas", employee2);
		hashTable.put("Kumar", employee3);
		hashTable.put("Jamini", employee4);
		hashTable.put("Dumin", employee5);
		
		//hashTable.printHashTable();
		System.out.println(hashTable.get("Joi"));

	}

}
