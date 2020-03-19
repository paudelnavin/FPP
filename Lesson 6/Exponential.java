package prog6_1;

import java.util.Scanner;

public class Exponential {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the valu of base x and power n");
		double x = scanner.nextDouble();
		int n = scanner.nextInt();
		Exponential e = new Exponential();
		System.out.println("Value is : " + e.power(x, n));

	}

	public double power(double x, int n) {

		if (n <1) {
			return 1;
		}
		return x * power(x, n - 1);

	}
}
