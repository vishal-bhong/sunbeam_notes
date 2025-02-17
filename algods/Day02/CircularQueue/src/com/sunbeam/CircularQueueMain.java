package com.sunbeam;

import java.util.Scanner;

public class CircularQueueMain {

	public static void main(String[] args) {
		Queue q = new Queue(4);
		int choice;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("0. Exit\n1. Push\n2. Pop\n3. Peek");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				if(q.isFull())
					System.out.println("Queue is full");
				else {
					System.out.print("Enter data to be pushed : ");
					int data = sc.nextInt();
					q.push(data);
				}
				break;
			
			case 2:
				if(q.isEmpty())
					System.out.println("Queue is Empty");
				else
					System.out.println("Poped data : " + q.pop());
				break;
			
			case 3:
				if(q.isEmpty())
					System.out.println("Queue is Empty");
				else
					System.out.println("Peeked data : " + q.peek());
				break;
			}
			
		}while(choice != 0);
		
		
		sc.close();
	}

}
