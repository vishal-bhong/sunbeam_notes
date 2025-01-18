package com.sunbeam.p1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class Employee {
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
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}

}

public class Program01 {

	public static void writeData(Employee e) {
		try (FileOutputStream fos = new FileOutputStream("employee.db", true)) {
			try (DataOutputStream dos = new DataOutputStream(fos)) {
				dos.writeInt(e.empid);
				dos.writeUTF(e.name);
				dos.writeDouble(e.salary);
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public static void readData() {
		try (FileInputStream fis = new FileInputStream("employee.db")) {
			try (DataInputStream dis = new DataInputStream(fis)) {
				while (true) {
					int id = dis.readInt();
					String name = dis.readUTF();
					double sal = dis.readDouble();
					Employee e = new Employee(id, name, sal);
					System.out.println(e);
				}
			}
		} catch (EOFException e) {
			System.out.println("File Reading Complete...");
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
