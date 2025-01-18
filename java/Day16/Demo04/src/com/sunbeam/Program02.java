package com.sunbeam;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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

	public static void main(String[] args)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		Class<?> c = Employee.class;
		System.out.println("Methods - >");
		Method[] methods = c.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method);
			Annotation[] annotations = method.getDeclaredAnnotations();
			for (Annotation annotation : annotations) {
				if (annotation instanceof DeveloperInfo) {
					DeveloperInfo d = (DeveloperInfo) annotation;
					if (d.name().equals("Anil"))
						method.invoke(c.newInstance());
				}
			}
		}
	}

}
