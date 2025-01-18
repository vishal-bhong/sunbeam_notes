package com.sunbeam;

final class Super {
	final int n1 = 10;
	int n2 = 20;

	public void setN2(int n2) {
		this.n2 = n2;
	}

	final public void method1() {
		n2 = 30;
	}

	public void method2() {

	}

	public void method3() {

	}
}

class Sub extends Super {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		super.method1();
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		super.method2();
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		super.method3();
	}
}

public class Program02 {

	public static void main(String[] args) {
		final int num;
		num = 10;
		// num = 20; // NOT OK

	}

}
