package com.sunbeam;

public class Date {
	int day;
	int month;
	int year;

	public Date() {
	}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (obj == null)
//			return false;
//		if (this == obj)
//			return true;
//		if (obj instanceof Date) {
//			Date d = (Date) obj;
//			return day == d.day && month == d.month && year == d.year;
//		}
//		return false;
//	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}

}
