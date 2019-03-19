package training;

import java.util.Scanner;

public class TestTR5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int ron = scanner.nextInt();
		double curs_v = scanner.nextDouble();

		System.out.println("Suma in lei: " + ron);
		System.out.println("Curs valutar: " + curs_v);
		System.out.println("Suma in EUR: " + (int) (ron / curs_v));
		System.out.println("Suma in RON: " + (int) (ron % curs_v));

		scanner.close();

	}
}
