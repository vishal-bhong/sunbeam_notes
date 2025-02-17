package com.sunbeam;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import javax.management.Query;

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
	
		
	public void DFSTraversal() {
		//0. create stack to push nodes
		Stack<Node> st = new Stack<Tree.Node>();
		//1. push root on stack
		st.push(root);
		System.out.print("DFS Traversal : ");
		while(!st.isEmpty()) {
			//2. pop one node from stack
			Node trav = st.pop();
			//3. visit(print) node
			System.out.print(" " + trav.data);
			//4. if right exist, push it on stack
			if(trav.right != null)
				st.push(trav.right);
			//5. if left exist, push it on stack
			if(trav.left != null)
				st.push(trav.left);
		}//6. while stack is not empty repeat ste 2 to 5
		System.out.println("");
	}
	
	public void BFSTraversal() {
		//0. create queue to push the nodes
		Queue<Node> q = new LinkedList<Tree.Node>();
		//1. push root on queue
		q.offer(root); 		// to push
		System.out.print("BFS Traversal : ");
		while(!q.isEmpty()) {
			//2. pop one node from queue
			Node trav = q.poll();		// to pop
			//3. visit(print) node
			System.out.print(" " + trav.data);
			//4. if left exist, push it on queue
			if(trav.left != null)
				q.offer(trav.left);
			//5. if right exist, push it on queue
			if(trav.right != null)
				q.offer(trav.right);
		}//6. while queue is not empty repeat ste 2 to 5
		System.out.println("");
	}
	
	public int height(Node trav) {
		//0. if left or right sub tree is absent 
		if(trav == null)
			return -1;
		//1. find height of left subtree
		int hl = height(trav.left);
		//2. find height of right subtree
		int hr = height(trav.right);
		//3. find max height
		int max = hl > hr ? hl : hr;
		//4. add one into max height(return)
		return max + 1;
	}
	
	public int height() {
		return height(root);
	}

	public void deleteAll() {
		root = null;
	}
}














