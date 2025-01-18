package com.sunbeam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program04 {

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
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (InputMismatchException e) {
			e.printStackTrace();
//			System.out.println("input mismatch");
		}
		System.out.println("Program Finished");
	}

}
