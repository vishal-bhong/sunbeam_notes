package com.sunbeam;

public class Program01 {

	public static void main(String[] args) {
		// int *ptr = new int[5];
//		int arr[] = null; // NullPointerException
//		int arr[] = new int[-5]; // NegativeArraySizeException

		int arr[] = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		System.out.println("For loop ->");
		for (int i = 0; i < arr.length; i++)
			System.out.println("Element = " + arr[i]);

		System.out.println("For each ->");
		for (int element : arr) {
			System.out.println("Element = " + element);
		}

		// System.out.println(arr[6]); // ArrayIndexOutOfBoundsException

	}

}
