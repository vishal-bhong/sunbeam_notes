package com.sunbeam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program05 {

	public static void main(String[] args) {
		List<Employee> l1 = new ArrayList<Employee>();
		l1.add(new Employee(4, "Mukesh", 50000));
		l1.add(new Employee(2, "Anil", 10000));
		l1.add(new Employee(5, "Suresh", 20000));
		l1.add(new Employee(1, "Sham", 40000));
		l1.add(new Employee(3, "Ramesh", 30000));

		System.out.println("Before - ");
		System.out.println("using for-each ->");
		for (Employee e : l1)
			System.out.println(e);

		class EmpNameComparator implements Comparator<Employee> {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.name.compareTo(o2.name);
			}
		}

		l1.sort(new EmpNameComparator());

		System.out.println("After - ");

		// index based for-loop
		System.out.println("using for-loop with index ->");
		for (int i = 0; i < l1.size(); i++) {
			System.out.println(l1.get(i));
		}

	}
}
