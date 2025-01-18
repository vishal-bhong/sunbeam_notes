package com.sunbeam.p1;

import java.util.Scanner;

interface Acceptable {
	void accept(Scanner sc);
}

interface Displayable {
	void display();
}

class Employee implements Acceptable, Displayable {

	@Override
	public void accept(Scanner sc) {
	}

	@Override
	public void display() {

	}

}

class Time implements Acceptable {

	@Override
	public void accept(Scanner sc) {
	}
}

public class Program01 {

	public static void main(String[] args) {
		Time t1 = new Time();
	}

}
