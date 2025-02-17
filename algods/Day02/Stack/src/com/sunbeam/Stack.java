package com.sunbeam;

public class Stack {
	private int arr[];
	private int top;
	private final int SIZE;
	public Stack(int size) {
		SIZE = size;
		arr = new int[SIZE];
		top = -1;
	}
	
	public void push(int value) {
		if(isFull())
			System.out.println("Stack is full");
		else {
			//1. reposition top
			top++;
			//2. add value at top index
			arr[top] = value;
			
			// arr[++top] = value;
		}
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		else {
			int temp = arr[top];
			//1. reposition top
			top--;
			return temp;
		}	
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		else {
			//1. read and return value of top index
			return arr[top];
		}
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == SIZE-1;
	}
}


















