package com.sunbeam;

public class Queue {
	private int arr[];
	private int front, rear;
	private final int SIZE;
	public Queue(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front = rear = -1;
	}

	public void push(int value) {
		//1. reposition rear
		rear++;
		//2. add value at rear index
		arr[rear] = value;
	}
	
	public int pop() {
		int temp = arr[front + 1];
		//1. reposition front
		front++;
		return temp;
	}
	
	public int peek() {
		//1. read and return data of front end
		return arr[front + 1];
	}
	
	public boolean isEmpty() {
		return front == rear;
	}
	
	public boolean isFull() {
		return rear == SIZE - 1;
	}
	
}












