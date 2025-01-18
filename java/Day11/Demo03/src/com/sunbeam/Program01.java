package com.sunbeam;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program01 {

	public static void main(String[] args) {
		Set<Integer> s1 = new LinkedHashSet<Integer>();
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(40);
		s1.add(50);
		s1.add(30);
		s1.add(null);
		s1.add(null);

		s1.remove(null);

		System.out.println("size = " + s1.size());	//	size = 5

		for (Integer i : s1) {
			System.out.print(i + ",");	// 10,20,30,40,50,
		}
	}

}
