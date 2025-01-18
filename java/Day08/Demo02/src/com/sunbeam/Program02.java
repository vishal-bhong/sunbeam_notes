package com.sunbeam;

import java.util.Calendar;

public class Program02 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println(c);

		// To change the date use set()
		c.set(Calendar.DAY_OF_MONTH, 10);

		// to get the individual field values use get()
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.MONTH) + 1);
		System.out.println(c.get(Calendar.YEAR));

	}

}
