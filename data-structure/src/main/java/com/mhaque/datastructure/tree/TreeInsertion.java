package com.mhaque.datastructure.tree;

public class TreeInsertion {

     TreeNode root;
	public static void main(String[] args) {
		TreeInsertion myTree = new TreeInsertion();
		myTree.insertNode(5);
		myTree.insertNode(3);
		myTree.insertNode(8);
		myTree.insertNode(7);
		myTree.insertNode(11);
		
		myTree.printInOrder();
	}
	
	static class TreeNode{
		int nodeValue;
		TreeNode left;
		TreeNode right;
		public TreeNode(int nodeValue) {
			this.nodeValue = nodeValue;
			left=null;
			right= null;
		}	
	}
	void insertNode(int nodeValue) {
		root = insertNodeRecursion(root, nodeValue);
	}

	private TreeNode insertNodeRecursion(TreeNode root, int newValue) {
		if(root ==null) {
			root = new TreeNode(newValue);
			return root;
		}
		if(newValue< root.nodeValue) {
			root.left = insertNodeRecursion(root.left, newValue);
		}
		else {
			root.right = insertNodeRecursion(root.right, newValue);
		}
		return root;
	}
	
	void printInOrder() {
		printInOrderRecursion(root);
	}

	private void printInOrderRecursion(TreeNode root) {
		if(root!=null) {
			printInOrderRecursion(root.left);
			System.out.print(root.nodeValue + "\t");
			printInOrderRecursion(root.right);
		}
		
	}


}
