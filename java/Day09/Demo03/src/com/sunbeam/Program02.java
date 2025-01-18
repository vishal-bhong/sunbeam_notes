package com.sunbeam;

import java.util.Arrays;

public class Program02 {

	public static void main(String[] args) {
		Employee arr[] = new Employee[5];
		arr[0] = new Employee(4, "Ramesh", 10000);
		arr[1] = new Employee(1, "Anil", 50000);
		arr[2] = new Employee(5, "Mukesh", 30000);
		arr[3] = new Employee(2, "Suresh", 40000);
		arr[4] = new Employee(3, "Sham", 20000);

		System.out.println("Before Sorting ->");
		for (Employee employee : arr)
			System.out.println(employee);

		// Sorting based on natural ordering of the elements
		Arrays.sort(arr);

		System.out.println("After Sorting ->");
		for (Employee employee : arr)
			System.out.println(employee);

	}

}
