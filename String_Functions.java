package basic.Programs.java;

public class String_Functions {

	public static void main(String[] args) {

		String s = "automation tester";
		String s1 = "2025";
		String s2 = "  hello  ";

		char x1 = s.charAt(5);
		System.out.println("charAt\t\t\t" + x1);

		int x2 = s.length();
		System.out.println("length\t\t\t" + x2);

		String x3 = s.toUpperCase();
		System.out.println("toUpperCase\t\t" + x3);

		String x4 = s + " " + s1;
		System.out.println("Concat\t\t\t" + x4);

		int x5 = s.indexOf('t');
		System.out.println("indexOf\t\t\t" + x5);

		boolean x6 = s.contains("tester");
		System.out.println("contains\t\t" + x6);

		boolean x7 = s.equals(x4);
		System.out.println("equals\t\t\t" + x7);

		boolean x8 = s.equalsIgnoreCase(x3);
		System.out.println("equalsIgnoreCase\t" + x8);

		String x9 = s.substring(6);
		System.out.println("substring\t\t" + x9);

		String x10 = s.substring(11, s.length());
		System.out.println("substring\t\t" + x10);

		String x11 = s.replace('t', 'X');
		System.out.println("replace\t\t\t" + x11);

		String x12 = s.replace("automation", "Manual");
		System.out.println("replace\t\t\t" + x12);

		boolean x13 = s.matches("a(.*)");
		System.out.println("Check if string starts with a'\t\t" + x13);

		boolean x14 = s.matches("(.*)e");
		System.out.println("Check if string ends with r'\t\t" + x14);

		boolean x15 = s.matches("(.*)tion(.*)");
		System.out.println("Check if string contains with text\t" + x15);

		String x16 = s.replaceAll("te", "TE");
		System.out.println("Check if string contains with text\t" + x16);

		String x17 = s.repeat(2);
		System.out.println("repeat\t\t\t" + x17);

		System.out.println("Before trim\t\t" + s2);
		System.out.println("After trim\t\t" + s2.trim());

		System.out.println("isBlank\t\t\t" + s.isBlank());

		System.out.println("isEmpty\t\t\t" + s.isEmpty());// True if Length is 0
	}

}
