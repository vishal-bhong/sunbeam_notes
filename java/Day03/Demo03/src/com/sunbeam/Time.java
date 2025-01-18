package com.sunbeam;

public class Time {

	int hr;
	int min;

	public void setHr(int hr) {
		this.hr = hr;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getHr() {
		return hr;
	}

	public int getMin() {
		return min;
	}

	public void display() {
		System.out.println("Time = " + hr + " : " + min);
	}

}
