package com.sunbeam;

import java.util.Arrays;

public class MergeSortMain {
	
	public static void mergeSort(int arr[], int left, int right) {
		//0. stop if partitions is invalid or partition has single element
		if(left >= right)
			return;
		//1. divide array into two parts
		int mid = (left + right) / 2;
		//2. sort two partitions individually (by applying same merge sort algorithm)
		mergeSort(arr, left, mid);
		mergeSort(arr, mid + 1, right);
		
		
		//3. merge sorted partitions into one temporary array
		int size = right - left + 1;
		int temp[] = new int[size];
		int i = left , j = mid + 1, k = 0;
		while(i <= mid && j <= right) {
			// compare ith element with jth element
			if(arr[i] < arr[j]) {
				temp[k] = arr[i];
				k++;
				i++;
			}else {
				temp[k] = arr[j];
				k++;
				j++;
			}
		}
		// if left partition is finished then add remaining elements of right partition into temp array
		while(j <= right) {
			temp[k] = arr[j];
			k++;
			j++;
		}
		// if right partition is finished then add remaining elements of left partition into temp array
		while(i <= mid) {
			temp[k] = arr[i];
			k++;
			i++;
		}
		//4. overwrite temporary array into original array
		for( i = 0 ; i < size ; i++)
			arr[left + i] = temp[i];
	}

	public static void main(String[] args) {

		int arr[] = {6, 1, 9, 3, 7, 2, 8, 4, 5};
		
		System.out.println("Array before sort : " + Arrays.toString(arr));

		mergeSort(arr, 0, arr.length-1);
		
		System.out.println("Array after sort : " + Arrays.toString(arr));
	}

}



