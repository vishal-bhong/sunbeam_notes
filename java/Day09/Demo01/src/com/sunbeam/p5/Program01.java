package com.sunbeam.p5;

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

	// unbounded types -> upper bound
	public static void printBox(Box<? extends Number> b) {
		System.out.println(b.getObj());
	}

	public static void main(String[] args) {
		Box<Integer> b1 = new Box<>();
		b1.setObj(new Integer(10));
		printBox(b1);

		Box<String> b2 = new Box<>();
		b2.setObj(new String("sunbeam"));
		printBox(b2); // NOT OK

		Box<Number> b3 = new Box<>();
		Box<Double> b4 = new Box<>();
		printBox(b3);
		printBox(b4);
	}

}
