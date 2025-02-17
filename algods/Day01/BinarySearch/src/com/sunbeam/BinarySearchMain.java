package com.sunbeam;

import java.util.Scanner;

public class BinarySearchMain {
	
	public static int binarySearch(int arr[], int key) {
		int left = 0, right = arr.length-1, mid;
		while(left <= right) {
			//2. divide array into two parts (find middle element)
			mid = (left + right) / 2; 
			//3. compare middle element with key
			if(key == arr[mid])
				//3.1 if key is matching return index of it
				return mid;
			//4. if key is less than middle element then search it in left partition
			else if(key < arr[mid])
				right = mid - 1;
			//5. if key is greater than middle element then search it in right partition
			else 	// if(key > arr[mid])
				left = mid + 1;
		}//6. repeat step 2 to 5 untill key is found
		//7. if key is not found return -1
		return -1;
	}
	
	public static int binarySearch(int arr[], int key, int left, int right) {
		//1.1 stop if partition is invalid 
		if(left > right)
			//7. if key is not found return -1
			return -1;
		//2. divide array into two parts (find middle element)
		int mid = (left + right) / 2; 
		//3. compare middle element with key
		if(key == arr[mid])
			//3.1 if key is matching return index of it
			return mid;
		//4. if key is less than middle element then search it in left partition
		else if(key < arr[mid])
			return binarySearch(arr, key, left, mid - 1);
		//5. if key is greater than middle element then search it in right partition
		else 	// if(key > arr[mid])
			return binarySearch(arr, key, mid + 1, right);
	}
	

	public static void main(String[] args) {
		int arr[] = {11, 22, 33, 44, 55, 66, 77, 88, 99};
		
		Scanner sc = new Scanner(System.in);
		
		//1. take key from user
		System.out.print("Enter key to be searched : ");
		int key = sc.nextInt();

		//int index = binarySearch(arr, key);
		int index = binarySearch(arr, key, 0, arr.length-1);
		if(index == -1)
			System.out.println("Key is not found");
		else
			System.out.println("Key is found at index " + index);
		

		sc.close();
	}

}














