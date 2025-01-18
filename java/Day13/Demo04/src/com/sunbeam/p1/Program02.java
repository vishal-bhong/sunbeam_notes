package com.sunbeam.p1;

class Outer {
	int n1;
	static int n2;

	// Nested class
	static class Inner {
		int n3;
		static int n4;

		void m1() {
			Outer o1 = new Outer();
			System.out.println(o1.n1);
			// System.out.println(n1); // NOT OK
			System.out.println(n2);
			System.out.println(n3);
			System.out.println(n4);
		}

		static void m2() {
			Outer o1 = new Outer();
			System.out.println(o1.n1);
//			 System.out.println(n1);// NOT OK
			System.out.println(n2);
			// System.out.println(n3);// NOT OK
			System.out.println(n4);
		}
	}
}

class Time {
	int hr;
	int min;

	void f1() {
		System.out.println(hr);
		System.out.println(min);
	}

	static void f2() {
		Time t1 = new Time();
		System.out.println(t1.hr);
		System.out.println(t1.min);
	}
}

public class Program02 {

	public static void main(String[] args) {
		Outer.Inner i1 = new Outer.Inner();
	}

}
