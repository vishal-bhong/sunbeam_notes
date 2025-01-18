package com.sunbeam;

class Constants {
	public static final double SAVINGS_ROI = 3.5;
	public static final double CURRECT_ROI = 1.5;
	public static final String BASE_URL = "www.sunbeam.com";
	public static boolean LOGIN_STATUS = false;
}

public class Program02 {

	public static void main(String[] args) {

		Constants.LOGIN_STATUS = true;

		if (Constants.LOGIN_STATUS) {
			System.out.println(Constants.BASE_URL);
		}

	}

}
