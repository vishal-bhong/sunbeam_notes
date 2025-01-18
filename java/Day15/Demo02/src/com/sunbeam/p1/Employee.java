package com.sunbeam.p1;

import java.io.Serializable;

public class Employee implements Serializable {
	int empid;
	String name;
	double salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}

}
