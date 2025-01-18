package com.sunbeam.p1;

import java.util.Scanner;

// Employee is-a Person
public class Employee extends Person {
	private int empid;
	private double salary;

	public Employee() {
		System.out.println("Employee Parameterless Ctor");
	}

	public Employee(int empid, String name, double salary) {
		super(name);
		System.out.println("Employee Parameterized Ctor");
		this.empid = empid;
		this.salary = salary;
	}

	public void acceptEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the empid -  ");
		empid = sc.nextInt();
		acceptPerson();

		System.out.println("Enter the Salary -  ");
		salary = sc.nextDouble();
	}

	public void displayEmployee() {
		System.out.println("Empid - " + empid);
		displayPerson();
		System.out.println("Salary - " + salary);
	}

}
