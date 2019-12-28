package com.mhaque.datastructure.tree;

import static org.junit.Assert.*;

import org.junit.Test;

import com.mhaque.datastructure.tree.TreeSearch.TreeNode;

public class TreeSearchTest {

	@Test
	public void test() {
		TreeSearch myTree = new TreeSearch();
		myTree.insertNode(5);
		myTree.insertNode(3);
		myTree.insertNode(8);
		myTree.insertNode(7);
		myTree.insertNode(11);
		
		myTree.printInOrder();
		
		System.out.println();
		
	   TreeNode node = myTree.findNode(myTree.root,13);
	   if(node==null) {
		   System.out.println("Node is not found.");
	   }
	   else {
	         System.out.println(node.nodeValue + " found.");
	   }
	}

}
