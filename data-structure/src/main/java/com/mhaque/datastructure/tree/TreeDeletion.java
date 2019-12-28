package com.mhaque.datastructure.tree;

public class TreeDeletion {

     TreeNode root;
	
	public void removeNode(int nodeValue) {
		root = removeNodeRecursion(root, nodeValue);
	}

	private TreeNode removeNodeRecursion(TreeNode root, int nodeValue) {
		if(root==null) {
			return root;
		}
		if(nodeValue< root.nodeValue) {
			root.left = removeNodeRecursion(root.left, nodeValue);
		}
		else if(nodeValue> root.nodeValue){
			root.right = removeNodeRecursion(root.right, nodeValue);						
		}
		else {
			if(root.left==null) {
				return root.right;
			}
			else if (root.right==null){
				return root.left;
			}
			root.nodeValue = minimumValue(root.right);
			root.right = removeNodeRecursion(root.right, root.nodeValue);
		}
		return root;
	}

	private int minimumValue(TreeNode root) {
		int tempMin = root.nodeValue;
		while(root.left!=null) {
			tempMin = root.left.nodeValue;
			root= root.left;
		}
		return tempMin;
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
