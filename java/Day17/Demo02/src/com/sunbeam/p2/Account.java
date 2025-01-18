package com.sunbeam.p2;

public class Account {
	double balance;

	public Account() {
	}

	public Account(double balance) {
		this.balance = balance;
	}

	public synchronized void deposit(double amount) {
		double newbalance = balance + amount;
		balance = newbalance;
	}

	public synchronized void withdraw(double amount) {
		double newbalance = balance - amount;
		balance = newbalance;
	}

}
