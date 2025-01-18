package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Program06 {

	public static void main(String[] args) {
		final String URL = "jdbc:mysql://localhost:3306/dac_db";
		final String USERNAME = "root";
		final String PASSWORD = "root";

		try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
			try (Statement selectStmt = connection.createStatement()) {

				System.out.println("Enter the salary - ");
				String sal = new Scanner(System.in).nextLine();

				String sql = "SELECT * FROM employee WHERE salary>" + sal;
				selectStmt.execute(sql);
				ResultSet rs = selectStmt.getResultSet();
				while (rs.next()) {
					int empid = rs.getInt(1);
					String name = rs.getString(2);
					double salary = rs.getDouble(3);
					System.out.println(empid + "," + name + "," + salary);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
