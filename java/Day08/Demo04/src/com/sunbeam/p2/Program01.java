package com.sunbeam.p2;

public class Program01 {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("sunbeam");
		StringBuilder sb2 = new StringBuilder("sunbeam");

		System.out.println("sb1 = " + sb1);
		System.out.println("sb2 = " + sb2);
		System.out.println("sb1 == sb2 - " + (sb1 == sb2));
		System.out.println("sb1.equals(sb2) - " + (sb1.equals(sb2)));
	}

}
