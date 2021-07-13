package com.techendear.ds.linkedlist;

public class LinkedList {

	Node head;

	public LinkedList add(int data) {

		Node node = new Node(data);

		if (this.head == null) {
			this.head = node;
		} else {

			Node last = this.head;

			while (last.next != null) {
				last = last.next;
			}

			last.next = node;
		}

		return this;
	}

	public void print(LinkedList list) {

		if (list.head == null) {
			System.out.println("List is empty");
			return;
		}

		Node node = list.head;

		while (node != null) {
			System.out.println(node.value);
			node = node.next;
		}
	}

}
