package com.sunbeam;

public class Program01 {

	public static void main(String[] args) {
		Date d1 = new Date();
		d1.display();

		Date d2 = new Date();
		d2.display();

		Date d3 = new Date(2, 2, 2002);
		d3.display();

		d3.setDay(3);
		System.out.println("d3 day = " + d3.getDay());
	}

}
