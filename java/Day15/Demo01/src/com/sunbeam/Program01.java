package com.sunbeam;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program01 {

	public static void main(String[] args) {
		List<Integer> l1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter(e -> e % 2 == 0)
				.collect(Collectors.toList());

		System.out.println(l1);

		List<Integer> l2 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter(e -> e % 2 != 0).map(e -> e * e)
				.collect(Collectors.toList());

		System.out.println(l2);
	}

}
