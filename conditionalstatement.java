package basic.Programs.java;

public class conditionalstatement {
	public static void main(String[] args) {

		int a = 50;
		int b = 20;
		int c = 25;

		// IF*******************
		/*
		 * if (a>b) { System.out.println("a>b"); } if (c==25) { System.out.println("c");
		 * }
		 */

		// IF ELSE IF***************
		/*
		 * if (a==55) { System.out.println("if"); } else if (b==80) {
		 * System.out.println("else if"); } else { System.out.println("else"); }
		 */
		// NESTED IF ELSE***************

		if (a == 51) {
			if (b == 26) {
				System.out.println("001");
			} else {
				System.out.println("002");
			}
		} else if (a > 40) {
			System.out.println("003");
		} else {
			System.out.println("004");
		}
	}
}
