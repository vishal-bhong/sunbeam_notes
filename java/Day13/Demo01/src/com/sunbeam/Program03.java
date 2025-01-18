package com.sunbeam;

interface I1 {
	default void m1() {
		System.out.println("I1::m1");
	}
}

class Super {
	public void m1() {
		System.out.println("Super::m1");
	}
}

// superclass wins super interface fails
class MyTest extends Super implements I1 {

}

public class Program03 {
	public static void main(String[] args) {
		I1 i = new MyTest();
		i.m1();

	}

}
