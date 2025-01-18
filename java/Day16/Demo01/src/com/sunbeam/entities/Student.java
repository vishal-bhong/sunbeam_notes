package com.sunbeam.entities;

public class Student {
	int rollno;
	String name;
	String email;
	String password;
	double percent;

	public Student() {
	}

	public Student(int rollno, String name, String email, String password, double percent) {
		this.rollno = rollno;
		this.name = name;
		this.email = email;
		this.password = password;
		this.percent = percent;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getPercent() {
		return percent;
	}

	public void setPercent(double percent) {
		this.percent = percent;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", email=" + email + ", percent=" + percent + "]";
	}

}
