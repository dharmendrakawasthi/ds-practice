package com.techendear.hashtable;

public class HashTable {

	private HashObj[] object;

	public HashTable() {
	}

	public HashTable(int size) {
		this.object = new HashObj[size];
	}

	public int getKey(String key) {
		return key.length() % object.length;
	}

	public void put(String key, HashObj object) {
		int hashKey = getKey(key);
		if (this.accupied(hashKey)) {
			int stopIndex = hashKey;
			if (hashKey == this.object.length - 1) {
				hashKey = 0;
			} else {
				hashKey++;
			}

			while (this.accupied(hashKey) && hashKey != stopIndex) {
				hashKey = (hashKey + 1) % this.object.length;
			}
		}

		if (this.accupied(hashKey)) {
			System.out.println("There is already data on" + hashKey);
		} else {
			this.object[hashKey] = object;
		}
	}

	public Object get(String key) {

		int hashKey = getKey(key);
		int stopIndex = hashKey;

		if (hashKey == this.object.length - 1) {
			hashKey = 0;
		} else {
			hashKey++;
		}
		if (this.accupied(hashKey) && this.object[hashKey].getKey() != key) {
			while (this.accupied(hashKey) && hashKey != stopIndex && key != this.object[hashKey].getKey()) {

				hashKey = (hashKey + 1) % this.object.length;
			}

			if (!this.accupied(hashKey)) {
				System.out.println("There is no data on" + hashKey);
				return 0;
			}

			return this.object[hashKey];

		} else {
			return this.object[hashKey];
		}
	}

	private boolean accupied(int index) {
		return object[index] != null;
	}

	public void printHash() {
		for (int i = 0; i < this.object.length; i++) {
			System.out.println(this.object[i] + "\n");
		}
	}
}
