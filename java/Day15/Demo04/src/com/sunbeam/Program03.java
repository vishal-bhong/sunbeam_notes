package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Program03 {

	public static void main(String[] args) {
		final String URL = "jdbc:mysql://localhost:3306/dac_db";
		final String USERNAME = "root";
		final String PASSWORD = "root";
		try (Connection connnection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
			try (Statement updateStmt = connnection.createStatement()) {
				String sql = "UPDATE employee SET salary = 50000 WHERE empid=3";
				updateStmt.execute(sql);
				System.out.println("Employee updated...");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
