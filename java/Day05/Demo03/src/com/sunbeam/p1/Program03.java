package com.sunbeam.p1;

public class Program03 {

	public static void main(String[] args) {
		// Person *p = new Employee()
		Person p = new Employee(); // Upcasting
		// Person p = new Person();

		// p.acceptPerson();
		// p.displayPerson();

		Employee e = (Employee) p; // Downcasting
		e.acceptEmployee();
		e.displayEmployee();
	}

}
