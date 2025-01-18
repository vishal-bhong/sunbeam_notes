package com.sunbeam;

import java.util.Set;
import java.util.TreeSet;

public class Program03 {

	public static void main(String[] args) {
//		Set<String> s1 = new HashSet<String>();
//		Set<String> s1 = new LinkedHashSet<String>();
		Set<String> s1 = new TreeSet<String>();
		s1.add("Anil");
		s1.add("Ramesh");
		s1.add("Suresh");
		s1.add("Mukesh");
		s1.add("Ram");

		for (String s : s1) {
			System.out.print(s + ", ");
		}

	}

}
