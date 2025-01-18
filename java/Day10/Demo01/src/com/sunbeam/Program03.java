package com.sunbeam;

import java.util.ArrayList;
import java.util.Collection;

public class Program03 {

	public static void main(String[] args) {
		Collection<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1, "Anil", 10000));
		empList.add(new Employee(2, "Mukesh", 20000));
		empList.add(new Employee(3, "Ramesh", 30000));
		empList.add(new Employee(4, "Suresh", 40000));
		empList.add(new Employee(5, "Ram", 50000));

		for (Employee e : empList)
			System.out.println(e);

		Employee e = new Employee(4);

		System.out.println("Employee found - " + empList.contains(e));
	}

}
