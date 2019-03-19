package training;

import java.util.Scanner;

public class TestTR11 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		System.out.println("Numarul " + n + " este par?");
		System.out.println(isEven(n));

		scanner.close();
	}

	public static boolean isEven(int n) {
		return n % 2 == 1 ? false : true;
	}
}
