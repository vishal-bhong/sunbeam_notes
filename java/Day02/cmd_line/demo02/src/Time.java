package p1;

import java.util.Scanner;

public class Time {
    private int hr;
    private int min;

    // methods
    public void acceptTime() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the hr - ");
        hr = sc.nextInt();
        System.out.print("Enter the min - ");
        min = sc.nextInt();
    }

    public void displayTime() {
        System.out.println("Time = " + hr + " : " + min);
    }
}
