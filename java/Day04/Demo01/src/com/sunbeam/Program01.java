package com.sunbeam;

public class Program01 {

	public static void main1(String[] args) {
		Student arr[] = new Student[5];

		for (Student s : arr)
			s = new Student();

		arr[0].displayStudent(); // NullPointerException

	}

	public static void main2(String[] args) {

		Student arr[] = new Student[5];
		arr[0] = new Student(1, "Anil", 50);
		arr[1] = new Student(2, "Mukesh", 55);
		arr[2] = new Student(3, "Ramesh", 60);
		arr[3] = new Student(4, "Suresh", 65);
		arr[4] = new Student();
		arr[4].acceptStudent();

		for (Student s : arr)
			s.displayStudent();

	}

	public static void main(String[] args) {
//		 int arr[] = new int[5];
//		 int[] arr = new int[5];
//		 int[] arr = new int[] { 10, 20, 30, 40, 50 };
		int[] arr = { 10, 20, 30, 40, 50 };
		
		for( int i : arr) {
			System.out.println(i);
		}
	}

}
