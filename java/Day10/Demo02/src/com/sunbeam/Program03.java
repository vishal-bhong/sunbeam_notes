package com.sunbeam;

import java.util.LinkedList;
import java.util.List;

public class Program03 {
	public static void display(List<String> l1) {
		for (String s : l1)
			System.out.println(s);
	}

	public static void main(String[] args) {
		List<String> l1 = new LinkedList<String>();
		l1.add("Anil");
		l1.add("Mukesh");
		l1.add("Ramesh");
		l1.add("Suresh");

		System.out.println("Before - ");
		display(l1);

		System.out.println("Element removed = " + l1.remove(2));

		l1.set(1, "Ram");

		System.out.println("After - ");
		display(l1);

	}
}
