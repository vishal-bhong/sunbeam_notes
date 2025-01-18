package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program05 {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		Collections.addAll(l1, "Suresh", "Mukesh", "Sunil", "Anil", "Ramesh", "Sham", "Ram");

//		for (String s : l1) {
//			s = s + "_sunbeam";
//			System.out.println(s);
//		}

		l1.stream().map(s -> s + "_sunbeam").forEach(System.out::println);
		l1.stream().map(s -> s.charAt(0)).forEach(System.out::println);

		l1.stream().filter(s -> s.charAt(0) == 'S').map(s -> s + "_sunbeam").forEach(System.out::println);
		l1.stream().filter(s -> s.charAt(0) == 'S').sorted().map(s -> s + "_sunbeam").forEach(System.out::println);
	}

}
