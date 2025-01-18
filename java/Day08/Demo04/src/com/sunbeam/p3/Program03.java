package com.sunbeam.p3;

import java.util.StringTokenizer;

public class Program03 {

	public static void main(String[] args) {
		String s1 = "www.sunbeaminfo.com/placements";
		StringTokenizer str = new StringTokenizer(s1, "./", true);
		while (str.hasMoreTokens()) {
			String token = str.nextToken();
			System.out.println(token);
		}
	}

}
