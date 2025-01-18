package com.sunbeam;

enum ArithmeticOperations {
	EXIT, ADD, SUB, MUL, DIV
}

enum AccountType {
	SAV(3.5), CUR(1.2), DMAT(0);

	private double roi;

	private AccountType(double roi) {
		this.roi = roi;
	}

	public double getRoi() {
		return roi;
	}

}

enum AccountType2 {
	SAV(3.5) {
		@Override
		public String toString() {
			return "Savings";
		}
	},
	CUR(1.2) {
		@Override
		public String toString() {
			return "Current";
		}
	},
	DMAT(0) {
		@Override
		public String toString() {
			return "D-MAT";
		}
	};

	private double roi;

	private AccountType2(double roi) {
		this.roi = roi;
	}

	public double getRoi() {
		return roi;
	}
}

public class Program01 {

	public static void main3(String[] args) {
		AccountType2[] arr = AccountType2.values();
		for (AccountType2 accountType : arr)
			System.out.println(accountType + " - " + accountType.getRoi());
	}

	public static void main2(String[] args) {
		AccountType[] arr = AccountType.values();
		for (AccountType accountType : arr)
			System.out.println(accountType.ordinal() + ". " + accountType.name() + " - " + accountType.getRoi());
	}

	public static void main1(String[] args) {
		ArithmeticOperations[] arr = ArithmeticOperations.values();
		for (ArithmeticOperations element : arr)
			// System.out.println(element.name() + " - " + element.ordinal());
			System.out.println(element.ordinal() + ". " + element.name());
	}

	public static void main(String[] args) {
		ArithmeticOperations a1 = ArithmeticOperations.SUB;
		System.out.println("name = " + a1.name());
		System.out.println("ordinal = " + a1.ordinal());
	}

}
