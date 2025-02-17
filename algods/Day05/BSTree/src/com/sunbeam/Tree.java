package com.sunbeam;

public class Tree {
	static class Node{
		private int data;
		private Node left;
		private Node right;
		public Node(int value) {
			data = value;
			left = right = null;
		}
	}
	
	private Node root;
	public Tree() {
		root = null;
	}
	
	public boolean isEmpty() {
		return root == null;
	}
	
	public void addNode(int value) {
		//1. create node for given value
		Node newnode = new Node(value);
		//2. if BSTree is empty
		if(isEmpty())
			// add newnode into root itself
			root = newnode;
		//3. if BSTree is not empty
		else {
			//3.1 create trav reference and start at root node
			Node trav = root;
			while(true) {
				//3.2 if value is less than current node data (trav.data)
				if(value < trav.data) {
					//3.2.1 if left of current node is empty
					if(trav.left == null) {
						// add newnode into left of current node
						trav.left = newnode;
						break;
					}
					//3.2.2 if left of current node is not empty
					else
						// go into left of current node
						trav = trav.left;
				}
				//3.3 if value is greater or equal than current node data (trav.data)
				else {	
					//3.3.1 if right of current node is empty
					if(trav.right == null) {
						// add newnode into right of current node
						trav.right = newnode;
						break;
					}
					//3.3.2 if right of current node is not empty
					else
						// go into right of current node
						trav = trav.right;
				}
			}//3.4 repeat step 3.2 and 3.3 till node is not getting added into BSTree
		}
	}
	
	private void preOrder(Node trav) {
		//1. stop if left or right sub tree is absent
		if(trav == null)
			return;
		//2. visit current node
		System.out.print(" " + trav.data);
		//3. go into left of current node
		preOrder(trav.left);
		//4. go into right of current node
		preOrder(trav.right);
	}
	
	public void preOrder() {
		System.out.print("PreOrder : ");
		preOrder(root);
		System.out.println("");
	}
	
	private void inOrder(Node trav) {
		//1. stop if left or right sub tree is absent
		if(trav == null)
			return;
		//3. go into left of current node
		inOrder(trav.left);
		//2. visit current node
		System.out.print(" " + trav.data);
		//4. go into right of current node
		inOrder(trav.right);
	}
	
	public void inOrder() {
		System.out.print("InOrder : ");
		inOrder(root);
		System.out.println("");
	}
	
	private void postOrder(Node trav) {
		//1. stop if left or right sub tree is absent
		if(trav == null)
			return;
		//3. go into left of current node
		postOrder(trav.left);
		//4. go into right of current node
		postOrder(trav.right);
		//2. visit current node
		System.out.print(" " + trav.data);
	}
	
	public void postOrder() {
		System.out.print("PostOrder : ");
		postOrder(root);
		System.out.println("");
	}
	
	public Node binarySearch(int key) {
		//1. start from root
		Node trav = root;
		while(trav != null) {
			//2. if key is equal to current data
			if(key == trav.data)
				//return current node
				return trav;
			//3. if key is less than current data
			else if(key < trav.data)
				// search key into left of current node
				trav = trav.left;
			//4. if key is greater than current data
			else
				// search key into right of current node
				trav = trav.right;
		}//5. repeat step 2 to 4 till leaf nodes 
		//6. if key is not found
		return null;
	}
	
	public Node[] binarySearchWithParent(int key) {
		//1. start from root
		Node trav = root;
		Node parent = null;
		while(trav != null) {
			//2. if key is equal to current data
			if(key == trav.data)
				break;
			parent = trav;
			//3. if key is less than current data
			if(key < trav.data)
				// search key into left of current node
				trav = trav.left;
			//4. if key is greater than current data
			else
				// search key into right of current node
				trav = trav.right;
		}//5. repeat step 2 to 4 till leaf nodes 
		//6. if key is not found
		if(trav == null)
			parent = null;
		return new Node[] {trav, parent};
	}
	
	public void deleteNode(int key) {
		//1. search node with its parent
		Node arr[] = binarySearchWithParent(key);
		Node temp = arr[0], parent = arr[1];
		//2. if node is not found
		if(temp == null)
			return;
		//3. if node has 2 childs
		if(temp.left != null && temp.right != null){
			//1. find predecessor of temp.data
			Node pred = temp.left;
			parent = temp;
			while(pred.right != null){
				parent = pred;
				pred = pred.right;
			}
			//2. replace temp's data by predecessor's data
			temp.data = pred.data;
			//3. delete predecessor
			temp = pred;
		}
		//4. if node has single child (right child)
		if(temp.left == null){
			if(temp == root)
				root = temp.right;
			else if(temp == parent.left)
				parent.left = temp.right;
			else if(temp == parent.right)
				parent.right = temp.right;
		}
		//5. if node has single child (left child)		
		else {//if(temp.right == null){
			if(temp == root)
				root = temp.left;
			else if(temp == parent.left)
				parent.left = temp.left;
			else if(temp == parent.right)
				parent.right = temp.left;
		}
	}

	public void deleteAll() {
		root = null;
	}
}














