package com.sunbeam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program01 {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(5, "Mukesh", 40000));
		empList.add(new Employee(3, "Suresh", 20000));
		empList.add(new Employee(4, "Ramesh", 30000));
		empList.add(new Employee(1, "Anil", 50000));
		empList.add(new Employee(2, "Sham", 10000));

		// Local class
		class EmpIdComparator implements Comparator<Employee> {
			@Override
			public int compare(Employee o1, Employee o2) {
				int diff = o1.empid - o2.empid;
				return diff;
			}
		}

		// EmpIdComparator empIdComp = new EmpIdComparator();
		// empList.sort(empIdComp);

		// Comparator<Employee> empIdComp = new EmpIdComparator();
		// empList.sort(empIdComp);

		// empList.sort(new EmpIdComparator()); // Anonymous object

		// Anonymous Inner Class
		Comparator<Employee> empIdComp = new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				int diff = o1.empid - o2.empid;
				return diff;
			}
		};
		// empList.sort(empIdComp);

		// Anonymous Object of Anonymous Inner class
		empList.sort(new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				int diff = o1.empid - o2.empid;
				return diff;
			}
		});

		for (Employee employee : empList)
			System.out.println(employee);
	}

}
