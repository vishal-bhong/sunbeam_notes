package com.sunbeam.p2;

import java.util.ArrayDeque;

public class Program01 {

	public static void main(String[] args) {
		ArrayDeque<String> a1 = new ArrayDeque<String>();
		a1.addFirst("Anil");
		a1.addFirst("Mukesh");
		a1.addLast("Ramesh");
		a1.addLast("Suresh");

		for (String s : a1)
			System.out.print(s + ", ");
	}

}
