package com.sunbeam.entities;

import java.sql.SQLException;
import java.util.concurrent.TimeoutException;

public class Time {
	int hr;
	int min;
	int sec;

	public void setHr(int hr) {
		if (hr < 0 || hr > 24)
			throw new RuntimeException("hrs should be between 0 to 24");
		this.hr = hr;
	}

	public void setMin(int min) throws Exception {
		if (min < 0 || min > 59)
			throw new Exception("min should be between 0 to 59");
		this.min = min;
	}

	public void setSec(int sec) throws SQLException {
		if (sec < 0 || sec > 59)
			throw new SQLException(new TimeoutException()); // Exception Chaining
		this.sec = sec;
	}

	@Override
	public String toString() {
		return "Time [hr=" + hr + ", min=" + min + "]";
	}

}
