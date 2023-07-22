package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		int a = 24;
		int p = 0;

		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				p++;
			}
		}
		if (p == 2) {
			System.out.println(" Number is prime");
		} else {
			System.out.println(" Number is Non prime");
		}
		System.out.println(p);
	}

}
