package basic.Programs.java;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {

		Scanner name = new Scanner(System.in);
		String palidrome = name.next();
		String out = "";
		name.close();

		for (int i = palidrome.length() - 1; i >= 0; i--) {
			char cha = palidrome.charAt(i);
			out = out + cha;
		}
		System.out.println(out);

		if (palidrome.equalsIgnoreCase(out)) {
			System.out.println("The String is palidrome");
		} else {
			System.out.println("The String is Not palidrome");
		}
	}
}
