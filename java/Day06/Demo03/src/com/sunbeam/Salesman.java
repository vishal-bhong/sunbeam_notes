package com.sunbeam;

import java.util.Scanner;

public class Salesman extends Employee {
	int noOfSales;
	double comission;

	public Salesman() {
	}

	public Salesman(int empid, String name, double salary, int noOfSales, double comission) {
		super(empid, name, salary);
		this.noOfSales = noOfSales;
		this.comission = comission;
	}

	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.print("Enter total sales - ");
		noOfSales = sc.nextInt();
		System.out.print("Enter commission per sale - ");
		comission = sc.nextDouble();
	}

	@Override
	public String toString() {
		return super.toString() + "Salesman [noOfSales=" + noOfSales + ", comission=" + comission + "]";
	}

	@Override
	public void calculateTotalSalary() {
		System.out.println("Total Salary = " + (salary + noOfSales * comission));
	}

}
