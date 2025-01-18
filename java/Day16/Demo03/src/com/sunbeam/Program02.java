package com.sunbeam;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.METHOD })
@interface DeveloperInfo {
	String name();

	String designation();
}

@DeveloperInfo(name = "Anil", designation = "TeamLead") // multi value annotations
class Employee {

	int empid;
	String name;
	double salary;

	@DeveloperInfo(name = "Anil", designation = "Teamlead")
	public void accept() {
		System.out.println("Employee::Accept");
	}

	@DeveloperInfo(name = "Mukesh", designation = "JrDeveloper")
	public void display() {
		System.out.println("Employee::Display");
	}

}

public class Program02 {

	public static void main(String[] args) {

	}

}
