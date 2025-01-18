package com.sunbeam;

public class Program02 {

	public static void main(String[] args) {
		// Ragged Array
		int[][] arr = new int[2][];
		arr[0] = new int[2];	// if not mentioned NullPointerException
		arr[1] = new int[3];

		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[1][0] = 30;
		arr[1][1] = 40;
		arr[1][2] = 50;

//		for (int r = 0; r < arr.length; r++)
//			for (int c = 0; c < arr[r].length; c++)
//				System.out.println("Element = " + arr[r][c]);

		for (int[] ele : arr)
			for (int e : ele)
				System.out.println("Element = " + e);
	}

	public static void main1(String[] args) {
		int[][] arr = new int[2][3];
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;

//		for (int r = 0; r < arr.length; r++)// Outer array
//			for (int c = 0; c < arr[r].length; c++) // Inner Array
//				System.out.println("Element = " + arr[r][c]);

		for (int[] ele : arr) // outer array
			for (int e : ele) // Inner Array
				System.out.println("Element = " + e);
	}

}
