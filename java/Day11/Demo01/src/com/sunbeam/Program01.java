package com.sunbeam;

import java.util.Vector;

public class Program01 {

	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(10);
		v1.add(20);
		v1.addElement(30);
		v1.addElement(40);
		v1.addElement(50);
		v1.addElement(60);
		v1.addElement(70);
		v1.addElement(80);
		v1.addElement(90);
		v1.addElement(100);
		v1.addElement(110);

		System.out.println("Capacity - " + v1.capacity());
		System.out.println("Size - " + v1.size());

//		Enumeration<Integer> en = v1.elements();
//
//		while (en.hasMoreElements()) {
//			Integer i = en.nextElement();
//			System.out.println(i);
//		}

		System.out.println(v1);

	}

}
