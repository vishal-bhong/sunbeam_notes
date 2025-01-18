package com.sunbeam;

// Functional Interface
@FunctionalInterface
interface Acceptable {
	void accept(); // Single Abstract Method
}

@FunctionalInterface
interface I2 {
	void m1(); // SAM

	default void m2() {

	}
}

@FunctionalInterface
interface I3 {
	void m1();

	static void m2() {

	}
}

public class Program04 {
	public static void main(String[] args) {

	}

}
