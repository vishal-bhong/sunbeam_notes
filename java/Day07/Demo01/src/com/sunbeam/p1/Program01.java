package com.sunbeam.p1;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Acceptable a1 = new Employee(); // upcasting
//		Acceptable a1 = new Time();
		a1.accept(sc);

		// Displayable d1 = new Employee(); // OK
		// Displayable d1 = new Time(); // NOT OK

		// We can convert one type of reference into another type only if
		// the reference points at the common sub class object of both super
		// type reference
		if (a1 instanceof Employee) {
			Displayable d1 = (Displayable) a1; // Type Conversion(Not Downcasting)
			d1.display();
		}

		// Employee e1 = (Employee) a1; // Downcasting

	}

}
