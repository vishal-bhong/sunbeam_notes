package com.sunbeam;

public class Program02 {

	static void multiply(int n1, int n2) {
		System.out.println("Multiplication = " + (n1 * n2));
	}

	// change in no of paramaters
	static void multiply(int n1, int n2, int n3) {
		System.out.println("Multiplication = " + (n1 * n2 * n3));
	}

	static void square(int n) {
		System.out.println("Square = " + (n * n));
	}

	// change in type of parameter
	static void square(double n) {
		System.out.println("Square = " + (n * n));
	}

	static void division(int n, double d) {
		System.out.println("Division1 = " + (n / d));
	}

	static void division(double n, int d) {
		System.out.println("Division2 = " + (n / d));
	}

	public static void main(String[] args) {
		multiply(10, 2);
		multiply(10, 3, 2);
		square(5);
		square(5.5);
		division(10, 2.5);
		division(10.6, 2);
	}

}
