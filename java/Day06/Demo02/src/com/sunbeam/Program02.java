package com.sunbeam;

public class Program02 {
	public static void main(String[] args) {
		Date d1 = new Date(1, 1, 2000);
		// Date d2 = d1;
		Date d2 = new Date(1, 2, 2000);

		Date d3 = new Date(1, 1, 2000);

		if (d1.equals(d3))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");

	}

	public static void main1(String[] args) {
		Date d1 = new Date(1, 1, 2000);
		// Date d2 = d1; // Equal
		Date d2 = new Date(1, 1, 2000);
		if (d1 == d2) // NOT EQUAL
			System.out.println("Equal");
		else
			System.out.println("Not Equal");

	}

}
