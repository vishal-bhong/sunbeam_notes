package com.sunbeam;

import java.util.Scanner;

public class Program06 {

	public static void delay(int ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		class MyThread extends Thread {
			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println("MyThread - " + i);
					delay(1000);
				}
			}
		}

		Thread t1 = new MyThread();

		class MyRunnable implements Runnable {
			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println("MyRunnable - " + i);
					delay(1000);
				}
			}
		}

		MyRunnable runnable = new MyRunnable();
		Thread t2 = new Thread(runnable);

		System.out.println("Before Start t1 state = " + t1.getState());

		// starting both the threads
		t1.start();
		t2.start();

		System.out.println("After Start t1 state = " + t1.getState());

		System.out.println("Press Enter - ");
		new Scanner(System.in).nextLine();

		System.out.println("In Between t1 state = " + t1.getState());

		for (int i = 1; i <= 10; i++) {
			System.out.println("Main - " + i);
			delay(1000);
		}

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("After Completion t1 state = " + t1.getState());

	}

}
