package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

public class Program04 {

	public static void main(String[] args) {
		Employee arr[] = new Employee[6];
		arr[0] = new Employee(4, "Ramesh", 10000);
		arr[1] = new Employee(1, "Anil", 50000);
		arr[2] = new Employee(5, "Mukesh", 30000);
		arr[3] = new Employee(2, "Suresh", 40000);
		arr[4] = new Employee(3, "Sham", 20000);
		arr[5] = new Employee(6, "Ram", 20000);

		System.out.println("Before Sorting ->");
		for (Employee employee : arr)
			System.out.println(employee);

		class EmpSalNameComparator implements Comparator<Employee> {
			@Override
			public int compare(Employee o1, Employee o2) {
				int diff = Double.compare(o1.salary, o2.salary);
				if (diff == 0)
					diff = o1.name.compareTo(o2.name);
				return diff;
			}
		}

		EmpSalNameComparator empsalNameComp = new EmpSalNameComparator();

		// Sorting based on employee salary and name
		Arrays.sort(arr, empsalNameComp);

		System.out.println("After Sorting ->");
		for (Employee employee : arr)
			System.out.println(employee);

	}

}
