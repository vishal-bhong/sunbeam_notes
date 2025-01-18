package com.sunbeam;

import java.util.Set;
import java.util.TreeSet;

public class Program01 {

	public static void main(String[] args) {
		// Set<Employee> empSet = new HashSet<Employee>();
		// Set<Employee> empSet = new LinkedHashSet<Employee>();
		Set<Employee> empSet = new TreeSet<Employee>();
		empSet.add(new Employee(4, "Mukesh", 50000));
		empSet.add(new Employee(1, "Ramesh", 20000));
		empSet.add(new Employee(5, "Anil", 10000));
		empSet.add(new Employee(3, "Suresh", 40000));
		empSet.add(new Employee(2, "Ram", 30000));
		empSet.add(new Employee(2, "Ram", 30000));

		for (Employee employee : empSet) {
			System.out.println(employee);
		}

	}

}
