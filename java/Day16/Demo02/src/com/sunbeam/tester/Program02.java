package com.sunbeam.tester;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import com.sunbeam.utils.Dbutil;

public class Program02 {

	public static void main(String[] args) {
		try (Connection connection = Dbutil.getConnection()) {
			String sql = "CALL sp_totalSalary(?)";
			try (CallableStatement callStmt = connection.prepareCall(sql)) {
				callStmt.registerOutParameter(1, Types.DOUBLE);
				callStmt.executeUpdate();
				double result = callStmt.getDouble(1);
				System.out.println("Total salary = " + result);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
