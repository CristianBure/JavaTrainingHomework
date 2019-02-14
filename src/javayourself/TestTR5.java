package javayourself;

import java.util.Scanner;

public class TestTR5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduceti suma RON:");
		int suma_Ron = scanner.nextInt();

		System.out.println("Introduceti cursul valutar:");
		double curs_Valutar = scanner.nextDouble();

		System.out.println("Suma in EUR: " + ((int) (suma_Ron / curs_Valutar)));

		System.out.println("Suma in RON ramasa: " + ((int) (suma_Ron % curs_Valutar)));

		scanner.close();
	}
}
