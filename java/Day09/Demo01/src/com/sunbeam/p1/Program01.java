package com.sunbeam.p1;

import java.util.Date;

class Box {
	private Object obj;

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public Object getObj() {
		return obj;
	}
}

public class Program01 {

	public static void main(String[] args) {
		Box b1 = new Box();
		b1.setObj(new Integer(10));
		Integer i1 = (Integer) b1.getObj();
		System.out.println("i1 = " + i1);

		Box b2 = new Box();
		b2.setObj(new Date());
		Date d = (Date) b2.getObj();
		System.out.println(d);

		Box b3 = new Box();
		b3.setObj(new String("sunbeam"));
		Double d1 = (Double) b3.getObj(); // ClassCastException
		System.out.println("d1 = " + d1);

	}

}
