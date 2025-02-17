package com.sunbeam;

public class DLLinkedListMain {

	public static void main(String[] args) {

		List list = new List();
		
		list.addFirst(40);
		list.addFirst(30);
		list.addFirst(20);
		list.addFirst(10);
		
		list.addLast(50);
		list.addLast(60);
		
		//list.deleteFirst();
		//list.deleteFirst();
		
		list.deleteLast();
		list.deleteLast();
		
		list.fDisplay();
		list.rDisplay();
	}

}










