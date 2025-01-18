package com.sunbeam.p1;

import java.util.Scanner;

public class Employee implements Acceptable, Displayable {
	int empid;
	String name;
	double salary;

	@Override
	public void accept(Scanner sc) {
		System.out.println("Employee :: accept");
	}

	@Override
	public void display() {
		System.out.println("Employee :: display");
	}

}
