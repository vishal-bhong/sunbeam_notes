package com.sunbeam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program04 {

	public static void main(String[] args) {
		String s1 = "2024/11/2";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		try {
			Date d = sdf.parse(s1);
			System.out.println(d);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
