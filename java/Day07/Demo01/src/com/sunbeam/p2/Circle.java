package com.sunbeam.p2;

import java.util.Scanner;

public class Circle implements Shape {

	int radius;

	@Override
	public void accept(Scanner sc) {
		System.out.print("Enter the radius - ");
		radius = sc.nextInt();
	}

	@Override
	public void calculateArea() {
		System.out.println("Area of circle = " + (radius * radius * 3.14));
	}

}
