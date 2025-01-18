package com.sunbeam;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Program01 {

	public static void main(String[] args) throws ClassNotFoundException {

		// way 1 to get the object of Class for the given String class
		Class<?> c1 = Class.forName("java.lang.Integer");

		// way 2
		Class<?> c2 = String.class;

		String s = "sunbeam";
		// way 3
		Class<?> c3 = s.getClass();

		System.out.println("class name = " + c1.getName());
		System.out.println("super class name = " + c1.getSuperclass().getName());
		System.out.println("Interfaces ->");
		System.out.println(Arrays.toString(c1.getInterfaces()));

		System.out.println();
		System.out.println("Fields ->");
		Field[] fields = c3.getDeclaredFields();
		for (Field field : fields)
			System.out.println(field);

		System.out.println();
		System.out.println("Constructors ->");
		Constructor[] constructors = c1.getDeclaredConstructors();
		for (Constructor constructor : constructors)
			System.out.println(constructor);

		System.out.println();
		System.out.println("Methods ->");
		Method[] methods = c1.getDeclaredMethods();
		for (Method method : methods)
			System.out.println(method);

	}

}
