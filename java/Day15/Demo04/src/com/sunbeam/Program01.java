package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Program01 {

	public static void main(String[] args) {

		// load the mysql driver
		// optional to load the driver From spec 4
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}

		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dac_db", "root", "root");
			System.out.println("Connection successful");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
