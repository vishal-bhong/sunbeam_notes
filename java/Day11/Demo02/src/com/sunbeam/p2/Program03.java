package com.sunbeam.p2;

import java.util.PriorityQueue;

public class Program03 {

	public static void main(String[] args) {
		PriorityQueue<String> q1 = new PriorityQueue<String>();
		q1.add("Mukesh");
		q1.add("Anil");
		q1.add("Suresh");
		q1.add("Ramesh");

		// System.out.println("Element at front = " + q1.peek());
		System.out.println("Element Removed = " + q1.poll());
		System.out.println("Element Removed = " + q1.poll());
		System.out.println("Element Removed = " + q1.poll());

		// for (String s : q1)
		// System.out.print(s + ",");

	}

}
