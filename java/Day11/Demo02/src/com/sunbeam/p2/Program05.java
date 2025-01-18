package com.sunbeam.p2;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Program05 {

	public static void main(String[] args) {

		class EmpSalComprator implements Comparator<Employee> {
			@Override
			public int compare(Employee o1, Employee o2) {
				return Double.compare(o2.salary, o1.salary);
			}
		}

		// PriorityQueue<Employee> q1 = new PriorityQueue<Employee>();
		PriorityQueue<Employee> q1 = new PriorityQueue<Employee>(new EmpSalComprator());

		q1.add(new Employee(4, "Anil", 10000));
		q1.add(new Employee(2, "Mukesh", 40000));
		q1.add(new Employee(1, "Ramesh", 20000));
		q1.add(new Employee(3, "Suresh", 30000));

		// System.out.println("Element at first = " + q1.peek());
		System.out.println("Removed element = " + q1.poll());
		System.out.println("Removed element = " + q1.poll());

	}

}
