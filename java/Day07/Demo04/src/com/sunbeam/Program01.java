package com.sunbeam;

import java.util.Scanner;

public class Program01 {
	public static void division(int n, int d) {
		int result = n / d;
		System.out.println("Division = " + result);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			division(10, 0);
		} finally {
			// to release the resources
			System.out.println("Inside Finally");
			sc.close();
		}

		System.out.println("Program finished");

	}

}
