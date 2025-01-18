package com.sunbeam;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Program02 {

	public static void main(String[] args) {
		Collection<Integer> c1 = new CopyOnWriteArrayList<Integer>();
		Collections.addAll(c1, 10, 20, 30, 40, 50);

		// fail-safe iterators
		Iterator<Integer> itr = c1.iterator();
		while (itr.hasNext()) {
			int i = itr.next();

			if (i == 30)
				c1.add(60);

			System.out.println(i);
		}
		
		
		Iterator<Integer> itr2 = c1.iterator();
		System.out.println("Afer :: ");
		while (itr2.hasNext()) {
			int i = itr2.next();

			System.out.println(i);
		}

//		10
//		20
//		30
//		40
//		50
//		Afer :: 
//		10
//		20
//		30
//		40
//		50
//		60
	}

}
