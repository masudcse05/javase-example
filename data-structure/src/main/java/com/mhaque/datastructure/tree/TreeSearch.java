package com.mhaque.datastructure.tree;

public class TreeSearch {

	TreeNode root;

	static class TreeNode {
		int nodeValue;
		TreeNode left;
		TreeNode right;

		public TreeNode(int nodeValue) {
			this.nodeValue = nodeValue;
			left = null;
			right = null;
		}
	}

	void insertNode(int nodeValue) {
		root = insertNodeRecursion(root, nodeValue);
	}

	private TreeNode insertNodeRecursion(TreeNode root, int newValue) {
		if (root == null) {
			root = new TreeNode(newValue);
			return root;
		}
		if (newValue < root.nodeValue) {
			root.left = insertNodeRecursion(root.left, newValue);
		} else {
			root.right = insertNodeRecursion(root.right, newValue);
		}
		return root;
	}

	void printInOrder() {
		printInOrderRecursion(root);
	}

	private void printInOrderRecursion(TreeNode root) {
		if (root != null) {
			printInOrderRecursion(root.left);
			System.out.print(root.nodeValue + "\t");
			printInOrderRecursion(root.right);
		}
	}

	public TreeNode findNode(TreeNode root, int value) {
		if (root == null || root.nodeValue == value) {
			return root;
		}
		if (root.nodeValue > value) {
			return findNode(root.left, value);
		} else {
			return findNode(root.right, value);
		}
	}

}
