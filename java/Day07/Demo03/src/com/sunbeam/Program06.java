package com.sunbeam;

import java.util.Scanner;

public class Program06 {

	public static void division(int n, int d) {
		int result = n / d;
		System.out.println("Division = " + result);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int d;
		try {
			System.out.print("Enter numerator = ");
			n = sc.nextInt();
			System.out.print("Enter denominator = ");
			d = sc.nextInt();
			division(n, d);
		} catch (Exception e) // Generic Catch Block
		{
			e.printStackTrace();
		}
		System.out.println("Program Finished");
	}

}
