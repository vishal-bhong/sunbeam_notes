package com.sunbeam.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.sunbeam.entities.Student;
import com.sunbeam.utils.Dbutil;

public class StudentDao implements AutoCloseable {
	private Connection connection;

	public StudentDao() throws SQLException {
		connection = Dbutil.getConnection();
	}

	public void addStudent(Student s) {

	}

	public List<Student> getAllStudents() {

		return null;
	}

	public List<Student> getDistinctionStudents() {
		// percent > 70;
		return null;
	}

	public void updateStudent(int rollno, double percent) {

	}

	// optional functunality to implement
	public void changePassword(String email, String oldpassword, String newPassword) {

	}

	public void deleteStudent(Student s) {

	}

	@Override
	public void close() throws SQLException {
		if (connection != null)
			connection.close();

	}
}
