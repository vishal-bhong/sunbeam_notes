package com.sunbeam.p1;

public class Program07 {

	public static void main(String[] args) {
		String s1 = "sunbeam";
		String s2 = "sun";
		String s3 = s2.concat("beam");

		System.out.println("s1 = " + s1);
		System.out.println("s3 = " + s3);
		System.out.println("s1 == s3 - " + (s1 == s3));
		System.out.println("s1.equals(s3) - " + (s1.equals(s3)));

	}

}
