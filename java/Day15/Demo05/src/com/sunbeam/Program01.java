package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Program01 {

	public static void main(String[] args) {
		try (Connection connection = DbUtil.getConnection()) {
			double sal = 20000;
			String sql = "SELECT * FROM employee WHERE salary > ?";
			try (PreparedStatement selectStmt = connection.prepareStatement(sql)) {
				selectStmt.setDouble(1, sal);
				ResultSet rs = selectStmt.executeQuery();
				while (rs.next()) {
					System.out.println(rs.getInt(1) + "," + rs.getString(2) + "," + rs.getDouble(3));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
