package com.sunbeam.p1;

import java.util.ArrayDeque;
import java.util.Queue;

public class Program01 {

	public static void main(String[] args) {
		Queue<Integer> q1 = new ArrayDeque<Integer>();
		q1.add(10); // method of collection interface
		q1.add(20);
		q1.offer(30); // method of queue interface
		q1.offer(40);
		q1.offer(50);

		System.out.println("Element removed = " + q1.remove()); // If empty throws NoSuchElementException
		System.out.println("Element removed = " + q1.poll());// If empty returns null

		System.out.println("Element at the front = " + q1.element());// If empty throws NoSuchElementException
		System.out.println("Element at the front = " + q1.peek());// If empty returns null

		for (Integer i : q1) {
			System.out.println(i);
		}

	}

}
