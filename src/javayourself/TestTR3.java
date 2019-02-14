package javayourself;

import java.util.Scanner;

public class TestTR3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduceti numarul:");

		int numar = scanner.nextInt();
		System.out.println((int) (Math.pow(numar, 2)) + "\n" + (int) Math.pow(numar, 3));

		scanner.close();
	}
}
