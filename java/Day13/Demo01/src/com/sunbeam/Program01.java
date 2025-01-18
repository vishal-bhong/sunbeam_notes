package com.sunbeam;

import java.util.Scanner;

interface Shape {
	void accept(Scanner sc);

	void calculateArea();

	default void calculatePerimeter() {

	}

	static Shape shapeFactory(int choice) {
		switch (choice) {
		case 1:
			return new Circle();
		case 2:
			return new Rectangle();
		case 3:
			return new Square();
		}
		return null;
	}

}

class Circle implements Shape {
	int radius;

	@Override
	public void accept(Scanner sc) {
		System.out.print("Enter radius - ");
		radius = sc.nextInt();
	}

	@Override
	public void calculateArea() {
		System.out.println("Area of circle = " + 3.14 * radius * radius);
	}
}

class Square implements Shape {
	int side;

	@Override
	public void accept(Scanner sc) {
		System.out.print("Enter side - ");
		side = sc.nextInt();
	}

	@Override
	public void calculateArea() {
		System.out.println("Area of Square = " + side * side);
	}

	@Override
	public void calculatePerimeter() {
		System.out.println("Perimter of Square = " + 4 * side);
	}
}

class Rectangle implements Shape {
	int length;
	int breadth;

	@Override
	public void accept(Scanner sc) {
		System.out.print("Enter length - ");
		length = sc.nextInt();
		System.out.print("Enter breadth - ");
		breadth = sc.nextInt();
	}

	@Override
	public void calculateArea() {
		System.out.println("Area of Rectangle = " + length * breadth);
	}

	@Override
	public void calculatePerimeter() {
		System.out.println("Perimeter of Rectangle = " + 2 * (length + breadth));
	}
}

public class Program01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape s = Shape.shapeFactory(2);
		s.accept(sc);
		s.calculateArea();
		s.calculatePerimeter();

	}

}
