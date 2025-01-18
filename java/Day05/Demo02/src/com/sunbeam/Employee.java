package com.sunbeam;

import java.util.Scanner;

// Employee has-a DateOfJoining
// Employee has-a Car 
public class Employee {
	private int empid;
	private String name;
	private double salary;
	private Date doj = new Date(); // OK -> Association(Composition)
	private Car car = null; // Association(Aggegration)

	{
		// doj = new Date(); // OK
	}

	public Employee() {
		// doj = new Date(); // OK
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public void acceptEmployee(Scanner sc) {
		System.out.print("Enter the empid - ");
		empid = sc.nextInt();

		System.out.print("Enter the name - ");
		name = sc.next();

		System.out.print("Enter the salary - ");
		salary = sc.nextDouble();

		System.out.println("Enter Date of Joining - ");
		doj.acceptDate(sc);

		if (car != null)
			car.acceptCar(sc);

	}

	public void displayEmployee() {
		System.out.println("Empid - " + empid);
		System.out.println("Name - " + name);
		System.out.println("Salary - " + salary);
		System.out.println("Date Of Joining - " + doj.displayDate());
		if (car != null)
			car.displayCar();
	}

}
