package com.sunbeam;

import java.util.Arrays;

public class QuickSortMain {
	
	public static void quickSort(int arr[], int left, int right) {
		//0. stop if partition is invalid or partition has single element
		if(left >= right)
			return;
		//1. select pivot/axis/reference element from array
		//int pivot = arr[left];
		//2. arrange smaller elements than pivot on left side it
		//3. arrange greater elements than pivot on right side it
		int i = left, j = right;
		while(i < j) {
			//3.1 find element greater than pivot from left side
			for( ; i <= right && arr[i] <= arr[left] ; i++);
			//3.2 find element less or equal than pivot from right side
			for( ; arr[j] > arr[left] ; j--);
			//3.3 if i and j are not crossed then swap ith and jth element
			if(i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		//3.4 swap pivot and jth element
		int temp = arr[j];
		arr[j] = arr[left];
		arr[left] = temp;
		//4. sort left and right partitions of pivot individually by same algorithm
		quickSort(arr, left, j-1);
		quickSort(arr, j+1, right);
	}

	public static void main(String[] args) {
		int arr[] = {66, 33, 99, 11, 77, 22, 55, 66, 88};
		
		System.out.println("Array before sort : " + Arrays.toString(arr));

		quickSort(arr, 0, arr.length-1);
		
		System.out.println("Array after sort : " + Arrays.toString(arr));

	}

}
