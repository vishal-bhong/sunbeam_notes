package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Program04 {

	public static void main(String[] args) {
		final String URL = "jdbc:mysql://localhost:3306/dac_db";
		final String USERNAME = "root";
		final String PASSWORD = "root";
		try (Connection connnection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
			try (Statement deleteStmt = connnection.createStatement()) {
				String sql = "DELETE FROM employee WHERE empid=3";
				deleteStmt.execute(sql);
				System.out.println("Employee deleted...");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
