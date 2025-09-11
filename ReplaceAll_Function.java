package basic.Programs.java;
import java.util.Scanner;

public class ReplaceAll_Function {

	public static void main(String[] args)
	{
		System.out.println("Please enter the Name of college to validate");
//		Scanner name = new Scanner(System.in);
//		String collegeName = name.next();
//		name.close();
		String collegeName = "PTR college";
	
		if (collegeName.contains("college")) 
		{
			String replace= collegeName.replaceAll("PTR", "STR");
			System.out.println("The Name is valid");
			System.out.println("New name of the college is : "+replace);
		}
		else 
		{
			System.out.println("The Name is NOT valid");
		}
	}
}

//PTR college