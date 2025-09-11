package basic.Programs.java;

class Super_Calling01 {
	Super_Calling01() {
		System.out.println("Super_Calling01");
	}
}

class Super_Calling02 extends Super_Calling01 {
	Super_Calling02() {
		super();
		System.out.println("Super_Calling02");
	}
}

public class Super_Calling03 extends Super_Calling02 {

	Super_Calling03() {
		System.out.println("Super_Calling03");
	}

	public static void main(String[] args) {
		Super_Calling03 name = new Super_Calling03();
		System.out.println("Exception");
	}
}
