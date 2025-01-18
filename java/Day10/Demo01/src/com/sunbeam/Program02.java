package com.sunbeam;

import java.util.Collection;
import java.util.LinkedHashSet;

public class Program02 {

	public static void main(String[] args) {
		Collection<Integer> c1 = new LinkedHashSet<Integer>();
		c1.add(10);
		c1.add(20);
		c1.add(30);
		c1.add(40);
		c1.add(50);

		System.out.println("Element removed - " + c1.remove(30));

		System.out.println("c1.size() - " + c1.size());

	}

}
