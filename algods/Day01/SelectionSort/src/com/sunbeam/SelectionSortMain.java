package com.sunbeam;

import java.util.Arrays;

public class SelectionSortMain {
	
	public static void selectionSort(int arr[], int N) {
		//1. select one position (index) of array
		for(int i = 0 ; i < N-1 ; i++) {
			//2. compare selected position element with all other elements one by one
			for(int j = i + 1 ; j < N ; j++) {
				//3. if selected position element is greater than other element
				if(arr[i] > arr[j]) {
					//3.1 swap both the elements
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}//4. repeat above steps till array is not sorted 
	}

	public static void main(String[] args) {
		int arr[] = {44, 11, 55, 22, 66, 33};

		System.out.println("Array before sort : " + Arrays.toString(arr));
		
		selectionSort(arr, arr.length);
		
		System.out.println("Array after sort : " + Arrays.toString(arr));
	}

}
