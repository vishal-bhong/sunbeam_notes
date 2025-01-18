package com.sunbeam.p6;

class Box<T> {
	private T obj;

	public void setObj(T obj) {

		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}
}

public class Program01 {

	// unbounded types -> lower bound
	public static void printBox(Box<? super Integer> b) {
		System.out.println(b.getObj());
	}

	public static void main(String[] args) {
		Box<Integer> b1 = new Box<>();
		b1.setObj(new Integer(10));
		printBox(b1);
		
		Box<Number> b2 = new Box<>();
		b2.setObj(new Float(20.45));
		printBox(b2);
		
		Box<Double> b3 = new Box<>();
//		printBox(b3); // NOT OK

	}

}
