package com.sunbeam;

interface Printable {
	default void display() {
		System.out.println("Printable::display");
	}
}

interface Displayable {
	default void display() {
		System.out.println("Displayable::display");
	}
}

class Test implements Printable, Displayable {
	@Override
	public void display() {
		Printable.super.display();
		Displayable.super.display();
		System.out.println("Test::display");
	}
}

public class Program02 {

	public static void main(String[] args) {
//		Printable p = new Test();
//		p.display();
		Displayable d = new Test();
		d.display();
	}

}
