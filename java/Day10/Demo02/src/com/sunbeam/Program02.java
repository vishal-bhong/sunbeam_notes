package com.sunbeam;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Program02 {

	public static void main(String[] args) {
		List<String> l1 = new LinkedList<String>();
		l1.add("Anil");
		l1.add("Mukesh");
		l1.add("Ramesh");
		l1.add("Suresh");

		System.out.println("size of l1 = " + l1.size());
		
//				size of l1 = 4

		// forward direction
		System.out.println("Forward List ->");
		ListIterator<String> itr = l1.listIterator();
		while (itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}
		
//				Forward List ->
//				Anil
//				Mukesh
//				Ramesh
//				Suresh

		itr = l1.listIterator(l1.size() - 1);
		// Reverse direction
		System.out.println("Reverse List ->");
		while (itr.hasPrevious()) {
			String name = itr.previous();
			System.out.println(name);
		}
		//Reverse List ->
		//Ramesh
		//Mukesh
		//Anil
	}
}
