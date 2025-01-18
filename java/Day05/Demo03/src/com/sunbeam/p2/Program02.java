package com.sunbeam.p2;

class Super {

	public void m1() {
		System.out.println("Super::m1()");
	}
}

class Sub extends Super {
	@Override
	public void m1() {
		super.m1();
		System.out.println("Sub::m1()");
	}
}

public class Program02 {

	public static void main(String[] args) {
		Super s1 = new Super();
		s1.m1(); // Super::m1()

		Super s2 = new Sub();
		s2.m1(); // Sub::m1()

	}

}
