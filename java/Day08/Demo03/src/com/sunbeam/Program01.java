package com.sunbeam;

// reference copy
public class Program01 {

	public static void main(String[] args) {
		Person p1 = new Person("Anil", 1, 1, 2000);

		Person p2 = p1;

		System.out.println("P1 = " + p1);
		System.out.println("P2 = " + p2);

		p2.name = "Mukesh";
		p2.dob.day = 2;

		System.out.println("After change in p2 ->");
		System.out.println("P1 = " + p1);
		System.out.println("P2 = " + p2);

	}

}
