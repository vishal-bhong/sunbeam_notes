package com.sunbeam.tester;

import java.sql.SQLException;
import java.util.Scanner;

import com.sunbeam.dao.EmployeeDao;

public class Program04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the empid to delete - ");
		int empid = sc.nextInt();

		try (EmployeeDao employeeDao = new EmployeeDao()) {
			employeeDao.deleteEmployee(empid);
			System.out.println("Employee deleted...");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
