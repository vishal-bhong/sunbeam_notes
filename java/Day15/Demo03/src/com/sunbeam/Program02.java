package com.sunbeam;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Program02 {

	public static void main(String[] args) {
		// Java NIO
		Path p = Paths.get("D:/Training/Courses/PG-AUG-24/DAC/JAVA/java/Day15");
		System.out.println("File exists - " + Files.exists(p));

		// Java IO
		File file = new File("D:/Training/Courses/PG-AUG-24/DAC/JAVA/java/Day15");
		System.out.println("File exists - " + file.exists());
		System.out.println("Is it a directory - " + file.isDirectory());
		System.out.println("Is it a File - " + file.isFile());

	}

}
