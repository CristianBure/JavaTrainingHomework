package javayourself;

import java.util.Scanner;

public class TestTR4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduceti suma EUR:");
		int suma_euro = scanner.nextInt();

		System.out.println("Introduceti cursul valutar:");
		double curs_valutar = scanner.nextDouble();

		System.out.printf("Suma in RON: %.2f", suma_euro * curs_valutar);

		scanner.close();
	}
}