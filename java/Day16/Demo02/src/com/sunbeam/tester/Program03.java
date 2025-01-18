package com.sunbeam.tester;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.sunbeam.utils.Dbutil;

public class Program03 {

	public static boolean doTransaction(double amount, int cid, int mid) throws SQLException {
		try (Connection connection = Dbutil.getConnection()) {
			connection.setAutoCommit(false); // Start Transaction
			String sql = "UPDATE accounts SET balance = balance + ? WHERE id = ?";
			try (PreparedStatement updateStmt = connection.prepareStatement(sql)) {
				// debit from the customer
				updateStmt.setDouble(1, -amount);
				updateStmt.setInt(2, cid);
				int c1 = updateStmt.executeUpdate();

				// credit to the merchant
				updateStmt.setDouble(1, amount);
				updateStmt.setInt(2, mid);
				int c2 = updateStmt.executeUpdate();

				if (c1 == 0 || c2 == 0) {
					connection.rollback();
					return false;
				} else
					connection.commit();
				return true;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the amount for the transaction - ");
		double amount = sc.nextDouble();
		System.out.print("Enter the customer id - ");
		int cid = sc.nextInt();
		System.out.print("Enter the merchant id - ");
		int mid = sc.nextInt();
		try {
			if (doTransaction(amount, cid, mid))
				System.out.println("Transation is successful");
			else
				System.out.println("Transation Failed");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
