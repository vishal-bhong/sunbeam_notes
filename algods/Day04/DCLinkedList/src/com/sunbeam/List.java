package com.sunbeam;

public class List {
	static class Node{
		private int data;
		private Node next, prev;
		public Node(int value) {
			data = value;
			next = prev = null;
		}
	}
	
	private Node head;
	private int size;
	public List() {
		head = null;
		size = 0;
	}
	
	public boolean isEmpty() {
		//return head == null;
		return size == 0;
	}
	
	public int size() {
		return size;
	}
	
	public void fDisplay() {
		// forward traversal
		//1. start at head
		Node trav = head;
		System.out.print("Forward List : ");
		do {
			//2. print current node
			System.out.print(" " + trav.data);
			//3. go on next node
			trav = trav.next;
		}while(trav != head);//4. repeat step 2 and 3 till last node
		System.out.println("");
	}
	
	public void rDisplay() {
		// reversal traversal
		//1. start at last node
		Node trav = head.prev;
		System.out.print("Reverse List : ");
		do {
			//2. print current node
			System.out.print(" " + trav.data);
			//3. go on prev node
			trav = trav.prev;
		}while(trav != head.prev);//4. repeat step 2 and 3 till first node
		System.out.println("");
	}
	
	public void addFirst(int value) {
		//a. create a newnode
		Node nn = new Node(value);
		//b. if list is empty
		if(head == null) {
			//1. add newnode into head
			head = nn;
			//2. make list circular
			head.prev = head.next = head;
		}
		//c. if list is not empty
		else {
			//1. add first node into next of newnode
			nn.next = head;
			//2. add last node into prev of newnode
			nn.prev = head.prev;
			//3. add newnode into next of last node
			head.prev.next = nn;
			//4. add newnode into prev of first node
			head.prev = nn;
			//5. move head on newnode
			head = nn;
		}
		size++;
	}
	
	public void addLast(int value) {
		//a. create a newnode
		Node nn = new Node(value);
		//b. if list is empty
		if(head == null) {
			//1. add newnode into head
			head = nn;
			//2. make list circular
			head.prev = head.next = head;
		}
		//c. if list is not empty
		else {
			//1. add first node into next of newnode
			nn.next = head;
			//2. add last node into prev of newnode
			nn.prev = head.prev;
			//3. add newnode into next of last node
			head.prev.next = nn;
			//4. add newnode into prev of first node
			head.prev = nn;
		}
		size++;
	}
	
	public void addPosition(int value, int pos) {
		if(pos < 1 || pos > size + 1)
			return;
		//a. create a newnode
		Node nn = new Node(value);
		//b. if list is empty
		if(head == null) {
			//1. add newnode into head
			head = nn;
			//2. make list circular
			head.next = head.prev = head;
		}
		else if(pos == 1){
			addFirst(value);
			return;
		}
		//c. if list is not empty
		{
			// traverse till pos-1 node
			Node trav = head;
			for(int i = 1 ; i < pos - 1 ; i++)
				trav = trav.next;
			//1. add pos node into next of newnode
			nn.next = trav.next;
			//2. add pos-1 node into prev of newnode
			nn.prev = trav;
			//3. add newnode into next of pos-1 node
			trav.next = nn;
			//4. add newnode into prev of pos node
			nn.next.prev = nn;
		}
		size++;
	}
	
	public void deleteFirst() {
		//1. if list is empty
		if(head == null)
			return;
		//2. if list has single node
		else if(head.next == head)
			head = null;
		//3. if list has multiple node
		else {
			//a. add last node into prev of second node
			head.next.prev = head.prev;
			//b. add second node into next of last node
			head.prev.next = head.next;
			//c. move head on second node
			head = head.next;
		}
		size--;
	}
	
	public void deleteLast() {
		//1. if list is empty
		if(head == null)
			return;
		//2. if list has single node
		else if(head.next == head)
			head = null;
		//3. if list has multiple node
		else {
			//a. add first node into next of second last node
			head.prev.prev.next = head;
			//b. add second last node into prev of first node
			head.prev = head.prev.prev;
		}
		size--;
	}
	
	public void deletePosition(int pos) {
		if(pos < 1 || pos > size)
			return;
		//1. if list is empty
		if(head == null)
			return;
		//2. if list has single node
		else if(head.next == head)
			head = null;
		else if(pos == 1) {
			deleteFirst();
			return;
		}
		//3. if list has multiple nodes
		else {
			//a. traverse till pos node
			Node trav = head;
			for(int i = 1 ; i < pos ; i++)
				trav = trav.next;
			//b. add pos-1 node into prev of pos+1 node
			trav.next.prev = trav.prev;
			//c. add pos+1 node into next of pos-1 node
			trav.prev.next = trav.next;
		}
		size--;
	}
	
	public void deleteAll() {
		head = null;
		size = 0;
	}
}


















