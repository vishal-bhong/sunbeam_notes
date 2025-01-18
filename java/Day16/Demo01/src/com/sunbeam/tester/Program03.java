package com.sunbeam.tester;

import java.sql.SQLException;
import java.util.Scanner;

import com.sunbeam.dao.EmployeeDao;

public class Program03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the empid to update - ");
		int empid = sc.nextInt();
		System.out.print("Enter the updated salary - ");
		double salary = sc.nextDouble();

		try (EmployeeDao employeeDao = new EmployeeDao()) {
			int count = employeeDao.updateEmployee(empid, salary);
			if (count > 0)
				System.out.println("Employe updated successfully...");
			else
				System.out.println("Employe updated failed...");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
