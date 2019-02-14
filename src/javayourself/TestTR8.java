package javayourself;

import java.util.Scanner;

public class TestTR8 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Introdu primul termen: ");
		double termen1 = scanner.nextDouble();

		System.out.print("Introdu al 2-lea termen: ");
		double termen2 = scanner.nextDouble();

		System.out.println("Rezultatul impartirii este: " + divide(termen1, termen2));
		scanner.close();
	}

	public static double divide(double a, double b) {
		return ((b != 0) ? (a / b) : Double.MAX_VALUE);

	}
}
