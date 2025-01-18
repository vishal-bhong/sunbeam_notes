package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Program02 {

	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dac_db", "root", "root");
			Statement insertStmt = connection.createStatement();

			String sql = "INSERT INTO employee(name,salary) VALUES('Suresh',40000)";
			insertStmt.execute(sql);

			insertStmt.close();
			connection.close();
			System.out.println("Employee Inserted...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
