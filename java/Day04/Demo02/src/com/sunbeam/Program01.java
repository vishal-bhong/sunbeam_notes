package com.sunbeam;

class Test {
	final int n1 = 10; // field initializer
	final int n2;
	final int n3;
	int n4;
	// object initializer
	{
		// n1 = 100; // NOT OK
		n2 = 20;
	}

	Test() {
		// n2 = 200; // NOT OK
		n3 = 30;
	}

	Test(int n3) {
		this.n3 = n3;
	}

	void display() // JAVA ->final Test this; // CPP ->Test * const this
	{
		Test t1 = new Test();
		// this = t1; // NOT OK
		// n3 = 30; // NOT OK
		n4 = 40;
	}
}

public class Program01 {

	public static void main(String[] args) {
		final int n1;
		// final int n1 = 10;
		n1 = 20;
		// n1 = 20; // NOT OK

		final Test t;
		t = new Test();

		// t = new Test(); // NOT OK

	}

}
