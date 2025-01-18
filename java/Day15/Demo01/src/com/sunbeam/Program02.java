package com.sunbeam;

import java.util.Optional;
import java.util.stream.Stream;

public class Program02 {

	public static void main(String[] args) {
		Optional<Integer> result = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).reduce((x, y) -> x + y);

		result = Optional.empty();

		System.out.println(result.orElse(0));
		// System.out.println(result.orElseThrow());
	}

}
