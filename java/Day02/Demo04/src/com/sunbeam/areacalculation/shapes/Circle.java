package com.sunbeam.areacalculation.shapes;

import java.util.Scanner;

public class Circle {
	private int radius;

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius - ");
		radius = sc.nextInt();

	}

	public void calculateArea() {
		System.out.println("Area of Circle = " + (3.14 * radius * radius));
	}
}
