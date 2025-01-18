package com.sunbeam.p3;

// Bounded type paramaters
class Box<T extends Number> {
	private T obj;

	public void setObj(T obj) {
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}
}

public class Program01 {

	public static void main(String[] args) {
		Box<Number> b1 = new Box<>();
		Box<Integer> b2 = new Box<>();
		Box<Double> b3 = new Box<>();
		Box<Short> b4 = new Box<>();
		// Box<String> b2 = new Box<>(); // NOT OK
		// Box<Date> b3 = new Box<>();// NOT OK
	}

}
