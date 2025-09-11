package basic.Programs.java;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {

		System.out.println("Please provide the Name to proceed");
		Scanner S = new Scanner(System.in);
		String Name = S.next();
		S.close();
		switch (Name) {
		case "Ram":
			System.out.println("Case 1 Pass");
			int sum = 5 + 3;
			System.out.println("Sum is = " + sum);
			break;

		case "Sam":
			System.out.println("Case 2 Pass");
			break;

		case "Reddy":
			System.out.println("Case 3 Pass");
			break;

		default:
			System.out.println("Not Applicable");
		}
	}
}
