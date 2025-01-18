package com.sunbeam;

public class Date {
	int day;
	int month;
	int year;

	public Date() {
		// TODO Auto-generated constructor stub
	}

	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

}
