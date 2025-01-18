package com.sunbeam.p1;

import java.util.ArrayDeque;
import java.util.Deque;

// Implementing Queue using Dequeu
public class Program02 {

	public static void main(String[] args) {
		Deque<Integer> q1 = new ArrayDeque<Integer>();
		q1.addLast(10);
		q1.addLast(20);
		q1.offerLast(30);
		q1.offerLast(40);

		System.out.println("Element at Front - " + q1.getFirst());
		System.out.println("Element at Front - " + q1.peekFirst());

		q1.removeFirst();
		q1.pollFirst();

		System.out.println("Element at Front - " + q1.getFirst());
	}

}
