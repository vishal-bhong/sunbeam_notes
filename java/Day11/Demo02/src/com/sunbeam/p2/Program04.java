package com.sunbeam.p2;

import java.util.PriorityQueue;

public class Program04 {

	public static void main(String[] args) {
		PriorityQueue<Employee> q1 = new PriorityQueue<Employee>();
		q1.add(new Employee(4, "Anil", 10000));
		q1.add(new Employee(2, "Mukesh", 40000));
		q1.add(new Employee(1, "Ramesh", 20000));
		q1.add(new Employee(3, "Suresh", 30000));

		// System.out.println("Element at first = " + q1.peek());
		System.out.println("Removed element = " + q1.poll());
		System.out.println("Removed element = " + q1.poll());

	}

}
