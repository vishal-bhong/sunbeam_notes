package com.sunbeam;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Program01 {

	public static void main(String[] args) {
//		Collection<Integer> c1 = new ArrayList<Integer>();
//		Collection<Integer> c1 = new LinkedList<Integer>();
		Collection<Integer> c1 = new LinkedHashSet<Integer>();
		// to add the elements in the collection
		c1.add(new Integer(10));
		c1.add(20);
		c1.add(30);
		c1.add(40);
		c1.add(50);

		Integer i1 = 200;
		if (c1.contains(i1))
			System.out.println("Element found...");
		else
			System.out.println("Element Not found...");

		// c1.clear();
		System.out.println("Is Collection empty - " + c1.isEmpty());

		Iterator<Integer> itr = c1.iterator();
		// using Iterator in while
		System.out.println("Using while -> ");
		while (itr.hasNext()) {
			Integer i = itr.next();
			System.out.println(i);
		}

		// using Iterator in for
		System.out.println("Using for-loop -> ");
		for (Iterator<Integer> it = c1.iterator(); it.hasNext();) {
			Integer i = it.next();
			System.out.println(i);
		}

		// using for-each
		System.out.println("Using for-each -> ");
		for (Integer i : c1)
			System.out.println(i);

		System.out.println("Using lamda expression ->");
		c1.forEach(e -> System.out.println(e));

		System.out.println("Using method references->");
		c1.forEach(System.out::println);

	}

}
