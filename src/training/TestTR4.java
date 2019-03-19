package training;

import java.util.Scanner;

public class TestTR4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int Euro = scanner.nextInt();
		double curs_v = scanner.nextDouble();

		System.out.println("Suma in euro: " + Euro);
		System.out.println("Curs valutar: " + curs_v);

		System.out.printf("Suma in RON: %.2f", Euro * curs_v);

		scanner.close();
	}
}
