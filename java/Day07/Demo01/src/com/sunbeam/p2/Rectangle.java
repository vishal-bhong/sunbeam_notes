package com.sunbeam.p2;

import java.util.Scanner;

public class Rectangle implements Shape {
	int length;
	int breadth;

	@Override
	public void accept(Scanner sc) {
		System.out.print("Enter the length - ");
		length = sc.nextInt();
		System.out.print("Enter the breadth - ");
		breadth = sc.nextInt();
	}

	@Override
	public void calculateArea() {
		System.out.println("Area of Rectangle = " + (length * breadth));
	}

}
