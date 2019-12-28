package com.mhaque.datastructure.tree;

import static org.junit.Assert.*;

import org.junit.Test;

public class TreeDeletionTest {

	@Test
	public void test() {
		TreeDeletion myTree = new TreeDeletion();
		myTree.insertNode(5);
		myTree.insertNode(3);
		myTree.insertNode(8);
		myTree.insertNode(7);
		myTree.insertNode(11);
		
		myTree.printInOrder();
		
		System.out.println();
		
		myTree.removeNode(7);
		myTree.printInOrder();
	}

}
