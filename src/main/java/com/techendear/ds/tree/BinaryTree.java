package com.techendear.ds.tree;

public class BinaryTree {

	Node node;

	public Node addNode(Node root, int value) {

		Node node = new Node(value);

		if (root == null) {
			root = node;
			return root;
		}

		if (root.data > value) {
			if (root.left == null) {
				root.left = node;
			} else {
				addNode(root.left, value);
			}
		} else {

			if (root.right == null) {
				root.right = node;
			} else {
				addNode(root.right, value);
			}
		}

		return root;
	}

	public void add(int value) {
		this.node = this.addNode(node, value);
	}

	public void inOrder(Node root) {

		if (root != null) {

			inOrder(root.left);
			System.out.println("Data: " + root.data);
			inOrder(root.right);
		}
	}
}
