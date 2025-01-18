package com.sunbeam;

public class Test {
	int n1 = 10; // field initializers
	int n2;

	// object Initializer
	{
		n1 = 50;

		System.out.println("Object Initializer - 1 ");
	}

	// Object Initializer
	{
		n1 = 60;
		System.out.println("Object Initializer - 2 ");
	}

	public Test() {
		System.out.println("Inside Ctor");
		// n1 = 100;
		n2 = 20;
	}

	void display() {
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);
	}
}
