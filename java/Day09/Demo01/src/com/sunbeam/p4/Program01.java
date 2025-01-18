package com.sunbeam.p4;

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

	// unbounded types -> used for class reference
	public static void printBox(Box<?> b) {
		System.out.println(b.getObj());
	}

	public static void main(String[] args) {
		Box<Integer> b1 = new Box<>();
		b1.setObj(new Integer(10));
		printBox(b1);

		// Box<Integer> b = new Box<String>();

		Box<String> b2 = new Box<>();
		b2.setObj(new String("sunbeam"));
		printBox(b2);
	}

}
