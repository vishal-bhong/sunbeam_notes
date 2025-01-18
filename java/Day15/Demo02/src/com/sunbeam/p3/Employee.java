package com.sunbeam.p3;

import java.io.Serializable;

public class Employee implements Serializable {
	private static final long serialVersionUID = 2L;

	int empid;
	String name;
	double salary;
	transient String companyName = "Sunbeam";

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
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", companyName=" + companyName
				+ "]";
	}

}
