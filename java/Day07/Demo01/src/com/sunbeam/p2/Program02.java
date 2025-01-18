package com.sunbeam.p2;

import java.util.Scanner;

public class Program02 {
	private static int menu(Scanner sc) {
		System.out.println("0. Exit");
		System.out.println("1. Area of Circle");
		System.out.println("2. Area of Rectangle");
		System.out.print("Enter your choice - ");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		Shape shape = null;
		while ((choice = menu(sc)) != 0) {
			switch (choice) {
			case 1:
				shape = new Circle();
				break;
			case 2:
				shape = new Rectangle();
				break;
			default:
				System.out.println("Wrong choice...");
				break;
			}
			if (shape != null) {
				shape.accept(sc);
				shape.calculateArea();
				shape = null;
			}
		}
	}

}
