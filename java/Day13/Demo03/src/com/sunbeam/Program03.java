package com.sunbeam;

import java.util.function.BinaryOperator;

public class Program03 {

	public static void test(BinaryOperator<Integer> op) {
		System.out.println("Operation = " + op.apply(10, 20));
	}

	public static void main(String[] args) {

		// Method reference is a short-hand implemention of lambda expression
		test(Integer::sum); // Method Reference

		// Method Reference Operator (::)
		// empList.forEach(System.out::println); // Method Reference
	}

}
