package com.sunbeam.p1;

import java.util.ArrayDeque;
import java.util.Deque;

// Implementing Stack using Dequeu
public class Program03 {

	public static void main(String[] args) {
		Deque<Integer> q1 = new ArrayDeque<Integer>();
		q1.addFirst(10);
		q1.addFirst(20);
		q1.offerFirst(30);
		q1.offerFirst(40);

		System.out.println("Element at top - " + q1.getFirst());
		System.out.println("Element at top - " + q1.peekFirst());

		q1.removeFirst();
		q1.pollFirst();
		System.out.println("After remove, Element at top - " + q1.peekFirst());

	}

}
