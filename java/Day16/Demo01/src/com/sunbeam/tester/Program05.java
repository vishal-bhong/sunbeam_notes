package com.sunbeam.tester;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.sunbeam.dao.EmployeeDao;
import com.sunbeam.entities.Employee;

public class Program05 {
	public static int menu(Scanner sc) {
		System.out.println("0. EXIT");
		System.out.println("1. ADD Employee");
		System.out.println("2. Display All Employees");
		System.out.println("3. Update Employee");
		System.out.println("4. Delete Employee");
		System.out.print("Enter your choice - ");
		return sc.nextInt();
	}

	public static void addEmployee(Scanner sc) {
		Employee e = new Employee();
		e.accept(sc);
		try (EmployeeDao employeeDao = new EmployeeDao()) {
			employeeDao.addEmployee(e);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	public static void getAllEmployees() {
		try (EmployeeDao employeeDao = new EmployeeDao()) {
			List<Employee> empList = employeeDao.getAllEmployees();
			empList.forEach(System.out::println);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void updateEmployee(Scanner sc) {
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

	public static void deleteEmployee(Scanner sc) {
		System.out.print("Enter the empid to delete - ");
		int empid = sc.nextInt();
		try (EmployeeDao employeeDao = new EmployeeDao()) {
			employeeDao.deleteEmployee(empid);
			System.out.println("Employee deleted...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		while ((choice = menu(sc)) != 0) {
			switch (choice) {
			case 1:
				addEmployee(sc);
				break;
			case 2:
				getAllEmployees();
				break;
			case 3:
				updateEmployee(sc);
				break;
			case 4:
				deleteEmployee(sc);
				break;

			default:
				System.out.println("Wrong choice...");
				break;
			}
		}
	}

}
