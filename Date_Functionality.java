package basic.Programs.java;

import java.util.Date;

public class Date_Functionality {

	public static void main(String[] args) {
		Date da = new Date();
		System.out.println(da);
		String da1 = da.toString();
		System.out.println(da1);

		String day = da1.substring(0, 3);
		String month = da1.substring(4, 8);
		String date = da1.substring(8, 10);
		String hour = da1.substring(11, 13);
		String min = da1.substring(14, 16);
		String sec = da1.substring(17, 19);
		String year = da1.substring(da1.length() - 4);
		// System.out.println(hour);
		String NewDate = date + " " + month + "" + year + " " + "Seconds is " + sec;
		System.out.println(NewDate);
	}
}
