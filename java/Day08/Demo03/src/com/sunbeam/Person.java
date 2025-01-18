package com.sunbeam;

public class Person implements Cloneable {
	String name;
	Date dob;

	public Person() {
		dob = new Date();
	}

	public Person(String name, int day, int month, int year) {
		this.name = name;
		this.dob = new Date(day, month, year);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", dob=" + dob + "]";
	}

	@Override
	protected Person clone() throws CloneNotSupportedException {
		// this-> p1;
		Person temp = new Person();
		temp.name = name;
		temp.dob.day = dob.day;
		temp.dob.month = dob.month;
		temp.dob.year = dob.year;
		return temp;
	}

}
