package com.sunbeam;

public class Employee implements Comparable<Employee> {
	int empid;
	String name;
	double salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empid) {
		this.empid = empid;
	}

	public Employee(int empid, String name, double salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empid == other.empid;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return this.empid - o.empid;
	};

}
