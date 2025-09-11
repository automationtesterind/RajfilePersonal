package basic.Programs.java;

public class logical_operators {

	public static void main(String[] args) {
		// Variables
		int a = 10;
		int b = 20;
		int c = 30;

		if (a > b && b < c) {
			System.out.println("Conditions are 001");
		}

		if (a > b || b < c) {
			System.out.println("Condition is 002");
		}
		if (!(a == 5)) {
			System.out.println("Condition is 003");
		}
	}
}
