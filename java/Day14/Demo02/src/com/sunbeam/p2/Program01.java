package com.sunbeam.p2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
	int empid;
	String name;
	double salary;

	public Employee(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	public Employee() {
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}

}

public class Program01 {

	public static void writeData(Employee e) {
		try (FileOutputStream fos = new FileOutputStream("employee2.db")) {
			try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
				oos.writeObject(e);
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public static void readData() {
		try (FileInputStream fis = new FileInputStream("employee2.db")) {
			try (ObjectInputStream ois = new ObjectInputStream(fis)) {
				Employee e = (Employee) ois.readObject();
				System.out.println(e);
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
		// Employee e = new Employee(1, "Anil", 10000);
		// writeData(e);
		readData();
	}

}
