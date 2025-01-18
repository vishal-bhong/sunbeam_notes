package com.sunbeam.p2;

import java.util.Scanner;

public class Person {
	private String name;

	public Person() {
	}

	public Person(String name) {
		this.name = name;
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name - ");
		name = sc.next();
	}

	public void display() {
		System.out.println("Name - " + name);
	}

}
