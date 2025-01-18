package com.sunbeam;

public class Employee implements Comparable<Employee> {
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

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}

	// for sorting on empid;
	// natural ordering of the elements
	@Override
	public int compareTo(Employee o) {
		return this.empid - o.empid;
	}

	// for sorting on name;
//	@Override
//	public int compareTo(Employee o) {
//		return name.compareTo(o.name);
//	}

	// for sorting on salary
//	@Override
//	public int compareTo(Employee o) {
//		return Double.compare(this.salary, o.salary);
//	}

}
