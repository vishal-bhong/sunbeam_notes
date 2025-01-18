package com.sunbeam;

import java.util.Scanner;

public class Person {
	String name;

	public void accept(Scanner sc) {
		System.out.print("Enter the name - ");
		name = sc.next();
	}

	public void display() {
		System.out.println("Name - " + name);
	}
}
