package basic.Programs.java;

import java.util.Arrays;

public class Basic_Array {

	public static void main(String[] args) {
		String x = "Murthy";

		char x2[] = x.toCharArray();// String to Array
		System.out.println(x2);

		System.out.println(Arrays.toString(x2));// Array to String Array

		System.out.println(String.valueOf(x2));// Array to String
	}
}