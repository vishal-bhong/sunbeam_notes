package com.sunbeam;

import java.util.Arrays;

public class Program01 {

	public static void main(String[] args) {
		String[] arr = { "Suresh", "Anil", "Ramesh", "Mukesh" };
		System.out.println("Before sort - " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("After sort - " + Arrays.toString(arr));
	}

	public static void main1(String[] args) {
		int[] arr = { 50, 10, 30, 20, 40 };
		System.out.println("Before sort - " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("After sort - " + Arrays.toString(arr));
	}

}
