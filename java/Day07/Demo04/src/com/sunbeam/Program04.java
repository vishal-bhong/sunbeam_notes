package com.sunbeam;

import java.util.Scanner;

public class Program04 {
	public static void division(int n, int d) {
		int result = n / d;
		System.out.println("Division = " + result);
	}

	public static void main(String[] args) {

		// try-with-resource
		try (Scanner sc = new Scanner(System.in)) {
			division(10, 0);
		} catch (Exception e) {
			System.out.println("Exception generated");
		}

		System.out.println("Program finished");

	}

}
