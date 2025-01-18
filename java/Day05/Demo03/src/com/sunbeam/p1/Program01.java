package com.sunbeam.p1;

public class Program01 {

	public static void main(String[] args) {
		Person p = new Person();
		p.acceptPerson();
		p.displayPerson();

		Employee e = new Employee();
		// e.acceptPerson();
		// e.displayPerson();
		e.acceptEmployee();
		e.displayEmployee();
	}

}
