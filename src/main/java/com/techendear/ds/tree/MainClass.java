package com.techendear.ds.tree;

public class MainClass {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		
		tree.add(2);
		tree.add(6);
		tree.add(8);
		tree.add(1);

		tree.inOrder(tree.node);
	}

}
