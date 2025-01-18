import java.util.Scanner;

class Time {
	// fields
	private int hr;
	private int min;

	// methods
	void acceptTime() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the hr - ");
		hr = sc.nextInt();
		System.out.print("Enter the min - ");
		min = sc.nextInt();
	}

	void displayTime() {
		System.out.println("Time = " + hr + " : " + min);
	}
}

public class Program01 {

	public static void main(String[] args) {
		Time t1 = null; // reference
		t1 = new Time();
		t1.acceptTime();
		t1.displayTime();

		Time t2 = new Time();
		Time t3 = new Time();
	}

}
