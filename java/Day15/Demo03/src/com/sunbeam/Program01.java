package com.sunbeam;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Program01 {

	public static void main(String[] args) {
		try (FileReader reader = new FileReader("D:/Training/Courses/PG-AUG-24/DAC/JAVA/java/Day15/Day15_Help.MD")) {
			int ch;
			while ((ch = reader.read()) != -1) {
				System.out.print((char) ch);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
