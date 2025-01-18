package com.sunbeam;

public class Program04 {

	// Variable Arity/Argument Method
	static void add(int... arr) {
		int result = 0;
		for (int e : arr)
			result += e;
		System.out.println("Addition = " + result);
	}

	public static void main2(String[] args) {
		add(10, 20);
		add(10, 20, 30);
		add(10, 20, 30, 40);
	}

	public static void mai1(String[] args) {
		add(new int[] { 10, 20 });
		add(new int[] { 10, 20, 30 });
		add(new int[] { 10, 20, 30, 40 });

	}

	public static void main(String[] args) {
		int[] arr = { 10, 20 };
		add(arr);
		arr = new int[] { 10, 20, 30 };
		add(arr);
		arr = new int[] { 10, 20, 30, 40 };
		add(arr);
	}

}
