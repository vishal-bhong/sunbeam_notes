package com.sunbeam.p1;

import java.util.Scanner;

interface Showable {
	void display();
}

public class Time implements Acceptable {
	int hr;
	int min;

	@Override
	public void accept(Scanner sc) {
		System.out.println("Time :: accept");
	}

	@Override
	public String toString() {
		return "Time [hr=" + hr + ", min=" + min + "]";
	}

}
