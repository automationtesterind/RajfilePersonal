package basic.Programs.java;

public class Static_NonStatic_Constructors {
//STATIC
	static void add(int a, int b) {
		System.out.println(a + b);
	}

	static void sub(int a, int b) {
		System.out.println(a + b);
	}

// NOT STATIC
	void add(double a, double b) {
		System.out.println(a + b);
	}

	void sub(double a, double b) {
		System.out.println(a + b);
	}

//CONSTRUCTOR
	Static_NonStatic_Constructors(double x, double y) {
		System.out.println(x * y);
	}

	Static_NonStatic_Constructors(int x, double y) {
		System.out.println(x * y);
	}

	public static void main(String[] args) {

		Static_NonStatic_Constructors cat = new Static_NonStatic_Constructors(4.867, 758.47833);
		cat.add(6.4322, 9.123213);
		add(5, 9);
		Static_NonStatic_Constructors cat01 = new Static_NonStatic_Constructors(45, 98.3432323);
		cat01.sub(232.312213, 32.3322);
		sub(3, 9);
	}
}
