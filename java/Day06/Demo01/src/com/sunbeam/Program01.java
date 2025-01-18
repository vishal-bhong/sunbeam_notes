package com.sunbeam;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person p;
//		p = new Person();
//		p = new Employee();
		p = new Student();
		p.accept(sc);
		p.display();

		if (p instanceof Employee) {
			Employee e = (Employee) p;
			e.calculateTax();
		}

		if (p instanceof Student) {
			Student s = (Student) p;
			s.calculatePercentage();
		}
	}

}
