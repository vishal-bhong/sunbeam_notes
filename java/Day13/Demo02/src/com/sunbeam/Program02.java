package com.sunbeam;

import java.util.ArrayList;
import java.util.List;

public class Program02 {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(5, "Mukesh", 40000));
		empList.add(new Employee(3, "Suresh", 20000));
		empList.add(new Employee(4, "Ramesh", 30000));
		empList.add(new Employee(1, "Anil", 50000));
		empList.add(new Employee(2, "Sham", 10000));

//		empList.sort(new Comparator<Employee>() {
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				int diff = o1.empid - o2.empid;
//				return diff;
//			}
//		});

//		empList.sort((Employee o1, Employee o2) {
//				int diff = o1.empid - o2.empid;
//				return diff;
//		});

		// -> lamda Operator
		// multi-liner lamda expression
//		empList.sort((o1, o2) -> {
//			int diff = o1.empid - o2.empid;
//			return diff;
//		});

		// Lamda Expressions
		// A short-hand implementation of Functional Interface is Lambda Expression
		// sorting based on empid
		// empList.sort((o1, o2) -> o1.empid - o2.empid);

		// sorting based on salary
		// empList.sort((o1, o2) -> Double.compare(o1.salary, o2.salary));

		// sorting based on name
		empList.sort((o1, o2) -> o1.name.compareTo(o2.name));

//		for (Employee employee : empList)
//			System.out.println(employee);

//		empList.forEach(new Consumer<Employee>() {
//			@Override
//			public void accept(Employee t) {
//				System.out.println(t);
//			}
//		});

		// empList.forEach((e) -> System.out.println(e));
//		empList.forEach(e -> System.out.println(e));
		empList.forEach(System.out::println); // Method Reference
	}

}
