package com.sunbeam.areacalculation.shapes;

import java.util.Scanner;

public class Rectangle {
	private int length;
	private int breadth;

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length - ");
		length = sc.nextInt();
		System.out.print("Enter breadth - ");
		breadth = sc.nextInt();
	}

	public void calculateArea() {
		System.out.println("Area of Rectangle = " + (length * breadth));
	}
}
