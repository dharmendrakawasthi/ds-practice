package com.techendear.hashtable;

public class HashObj {
	
	private Object object;
	private String key;
	
	public HashObj(Object object, String key) {
		this.object = object;
		this.key = key;
	}
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
}
