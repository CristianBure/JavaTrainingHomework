package training;

import java.util.Scanner;

public class TestTR3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt();

		System.out.println((int) Math.pow(number, 2) + "\n" + (int) Math.pow(number, 3));
		scanner.close();
	}
}
