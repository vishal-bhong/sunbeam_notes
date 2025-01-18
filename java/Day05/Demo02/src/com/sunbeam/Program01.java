package com.sunbeam;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Employee[] arr = new Employee[10];
		arr[0] = new Employee();

		Employee e2 = new Employee();
		e2.setCar(new Car()); // If employee has -a car
		e2.acceptEmployee(sc);
		e2.displayEmployee();

		sc.close();
	}

	public static void main1(String[] args) {
		Scanner sc = new Scanner(System.in);

		Employee e1 = new Employee();
		e1.acceptEmployee(sc);
		e1.displayEmployee();

		sc.close();
	}

}
