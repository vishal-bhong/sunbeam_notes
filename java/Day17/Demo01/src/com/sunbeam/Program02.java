package com.sunbeam;

public class Program02 {

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
		t1.start();

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
		t2.start();

		for (int i = 1; i <= 10; i++) {
			System.out.println("Main - " + i);
			delay(1000);
		}
	}

}
