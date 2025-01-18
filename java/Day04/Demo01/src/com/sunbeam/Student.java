package com.sunbeam;

import java.util.Scanner;

public class Student {
	private int rollno;
	private String name;
	private double marks;

	public Student() {
	}

	public Student(int rollno, String name, double marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public void acceptStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter rollno - ");
		rollno = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter name - ");
		name = sc.nextLine();
		System.out.print("Enter marks - ");
		marks = sc.nextDouble();
	}

	public void displayStudent() {
		System.out.println("Rollno - " + rollno);
		System.out.println("Name - " + name);
		System.out.println("Marks - " + marks);
	}

}
