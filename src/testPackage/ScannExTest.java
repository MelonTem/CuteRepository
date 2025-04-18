package testPackage;

import java.util.Scanner;

public class ScannExTest {

	public static void main(String[] args) {
		
		Scanner sexc = new Scanner(System.in);
		
		int i = sexc.nextInt();
		
		System.out.print(i + 1);
		
		sexc.close();
	}

}
