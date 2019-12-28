package com.mhaque.datastructure.tree;

public class TreeDemo {

	TreeNode root;
	public static void main(String[] args) {
		TreeDemo myTree = new TreeDemo();
		myTree.root = new TreeNode(5);
        myTree.root.left= new TreeNode(3);
        myTree.root.right= new TreeNode(8);
        System.out.println(myTree);
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

}
