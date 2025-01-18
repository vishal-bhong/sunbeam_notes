package com.sunbeam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sunbeam.entities.Employee;
import com.sunbeam.utils.Dbutil;

public class EmployeeDao implements AutoCloseable {
	private Connection connection;

	public EmployeeDao() throws SQLException {
		connection = Dbutil.getConnection();
	}

	public void addEmployee(Employee e) throws SQLException {
		String sql = "INSERT INTO employee(name,salary) VALUES(?,?)";
		try (PreparedStatement insertStmt = connection.prepareStatement(sql)) {
			insertStmt.setString(1, e.getName());
			insertStmt.setDouble(2, e.getSalary());
			insertStmt.executeUpdate();
		}
	}

	public List<Employee> getAllEmployees() throws SQLException {
		List<Employee> empList = new ArrayList<Employee>();
		String sql = "SELECT * FROM employee";
		try (PreparedStatement selectStmt = connection.prepareStatement(sql)) {
			ResultSet rs = selectStmt.executeQuery();

			// while (rs.next())
			// empList.add(new Employee(rs.getInt(1), rs.getString(2), rs.getDouble(3)));

			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				double salary = rs.getDouble(3);
				Employee e = new Employee(id, name, salary);
				empList.add(e);
			}
		}
		return empList;
	}

	public int updateEmployee(int empid, double salary) throws SQLException {
		String sql = "UPDATE employee SET salary = ? WHERE empid = ?";
		try (PreparedStatement updateStmt = connection.prepareStatement(sql)) {
			updateStmt.setDouble(1, salary);
			updateStmt.setInt(2, empid);
			int count = updateStmt.executeUpdate();
			return count;
		}	
	}

	public void deleteEmployee(int empid) throws SQLException {
		String sql = "DELETE FROM employee WHERE empid = ?";
		try (PreparedStatement deleteStmt = connection.prepareStatement(sql)) {
			deleteStmt.setInt(1, empid);
			deleteStmt.executeUpdate();
		}

	}

	@Override
	public void close() throws SQLException {
		if (connection != null)
			connection.close();
	}

}
