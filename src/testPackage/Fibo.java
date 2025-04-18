package testPackage;

public class Fibo {
	public static int get(int i) {
		if (i == 0) return 0; 
		if (i == 1) return 1; 
		return Fibo.get(i - 1) + Fibo.get(i - 2);
	}
}
