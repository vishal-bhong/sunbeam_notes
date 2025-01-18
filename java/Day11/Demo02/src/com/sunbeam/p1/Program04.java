package com.sunbeam.p1;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Program04 {

	public static void main(String[] args) {
		Deque<Integer> q1 = new ArrayDeque<Integer>();
		q1.addFirst(10);
		q1.addFirst(20);
		q1.offerFirst(30);
		q1.offerFirst(40);
		q1.offerFirst(50);
		q1.offerFirst(60);

		System.out.println("using Iterator ->");
		Iterator<Integer> itr = q1.iterator();
		while (itr.hasNext()) {
			Integer i = itr.next();
			System.out.print(i + ", ");
		}

		System.out.println();
		System.out.println("using Descending Iterator ->");
		Iterator<Integer> ditr = q1.descendingIterator();
		while (ditr.hasNext()) {
			Integer i = ditr.next();
			System.out.print(i + ", ");
		}
	}

}
