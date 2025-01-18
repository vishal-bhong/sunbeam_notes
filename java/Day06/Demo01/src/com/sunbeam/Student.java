package com.sunbeam;

import java.util.Scanner;

public class Student extends Person {
	int rollno;
	double marks;

	@Override
	public void accept(Scanner sc) {
		System.out.print("Enter rollno - ");
		rollno = sc.nextInt();
		super.accept(sc);
		System.out.print("Enter marks - ");
		marks = sc.nextDouble();
	}

	@Override
	public void display() {
		System.out.println("Rollno -  " + rollno);
		super.display();
		System.out.println("Marks -  " + marks);
	}

	void calculatePercentage() {
		System.out.println("Percentage = " + ((marks / 150) * 100));
	}

}
