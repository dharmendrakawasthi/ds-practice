package com.techendear.linkedlist;

public class NodeObject {

	private Object next;
	private Object node;
	private Object prev;

	public NodeObject(Object next, Object node, Object prev) {
		this.next = next;
		this.node = node;
		this.prev = prev;
	}

	public Object getNext() {
		return next;
	}

	public void setNext(Object next) {
		this.next = next;
	}

	public Object getNode() {
		return node;
	}

	public void setNode(Object node) {
		this.node = node;
	}

	public Object getPrev() {
		return prev;
	}

	public void setPrev(Object prev) {
		this.prev = prev;
	}
}
