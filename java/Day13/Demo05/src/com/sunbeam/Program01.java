package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program01 {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();
		Collections.addAll(l1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//		for (Integer e : l1) {
//			if (e % 2 == 0)
//				System.out.println(e * e);
//		}

		l1.stream().filter(e -> e % 2 == 0).map(e -> e * e).forEach(System.out::println);
	}

}
