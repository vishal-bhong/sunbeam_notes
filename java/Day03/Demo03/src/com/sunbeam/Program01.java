package com.sunbeam;

public class Program01 {

//	static void changeNum1(int num1) {
//		num1 = 20;
//	}

	static void changeNum1(Integer num1) {
		num1 = 20;
	}

	public static void main(String[] args) {
		// int num1 = 10;
		Integer num1 = new Integer(10);
		System.out.println("num1 before change = " + num1);
		changeNum1(num1); // changeNum1(10);
		System.out.println("num1 after change = " + num1);

		// int n1 = num1; // Auto-UnBoxing
		// num1 = 20; // Auto-Boxing

	}

}
