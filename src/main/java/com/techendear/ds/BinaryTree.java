package com.techendear.ds;

public class BinaryTree {

    TreeNode root;
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		
		tree.add(1);
		tree.add(2);
		tree.add(4);
		tree.add(3);
		
	}

	
	public TreeNode addNode(TreeNode current, int value) {

		if(current==null) {
			return new TreeNode(value);
		}
		
		if(value < current.value) {
//			System.out.println(value);

			current.left = addNode(current.left, value);
		}else if(value > current.value) {
			System.out.println(value);
			current.right = addNode(current.right, value);
		} else {
			return current;
		}
		return current;
	}
	
	public void add(int value) {
		root = this.addNode(root, value);
	}
	
	
	public void printTree(TreeNode root) {
		
		System.out.println("Root"+root.value);
		printTree(root.left);
		System.out.println("Left: "+ root.left.value);
		printTree(root.right);
		System.out.println("Right: "+ root.right.value);
	}
}
