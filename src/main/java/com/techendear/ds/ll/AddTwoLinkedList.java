package com.techendear.ds.ll;

public class AddTwoLinkedList {

	Node head;

	public AddTwoLinkedList addTwoLl(AddTwoLinkedList list1, AddTwoLinkedList list2) {

		AddTwoLinkedList list = null;
		
		if(list1.head ==null || list2.head == null){
			System.out.println("Nothing to add ");
			return null;
		}
		
		AddTwoLinkedList l1 = this.reverseLl(list1);
		AddTwoLinkedList l2 = this.reverseLl(list2);

		while(l1.head.next ==null || l2.head.next == null) {
			
		}
		
		
		return list;
	}

	public AddTwoLinkedList reverseLl(AddTwoLinkedList list) {

		Node prev = null;
		Node curr = this.head;
		Node next = null;

		while (curr.next != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}

		head = prev;
		return list;
	}

	public Node add(int data) {

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

		return this.head;
	}

	public void print(Node head) {

		if (head == null) {
			System.out.println("List is empty");
			return;
		}

		Node node = this.head;

		while (node != null) {
			System.out.println(node.value);
			node = node.next;
		}
	}

	public static void main(String[] args) {

		AddTwoLinkedList list = new AddTwoLinkedList();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(12);
		list.add(14);
		list.add(15);

		list.print(list.head);
		list.reverseLl(list);
		System.out.println("Reversed ");
		list.print(list.head);
	}

}
