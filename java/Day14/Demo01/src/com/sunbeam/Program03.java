package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program03 {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		Collections.addAll(l1, "Suresh", "Mukesh", "Anil", "Ramesh", "Sham", "Ram", "Mukesh", "Anil", "Sham");

		System.out.println("Distinct names ->");
		l1.stream().distinct().forEach(System.out::println);

		System.out.println("Distinct names in sorted order->");
		l1.stream().distinct().sorted().forEach(System.out::println);      // sorted() - sort according to natural order so comparable should be implemented in respective class here String.     

		System.out.println("Distinct names in Descending sorted order->");
		l1.stream().distinct().sorted((o1, o2) -> o2.compareTo(o1)).forEach(System.out::println);
	}

}
