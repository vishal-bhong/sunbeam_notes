package com.sunbeam;

import java.util.LinkedList;
import java.util.List;

public class Program01 {
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
		l1.add("Mukesh");

		System.out.println("Before - ");
		display(l1);

		l1.add(2, "Ram");
		System.out.println("After - ");
		display(l1);

		System.out.println("Element at index 3 = " + l1.get(3));
		System.out.println("Index of Mukesh = " + l1.indexOf("Mukesh"));
		System.out.println("Last Index of Mukesh = " + l1.lastIndexOf("Mukesh"));

	}
}
