package com.sunbeam;

import java.util.function.BinaryOperator;

public class Program02 {

	public static void test(BinaryOperator<Integer> op) {
		System.out.println("Operation = " + op.apply(10, 20));
	}

	// capturing lambda
	public static void main(String[] args) {
		int z = 30;
		// z = 40; NOT OK for capturing lambda
		// the local variables should be final or effectively final

		test((x, y) -> x + y + z);

		test((x, y) -> x * y * z);

		test((x, y) -> z - (y / x));

	}

}
