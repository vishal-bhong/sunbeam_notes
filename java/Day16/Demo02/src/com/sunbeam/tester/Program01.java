package com.sunbeam.tester;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import com.sunbeam.utils.Dbutil;

public class Program01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name - ");
		String name = sc.next();
		System.out.print("Enter the salary - ");
		double salary = sc.nextDouble();

		try (Connection connection = Dbutil.getConnection()) {
			String sql = "CALL sp_insertEmployee(?,?)";
			try (CallableStatement callStmt = connection.prepareCall(sql)) {
				callStmt.setString(1, name);
				callStmt.setDouble(2, salary);
				callStmt.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
