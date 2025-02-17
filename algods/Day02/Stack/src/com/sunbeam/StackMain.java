package com.sunbeam;

import java.util.Scanner;

public class StackMain {

	public static void main(String[] args) {
		
		Stack st = new Stack(4);
		int choice;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("0. exit\n1. push\n2. pop\n3. peek");
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter data to be inserted : ");
				int data = sc.nextInt();
				st.push(data);
				break;
				
			case 2:
				int ret = st.pop();
				System.out.println("Poped data : " + ret);
				break;
				
			case 3:
				ret = st.peek();
				System.out.println("Peeked data : " + ret);
				break;
			}
			
		}while(choice != 0);
		
		sc.close();
	}

}








