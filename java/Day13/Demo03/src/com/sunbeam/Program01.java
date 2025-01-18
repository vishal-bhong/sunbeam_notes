package com.sunbeam;

import java.util.function.BinaryOperator;

public class Program01 {

//	void sort(Comparator<Employee> c) {
//		c.compare(e1,e2);
//	}

	public static void test(BinaryOperator<Integer> op) {
		System.out.println("Operation = " + op.apply(10, 20));
	}

	// non capturing lambda
	public static void main(String[] args) {
		int z = 30;

		test((x, y) -> x + y);

		test((x, y) -> x * y);

		test((x, y) -> y / x);

	}

}
