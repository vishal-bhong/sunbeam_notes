package com.sunbeam.p1;

public class Program01 {

	public void method1() {
		int num1 = 100;

		class Local {
			int n1 = 10;
			// static int n2; // NOT OK

			void m1() {
				System.out.println(n1);

				// OK only if the variable is final or effectively final
				System.out.println(num1);
			}

			// NOT OK
//			static void m2() {}
		}
		Local l1 = new Local();
	}

	public static void main(String[] args) {
		int num1 = 100;

		class Local {
			int n1 = 10;
			// static int n2; // NOT OK

			void m1() {
				System.out.println(n1);

				// OK only if the variable is final or effectively final
				System.out.println(num1);
			}

			// NOT OK
			// static void m2() {}
		}

		Local l1 = new Local();
	}

}
