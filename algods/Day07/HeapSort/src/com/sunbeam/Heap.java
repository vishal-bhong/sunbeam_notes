package com.sunbeam;

public class Heap {
	private int SIZE;
	
	public Heap() {
		SIZE = 0;
	}
	
	public void addHeap(int arr[]) {
		//0. increament heap size by one
		SIZE++;
		//2.find correct position of newly added element,
			// by compairing with all ancestors one by one
		int ci = SIZE;
		int pi = ci / 2;
		while(pi >= 1) {
			//3. if parent is already greater than its child
			if(arr[pi] > arr[ci])
				break;
			//4. if parent is less than its child, then swap parent and child
			int temp = arr[pi];
			arr[pi] = arr[ci];
			arr[ci] = temp;
			//5. update parent and child index
			ci = pi;
			pi = ci / 2;
		}
	}
	
	public void deleteHeap(int arr[]) {
		//1. swap first and last element of the heap
		int max = arr[1];
		arr[1] = arr[SIZE];
		arr[SIZE] = max;
		//3. decrement size of heap by one
		SIZE--;
		//4. find correct position of element which is placed at root index
			// by compairing with all its descendents
		int pi = 1;
		int ci = pi * 2;
		while(ci <= SIZE) {
			//5. find index of max child
			if( (ci + 1) <= SIZE && arr[ci + 1] > arr[ci])
				ci = ci + 1;
			//6. if max child is already less than its parent, then stop
			if(arr[ci] < arr[pi])
				break;
			//7. if max child is greater than its parent, then swap parent and max child
			int temp = arr[pi];
			arr[pi] = arr[ci];
			arr[ci] = temp;
			//8. update parent and child indices
			pi = ci;
			ci = pi * 2;
		}		
	}
	
	public void heapSort(int arr[]) {
		//1. create heap by adding all the elements of array
		for(int i = 1 ; i < arr.length ; i++)
			addHeap(arr);
		//2. delete heap by deleting all the elements of array
		for(int i = 1 ; i < arr.length ; i++)
			deleteHeap(arr);
	}

}















