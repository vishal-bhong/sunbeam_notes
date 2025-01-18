package com.sunbeam;

import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Program02 {

	public static void main(String[] args) {
		Stream<Double> s1 = Stream.generate(() -> Math.random()).limit(10);
		s1.forEach(e -> System.out.print(e + ", "));

		System.out.println();
//		Stream<Integer> s2 = Stream.iterate(1, i -> i + 1).limit(8);
//		s2.forEach(e -> System.out.print(e + ", "));

		Stream.iterate(1, new UnaryOperator<Integer>() {
			@Override
			public Integer apply(Integer i) {
				System.out.println("Value of i = " + i);
				return i + 1;
			}
		}).limit(8).forEach(e -> System.out.print(e + ", "));
	}

}
