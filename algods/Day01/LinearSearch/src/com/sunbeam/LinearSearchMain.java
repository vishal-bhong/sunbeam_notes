package com.sunbeam;

import java.util.Scanner;

public class LinearSearchMain {

	public static int linearSearch(int arr[], int key) {
		//2. traverse array from 0 to N-1 index
		for(int i = 0 ; i < arr.length ; i++) {
			//3. compare key with every element of array
			if(key == arr[i])
				//4. if key is found return true / i
				return i;
		}
		//5. if key is not found false / -1
		return -1;
	}
	
	
	public static void main(String[] args) {
		int arr[] = {88, 33, 66, 99, 11, 77, 22, 55, 14};
		
		Scanner sc = new Scanner(System.in);
		
		//1. take key from user
		System.out.print("Enter key to be searched : ");
		int key = sc.nextInt();
		
		int index = linearSearch(arr, key);
		if(index == -1)
			System.out.println("Key is not found");
		else
			System.out.println("Key is found at index " + index);
		
		sc.close();
		
	}

}











