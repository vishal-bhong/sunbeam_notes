package com.sunbeam;

public class Program01 {
	public static void m1() {
		double num1;
		m1(); // StackOverFlowError
	}

	public static void main(String[] args) {
		m1();
		System.out.println("Program Finished");
	}

}
