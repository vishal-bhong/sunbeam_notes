package com.sunbeam;

class Test {
	int n1;
//	static int n2 = 1000; // field initializer
	static int n2;

	// static block
	static {
		System.out.println("Inside static block - ");
		n2 = 2000;
	}

	public Test() {
		System.out.println("Inside ctor ");
		n1 = 10;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public static void setN2(int n2) {
		Test.n2 = n2;
	}

	void display() {
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);
	}
}

public class Program01 {

	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		t2.setN1(20);

		// t2.setN2(3000); // NOT Recommended
		Test.setN2(3000);

		t1.display();
		t2.display();
	}

}
