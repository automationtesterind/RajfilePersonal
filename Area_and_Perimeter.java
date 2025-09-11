package basic.Programs.java;

import java.util.Scanner;

public class Area_and_Perimeter {
	public static void main(String[] args) {

		Scanner scanners = new Scanner(System.in);
		// Area of Square
		System.out.println("Find Area of Square");
		int a = scanners.nextInt();
		int area = a * a;
		System.out.println("Area of Square:" + area);

		// Area of Triangle
		System.out.println("Find Area of Triangle");
		int breadth = scanners.nextInt();
		int lenght = scanners.nextInt();
		double triangle = 0.5 * lenght * breadth;
		System.out.println("Area of Triangle:" + triangle);

		// Area of Circle
		System.out.println("Find Area of Circle");
		int radius = scanners.nextInt();
		double are = Math.PI * (radius * radius);
		System.out.println("Area of Circle:" + are);
		// -----------------------------------------------------------------------
		// Perimeter of Square
		System.out.println("Find Perimeter of Square");
		int a1 = scanners.nextInt();
		int Ps = 4 * a1;
		System.out.println("Perimeter of Square:" + Ps);

		// Perimeter of Triangle
		System.out.println("Find Perimeter of Triangle");
		int side = scanners.nextInt();
		double Pt = side + side + side;
		System.out.println("Perimeter of Triangle:" + Pt);

		// Perimeter of Circle
		System.out.println("Find Perimeter of Circle");
		int radius1 = scanners.nextInt();
		double Pc = 2 * Math.PI * radius1;
		System.out.println("Perimeter of Circle:" + Pc);
		scanners.close();
	}
}
