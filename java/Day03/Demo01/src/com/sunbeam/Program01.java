package com.sunbeam;

public class Program01 {

	public static void main(String[] args) {
		Time t1 = new Time();
		// Time t2 = t1;
		Time t2 = new Time();
		t2 = t1;

		t2.acceptTime();

		t1.displayTime();
		t2.displayTime();

	}

}
