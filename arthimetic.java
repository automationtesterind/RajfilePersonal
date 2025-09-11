package basic.Programs.java;

public class arthimetic {
	static void add() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
	}

	static void sub() {
		int a = 10;
		int b = 20;
		int c = a - b;
		System.out.println(c);
	}

	static void div() {
		int a = 10;
		int b = 20;
		int c = b / a;
		System.out.println(c);
	}

	static void mod() {
		int a = 10;
		int b = 21;
		int c = b % a;
		System.out.println(c);
	}

	public static void main(String[] args) {

		add();
		sub();
		div();
		mod();
	}

}
