package com.sunbeam;

public class BSTreeMain {

	public static void main(String[] args) {

		Tree bst = new Tree();
		
		bst.addNode(8);
		bst.addNode(3);
		bst.addNode(10);
		bst.addNode(6);
		bst.addNode(1);
		bst.addNode(14);
		bst.addNode(13);
		bst.addNode(7);
		bst.addNode(4);
		/*
		bst.preOrder();
		bst.inOrder();
		bst.postOrder();
		
		Tree.Node ret = bst.binarySearch(12);
		if(ret == null)
			System.out.println("Key is not found");
		else
			System.out.println("Key is found");
			
		
		
		bst.inOrder();
		
		bst.deleteNode(8);
		
		bst.inOrder();
		
		*/
		
		bst.DFSTraversal();
		bst.BFSTraversal();
		
		System.out.println("Height : " + bst.height());
	}

}













