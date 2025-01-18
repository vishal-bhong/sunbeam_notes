package com.sunbeam.p2;

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

	public static void main(String[] args) {
		Box<Integer> b1 = new Box<Integer>();
		Box<Integer> b2 = new Box<>(); // type inference
		Box<Integer> b3 = new Box();
		Box b4 = new Box(); // OK but avoid it (raw type)
		// b4.setObj(new Double(10));
		// Box<int> b5 = new Box<>(); // NOT OK

	}

	public static void main1(String[] args) {
		Box<Integer> b1 = new Box<Integer>();
		b1.setObj(new Integer(10));
		Integer i1 = b1.getObj();
		System.out.println("i1 = " + i1);

		Box<String> b2 = new Box<String>();
		b2.setObj(new String("sunbeam"));
		String s1 = b2.getObj();
		System.out.println("s1 = " + s1);

		Box<Double> b3 = new Box<Double>();
		// types are checked at compile time (type safety)
		// b3.setObj(new String("Infotech")); // NOT OK
		b3.setObj(new Double(10.12));
		Double d1 = b3.getObj();
		System.out.println("d1 = " + d1);
	}

}
