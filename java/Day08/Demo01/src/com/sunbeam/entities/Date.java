package com.sunbeam.entities;

import com.sunbeam.exceptions.InvalidDateException;
import com.sunbeam.exceptions.InvalidYearException;

public class Date {
	int day;
	int month;
	int years;

	public void setDay(int day) {
		if (day < 1 || day > 31)
			throw new InvalidDateException("day should be between 1 to 31");
		this.day = day;
	}

	public void setMonth(int month) {
		if (month < 1 || month > 12)
			throw new InvalidDateException();
		this.month = month;
	}

	public void setYears(int years) throws InvalidYearException {
		if (years < 1900)
			// throw new InvalidYearException();
			throw new InvalidYearException("year should be > 1900");
		this.years = years;
	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", years=" + years + "]";
	}

}
