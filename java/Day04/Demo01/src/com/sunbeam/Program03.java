package com.sunbeam;

public class Program03 {

	public static void main1(String[] args) {
		// Ragged Array
		Student[][] arr = new Student[2][];
		arr[0] = new Student[3];
		arr[1] = new Student[5];

		// To-Do
		// Create the Student Objects in the above Ragged Array
		// use the parameterized ctor
		// Display the student details

	}

	public static void main(String[] args) {
		Student[][] arr = new Student[2][3];
		arr[0][0] = new Student(1, "Anil", 50);
		arr[0][1] = new Student(2, "Mukesh", 55);
		arr[0][2] = new Student(3, "Ramesh", 60);
		arr[1][0] = new Student(4, "Suresh", 65);
		arr[1][1] = new Student(5, "Ram", 70);
		arr[1][2] = new Student();
		arr[1][2].acceptStudent();

		for (Student[] ele : arr)
			for (Student e : ele)
				e.displayStudent();

	}

}
