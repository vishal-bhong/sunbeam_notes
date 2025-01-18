package com.sunbeam.p2;

import java.util.LinkedList;

public class Program02 {

	public static void main(String[] args) {
		LinkedList<String> a1 = new LinkedList<String>();
		a1.addFirst("Anil");
		a1.addFirst("Mukesh");
		a1.addLast("Ramesh");
		a1.addLast("Suresh");

		for (String s : a1)
			System.out.print(s + ", ");
	}

}
