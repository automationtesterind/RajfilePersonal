package basic.Programs.java;

public class This_Calling01 {

	This_Calling01(int a, int b) {
		System.out.println("This_Calling01--" + (a + b));
	}

	This_Calling01(int x) {
		this(5, 9);
		System.out.println("This_Calling02--" + x);
	}

	This_Calling01(int a, double b) {
		this(6);
		System.out.println("This_Calling03--" + (a + b));
	}

	This_Calling01(double z) {
		System.out.println("This_Calling04--" + z);
	}

	public static void main(String[] args) {
		This_Calling01 name = new This_Calling01(5, 6.8);
	}
}



