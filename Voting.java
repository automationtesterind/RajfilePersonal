package basic.Programs.java;

public class Voting {
	public static void main(String[] args) {
		int age = 18;
		String Nation = "Indian";
		String NRI = "Other";
		if (age == 17 && NRI == "Indian") {
			System.out.println("Not Eligible to vote");
		} else if (age >= 18 && Nation == "Indian") {
			System.out.println("Eligible to vote");
		} else {
			System.out.println("Out of Rules");
		}
	}
}
