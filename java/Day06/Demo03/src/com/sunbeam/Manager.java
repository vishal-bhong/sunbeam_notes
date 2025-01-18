package com.sunbeam;

import java.util.Scanner;

public class Manager extends Employee {
	double bonus;

	public Manager() {
	}

	public Manager(int empid, String name, double salary, double bonus) {
		super(empid, name, salary);
		this.bonus = bonus;
	}

	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.print("Enter the bonus - ");
		bonus = sc.nextDouble();
	}

	@Override
	public String toString() {
		return super.toString() + "Manager [bonus=" + bonus + "]";
	}

	// implementing the abstract method of the Employee class
	@Override
	public void calculateTotalSalary() {
		System.out.println("Total Salary = " + (salary + bonus));
	}

}
