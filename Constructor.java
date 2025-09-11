package basic.Programs.java;

public class Constructor {
	public static void main(String[] args) {
		Constructor a = new Constructor(5);
		Constructor b = new Constructor(5, "ram");
		Constructor c = new Constructor('A', 100);
		new Constructor();

	}

	Constructor() {
		System.out.println("Constructor 1");
	}

	Constructor(int a) {
		System.out.println("Constructor 2");
	}

	Constructor(int a, String s) {
		System.out.println("Constructor 3");
	}

	Constructor(char section, int marks) {
		System.out.println("Constructor 4");
	}
}
