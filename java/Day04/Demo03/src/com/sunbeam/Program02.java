package com.sunbeam;

class BankAccount {
	private final int accno;
	private String name;
	private double balance;
	// private static int generate_accno = 1000;

	private static int generate_accno;
	// static block
	static {
		generate_accno = 1000;
	}

	// Object Initializer
	{
		accno = ++generate_accno;
	}

	public BankAccount() {

	}

	public BankAccount(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}

	public BankAccount(String name) {
		this.name = name;
	}

	public void displayAccountDetails() {
		System.out.println("Accno - " + accno);
		System.out.println("Name - " + name);
		System.out.println("Balance - " + balance);
	}

}

public class Program02 {

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();
		b1.displayAccountDetails();

		BankAccount b2 = new BankAccount("Anil");
		b2.displayAccountDetails();

		BankAccount b3 = new BankAccount("Mukesh", 10000);
		b3.displayAccountDetails();
	}

}
