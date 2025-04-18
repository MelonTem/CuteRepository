package testPackage;

import java.util.Scanner;

public class ScannExTest {

	public static void main(String[] args) {
		
		Scanner sexc = new Scanner(System.in);
		
		int i = sexc.nextInt();
		
		System.out.print("당신이 입력해주신 숫자입니다: " + i);
		
		sexc.close();
	}

}
