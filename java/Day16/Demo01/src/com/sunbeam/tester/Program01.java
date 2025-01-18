package com.sunbeam.tester;

import java.sql.SQLException;
import java.util.Scanner;

import com.sunbeam.dao.EmployeeDao;
import com.sunbeam.entities.Employee;

public class Program01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e = new Employee();
		e.accept(sc);
		try (EmployeeDao employeeDao = new EmployeeDao()) {
			employeeDao.addEmployee(e);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

	}

}
