package com.sunbeam.p3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Program01 {
	private static final String FILE_NAME = "employee3.db";

	public static void write(List<Employee> empList) {
		try (FileOutputStream fos = new FileOutputStream(FILE_NAME)) {
			try (BufferedOutputStream bos = new BufferedOutputStream(fos)) {
				try (ObjectOutputStream oos = new ObjectOutputStream(bos)) {
					oos.writeObject(empList);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void read() {
		try (FileInputStream fis = new FileInputStream(FILE_NAME)) {
			try (BufferedInputStream bis = new BufferedInputStream(fis)) {
				try (ObjectInputStream ois = new ObjectInputStream(bis)) {
					List<Employee> empList = (List<Employee>) ois.readObject();
					empList.forEach(System.out::println);
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1, "Anil", 10000));
		empList.add(new Employee(2, "Mukesh", 20000));
		empList.add(new Employee(3, "Ramesh", 30000));
		empList.add(new Employee(4, "Suresh", 40000));
		empList.add(new Employee(5, "Sham", 50000));

		// write(empList);

		read();
	}

}
