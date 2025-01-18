package com.sunbeam.p1;

public class Program01 {
	public static void delay(int ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Account a = new Account(1000);

		class DepositThread extends Thread {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					delay(1000);
					synchronized (a) {
						a.deposit(100);
						System.out.println("After deposit =" + a.balance);
					}
				}
			}
		}

		class WithdrawThread extends Thread {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					delay(1000);
					synchronized (a) {
						a.withdraw(100);
						System.out.println("After withdraw =" + a.balance);
					}
				}
			}
		}

		DepositThread dt = new DepositThread();
		WithdrawThread wt = new WithdrawThread();

		dt.start();
		wt.start();

		try {
			dt.join();
			wt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Final Balance - " + a.balance);

	}

}
