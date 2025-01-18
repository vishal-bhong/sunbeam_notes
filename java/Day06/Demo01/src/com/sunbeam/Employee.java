package com.sunbeam;

import java.util.Scanner;

public class Employee extends Person {
	int empid;
	double salary;

	@Override
	public void accept(Scanner sc) {
		System.out.print("Enter empid - ");
		empid = sc.nextInt();
		super.accept(sc);
		System.out.print("Enter salary - ");
		salary = sc.nextDouble();
	}

	@Override
	public void display() {
		System.out.println("Empid - " + empid);
		super.display();
		System.out.println("Salary - " + salary);
	}

	public void calculateTax() {
		System.out.println("Tax to be paid - " + (salary * 0.1));
	}

}
