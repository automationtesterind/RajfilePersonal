package basic.Programs.java;

public class Matches {

	public static void main(String[] args) {

		String s = "andhrapradeshtione";
		boolean x13 = s.matches("a(.*)");
		System.out.println("Check if string starts with a\t\t" + x13);

		boolean x14 = s.matches("(.*)e");
		System.out.println("Check if string ends with r\t\t" + x14);

		boolean x15 = s.matches("(.*)tion(.*)");
		System.out.println("Check if string contains with text\t" + x15);

		if (x13 && x14 && x15) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
}
