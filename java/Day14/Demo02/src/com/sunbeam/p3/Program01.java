package com.sunbeam.p3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

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

	public static void writeData(List<Employee> empList) {
		try (FileOutputStream fos = new FileOutputStream("employee3.db")) {
			try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
				oos.writeObject(empList);
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public static void readData() {
		try (FileInputStream fis = new FileInputStream("employee3.db")) {
			try (ObjectInputStream ois = new ObjectInputStream(fis)) {
				List<Employee> empList = (List<Employee>) ois.readObject();
				empList.forEach(System.out::println);
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
//		List<Employee> empList = new ArrayList<Employee>();
//		empList.add(new Employee(1, "Anil", 10000));
//		empList.add(new Employee(2, "Mukesh", 20000));
//		empList.add(new Employee(3, "Ramesh", 30000));
//		empList.add(new Employee(4, "Suresh", 40000));
//		empList.add(new Employee(5, "Sham", 50000));
		// writeData(empList);
		readData();
	}

}
