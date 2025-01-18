package com.sunbeam;

public class Program03 {

	public static void division(int n, int d) {
		int result = n / d;
		System.out.println("Division = " + result);
	}

	public static void main(String[] args) {
		try {
			division(10, 0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
//			 System.out.println("Division is not possible");
		}
		System.out.println("Program Finished");
	}

}
