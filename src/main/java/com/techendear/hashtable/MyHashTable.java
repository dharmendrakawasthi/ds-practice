package com.techendear.hashtable;

public class MyHashTable {

	private Employee[] hashTable = new Employee[20];

	public MyHashTable() {
	}

	public MyHashTable(Employee[] hashTable) {
		this.hashTable = hashTable;
	}

	public int getHashKey(String key) {

		return key.length() % hashTable.length;
	}

	private boolean occupied(int key) {
		return hashTable[key] != null;
	}

	public Employee get(String key) {
		int hashkey = getHashKey(key);
		return hashTable[hashkey];
	}

	public void put(String key, Employee employee) {
		int hashkey = getHashKey(key);

		if(occupied(hashkey)) {
			int stopInd = hashkey;
			
			if(hashkey == hashTable.length - 1) {
				hashkey = 0;
			}else {
				hashkey++;
			}
			while(occupied(hashkey) && hashkey!=stopInd) {
				hashkey = (hashkey+1)%hashTable.length;
			}
		}
		if (occupied(hashkey)) {
			System.out.println("There already employee at:" + hashkey);
		} else {
			hashTable[hashkey] = employee;
		}
	}

	public void printHashTable() {
		for (int i = 0; i < hashTable.length; i++) {
			System.out.println(hashTable[i]);
		}
	}

}
