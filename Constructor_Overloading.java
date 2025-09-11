package basic.Programs.java;

public class Constructor_Overloading {

	Constructor_Overloading() // 1
	{
		System.out.println("Method 01");
	}

	Constructor_Overloading(int a) // 2
	{
		System.out.println("Method 02");
	}

	Constructor_Overloading(String a) // 3
	{
		System.out.println("Method 03");
	}

	public static void main(String[] args) // MAIN
	{
		Constructor_Overloading con = new Constructor_Overloading("Sanjay");
		Constructor_Overloading con1 = new Constructor_Overloading();
	}
}
