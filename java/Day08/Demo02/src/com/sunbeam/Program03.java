package com.sunbeam;

import java.time.LocalDate;

public class Program03 {

	public static void main(String[] args) {
		LocalDate l1 = LocalDate.now();
		System.out.println(l1);

		LocalDate l2 = LocalDate.of(2024, 10, 2);
		System.out.println(l2);
	}

}
