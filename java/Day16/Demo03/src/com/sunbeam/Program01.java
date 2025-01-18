package com.sunbeam;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.TYPE })
@interface MyAnnotation {
}

@MyAnnotation
class Test {

	@MyAnnotation
	int n1;

	@MyAnnotation
	public Test() {
	}

	@MyAnnotation
	public void m1() {

	}

}

public class Program01 {

	@Override // Marker Annotations
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@SuppressWarnings(value = "null") // Single value Annotation
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		int num1;

		String s1 = null;
		System.out.println(s1.indexOf('a'));
	}

}
