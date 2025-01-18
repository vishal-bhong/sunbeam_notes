package com.sunbeam;

public class Program05 {

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

		// System.out.println("t1 priority = " + t1.getPriority());
		// System.out.println("t2 priority = " + t1.getPriority());
		// System.out.println("main priority = " +
		// Thread.currentThread().getPriority());

		// set the priority for the threads
		t1.setPriority(1); // Highest Priority
		t2.setPriority(10); // Lowest Priority

		// starting both the threads
		t1.start();
		t2.start();

		for (int i = 1; i <= 10; i++) {
			System.out.println("Main - " + i);
			delay(1000);
		}
	}

}
