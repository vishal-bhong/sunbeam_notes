package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Program04 {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		Collections.addAll(l1, "Suresh", "Mukesh", "Sunil", "Anil", "Ramesh", "Sham", "Ram", "Mukesh", "Anil", "Sham");
		// Fetch all the names that start with 'S'
		// sort in descending order
		// display the names

		// l1.stream().filter(s -> s.charAt(0) == 'S').sorted((s1, s2) ->
		// s2.compareTo(s1)).forEach(System.out::println);

		l1.stream().filter(new Predicate<String>() {
			@Override
			public boolean test(String s) {
				System.out.println("Inside Filter - " + s);
				return s.charAt(0) == 'S';
			}
		}).distinct().sorted(new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				System.out.println("Inside Compare - " + s1 + "," + s2);
				return s2.compareTo(s1);
			}
		}).forEach(new Consumer<String>() {
			@Override
			public void accept(String e) {
				System.out.println("Inside For-Each - " + e);
			}
		});
	}

}
