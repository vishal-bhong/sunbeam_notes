package com.sunbeam;

import java.util.LinkedList;

public class Program04 {

	public static void main(String[] args) {
		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("Anil");
		l1.add("Mukesh");
		l1.add("Ramesh");
		l1.add("Suresh");

		for (int i = 0; i < l1.size(); i++)
			System.out.println(l1.get(i));

	}

}
