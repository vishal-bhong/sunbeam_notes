package com.sunbeam;

import java.util.stream.Stream;

public class Program01 {

	public static void main(String[] args) {
		Stream<Integer> s1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println("First Stream s1 ->");
		// For-Each is a Terminal Operation
		s1.forEach(e -> System.out.print(e + ","));

		System.out.println();
		Stream<Integer> s2 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println("Second Stream s2 ->");
		// count is a terminal operation
		long c = s2.count();
		System.out.println("elemnets count = " + c);

		System.out.println("Third Stream s3 ->");
		Stream<Integer> s3 = Stream.of(7, 3, 5, 7, 5, 2, 1, 4, 1);
		s3.distinct().forEach(e -> System.out.print(e + ","));

		System.out.println();
		System.out.println("Fourth Stream s4 ->");
		Stream<Integer> s4 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		s4.limit(5).forEach(e -> System.out.print(e + ","));

		System.out.println();
		System.out.println("Fifth Stream s4 ->");
		Stream<Integer> s5 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		s5.skip(5).limit(3).forEach(e -> System.out.print(e + ","));
	}

}
