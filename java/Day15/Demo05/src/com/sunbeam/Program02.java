package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Program02 {

	public static void addData() throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name - ");
		String name = sc.next();
		System.out.print("Enter salary - ");
		double sal = sc.nextDouble();

		try (Connection connection = DbUtil.getConnection()) {
			String sql = "INSERT INTO employee(name,salary) VALUES(?,?)";
			try (PreparedStatement insertStmt = connection.prepareStatement(sql)) {
				insertStmt.setString(1, name);
				insertStmt.setDouble(2, sal);
				insertStmt.executeUpdate();
				System.out.println("Employee added...");
			}
		}
	}

	public static void main(String[] args) {
		try {
			addData();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
