package p1;

public class Test {
	private int n1;
	int n2; // default -> package level private
	protected int n3;
	public int n4;

	void displayTest() {
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
	}

}
