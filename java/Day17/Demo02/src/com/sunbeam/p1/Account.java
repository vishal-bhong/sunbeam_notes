package com.sunbeam.p1;

public class Account {
	double balance;

	public Account() {
	}

	public Account(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		double newbalance = balance + amount;
		balance = newbalance;
	}

	public void withdraw(double amount) {
		double newbalance = balance - amount;
		balance = newbalance;
	}

}
