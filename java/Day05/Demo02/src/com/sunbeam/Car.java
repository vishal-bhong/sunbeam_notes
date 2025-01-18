package com.sunbeam;

import java.util.Scanner;

public class Car {
	private String name;
	private String number;

	public Car() {
	}

	public Car(String name, String number) {
		this.name = name;
		this.number = number;
	}

	public void acceptCar(Scanner sc) {
		System.out.print("Enter the Vehicle company - ");
		name = sc.next();
		System.out.print("Enter the Vehicle number - ");
		number = sc.next();
	}

	public void displayCar() {
		System.out.println("Vehicle Company -  " + name);
		System.out.println("Vehicle Number -  " + number);
	}

}
