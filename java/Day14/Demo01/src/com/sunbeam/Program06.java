package com.sunbeam;

import java.util.ArrayList;
import java.util.List;

class Employee implements Comparable<Employee> {
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

	@Override
	public int compareTo(Employee o) {
		return empid - o.empid;
	}

}

public class Program06 {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(4, "Mukesh", 50000));
		empList.add(new Employee(1, "Ramesh", 20000));
		empList.add(new Employee(5, "Suresh", 30000));
		empList.add(new Employee(3, "Anil", 40000));
		empList.add(new Employee(2, "Sham", 10000));

		System.out.println("Employees with sal > 30000 ->");
		empList.stream().filter(e -> e.salary > 30000).forEach(System.out::println);

		System.out.println("Employees sorted on names ->");
		empList.stream().sorted((e1, e2) -> e1.name.compareTo(e2.name)).forEach(System.out::println);

		System.out.println("Employees with sal <=40000, sorted on empid ->");
		empList.stream().filter(e -> e.salary <= 40000).sorted().forEach(System.out::println);
	}

}
