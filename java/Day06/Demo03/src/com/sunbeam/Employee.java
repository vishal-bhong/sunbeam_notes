package com.sunbeam;

import java.util.Scanner;

public abstract class Employee {
	int empid;
	String name;
	double salary;

	public Employee() {
	}

	public Employee(int empid, String name, double salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	public void accept(Scanner sc) {
		System.out.print("Enter empid - ");
		empid = sc.nextInt();

		System.out.print("Enter name - ");
		name = sc.next();

		System.out.print("Enter salary- ");
		salary = sc.nextDouble();
	}

	public abstract void calculateTotalSalary();

	public abstract void calculateTotalTax();

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}

}
