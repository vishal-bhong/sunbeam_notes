package com.sunbeam.p2;

class Outer {
	int n1;
	static int n2;

	class Inner {
		int n3;
		// static int n4; // NOT OK

		void m1() {
			System.out.println(n1);
			System.out.println(n2);
			System.out.println(n3);
		}

		// static void m2() {} // NOT OK
	}
}

public class Program01 {

	public static void main(String[] args) {
		Outer.Inner i1 = new Outer().new Inner();
	}

}
