package com.sunbeam;

public class Program02 {

	static void changeTime(Time t1) // t1 = t1
	{
		t1.setHr(10);
		t1.setMin(20);
	}

	public static void main(String[] args) {
		Time t1 = new Time();

		System.out.println("Before Change");
		t1.display();

		changeTime(t1); // changeTime(200);

		System.out.println("After Change");
		t1.display();
	}

}
