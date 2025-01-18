package com.sunbeam;

import java.util.Scanner;

public class Program05 {
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
		} finally {
			System.out.println("Inside Finally");
		}

		System.out.println("Program finished");

	}

}
