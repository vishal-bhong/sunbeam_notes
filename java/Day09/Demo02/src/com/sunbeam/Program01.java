package com.sunbeam;

public class Program01 {

//	public static void printArray(Object arr[]) {
//		for (Object e : arr)
//			System.out.println(e);
//	}

	// generic Method
	public static <T> void printArray(T arr[]) {
		for (T e : arr)
			System.out.println(e);
	}

	public static void main(String[] args) {
		Integer arr[] = { 10, 20, 30, 40, 50 };

		Double arr2[] = { 11.22, 22.33, 33.44, 44.55, 55.66 };
		// printArray(arr2); // OK -> Type is inferred
		Program01.<Double>printArray(arr2);

		String[] arr3 = { "Anil", "Mukesh", "Ramesh", "Suresh" };
		printArray(arr3);
		// Program01.<String>printArray(arr2); // OK
	}

}
