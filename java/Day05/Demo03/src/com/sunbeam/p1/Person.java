package com.sunbeam.p1;

import java.util.Scanner;

public class Person {
	private String name;

	public Person() {
		System.out.println("Person Parameterless Ctor");
	}

	public Person(String name) {
		System.out.println("Person Parameterized Ctor");
		this.name = name;
	}

	public void acceptPerson() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name - ");
		name = sc.next();
	}

	public void displayPerson() {
		System.out.println("Name - " + name);
	}
}
