package p2;

import p1.Test;

class Derived extends Test {

	public void displayDerived() {
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);

	}
}

public class Program02 {

	public static void main(String[] args) {
		Test t1 = new Test();
		System.out.println(t1.n1);
		System.out.println(t1.n2);
		System.out.println(t1.n3);
		System.out.println(t1.n4);

	}

}
