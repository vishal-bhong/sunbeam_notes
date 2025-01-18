package com.sunbeam.p2;

import java.util.Scanner;

// Employee is-a Person
public class Employee extends Person {
	private int empid;
	private double salary;

	public Employee() {
	}

	public Employee(int empid, String name, double salary) {
		super(name); // parameterized ctor of super class is called
		this.empid = empid;
		this.salary = salary;
	}

	// Method Overriding
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the empid -  ");
		empid = sc.nextInt();

		super.accept(); // person class accept()

		System.out.println("Enter the Salary -  ");
		salary = sc.nextDouble();
	}

	// Method Overriding
	public void display() {
		System.out.println("Empid - " + empid);

		super.display();

		System.out.println("Salary - " + salary);
	}

}
