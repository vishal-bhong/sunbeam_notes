package com.sunbeam;

import java.util.Scanner;

public class Time {
	private int hr;
	private int min;

	public void acceptTime()// Time this
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the hr - ");
		this.hr = sc.nextInt();
		System.out.print("Enter the min -");
		min = sc.nextInt();
	}

	public void displayTime() // Time this
	{
		System.out.println("Time = " + hr + " : " + this.min);
	}
}
