package com.sunbeam;

public class List {
	static class Node{
		private int data;
		private Node next;
		private Node prev;
		public Node(int value) {
			data = value;
			next = prev = null;
		}
	}

	private Node head;
	private Node tail;
	
	public List() {
		head = tail = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void fDisplay() {
		// forward traversal
		//1. start at head
		Node trav = head;
		System.out.print("Forward List : ");
		while(trav != null) {
			//2. print current node
			System.out.print(" " + trav.data);
			//3. go on next node
			trav = trav.next;
		}//4. repeat step 2 and 3 till last node
		System.out.println("");
	}
	
	public void rDisplay() {
		// reverse traversal
		//1. start at head
		Node trav = tail;
		System.out.print("Reverse List : ");
		while(trav != null) {
			//2. print current node
			System.out.print(" " + trav.data);
			//3. go on prev node
			trav = trav.prev;
		}//4. repeat step 2 and 3 till first node
		System.out.println("");
	}
	
	public void addFirst(int value) {
		//1. create node
		Node newnode = new Node(value);
		//2. if list is empty
		if(head == null)
			// add newnode into head and tail
			head = tail = newnode;
		//3. if list is not empty
		else {
			//a. add first node into next of newnode
			newnode.next = head;
			//b. add newnode into prev of first node
			head.prev = newnode;
			//c. move head on newnode
			head = newnode;
		}
	}
	
	public void addLast(int value) {
		//1. create node
		Node newnode = new Node(value);
		//2. if list is empty
		if(head == null)
			// add newnode into head and tail
			head = tail = newnode;
		//3. if list is not empty
		else {
			//a. add last node into prev of newnode
			newnode.prev = tail;
			//b. add newnode into next of last node
			tail.next = newnode;
			//c. move tail on newnode
			tail = newnode;
		}
			
	}
	
	public void deleteFirst() {
		//1. if list is empty
		if(head == null)
			return;
		//2. if list has single node
		if(head.next == null)
			head = tail = null;
		//3. if list has multiple node
		else {
			//a. move head on second node
			head = head.next;
			//b. make prev of second node equal to null
			head.prev = null;
		}
	}
	
	public void deleteLast() {
		//1. if list is empty
		if(head == null)
			return;
		//2. if list has single node
		else if (head == tail)
			head = tail = null;
		//3. if list has multiple node
		else {
			//a. move tail on second last node
			tail = tail.prev;
			//b. make next of second last node equal to null
			tail.next = null;
		}
	}
	
	public void deleteAll() {
		head = tail = null;
	}
	
	
}





















