package basic.Programs.java;

public class Method_Oveloading {
	static void name(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

	static void name(int x) {
		System.out.println(x);
	}

	static void name(int a, long b) {
		long y = a + b;
		System.out.println(y);
	}

	void name1(int m) {
		double P = m;
		System.out.println(P);
	}

	void name1(int m, long x) {
		long P = m + x;
		System.out.println("sum-- >" + P);
	}

	void name1(int m, Double n) {
		double P = m + n;
		System.out.println(P);
	}

	public static void main(String[] args) {
		name(4, 7);
		name(9, 78655);
		name(7667);
		Method_Oveloading nm = new Method_Oveloading();
		nm.name1(8, 1);
	}
}
