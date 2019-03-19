package training;

import java.util.Scanner;

public class TestTR9 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numar_1 = scanner.nextInt();
		int numar_2 = scanner.nextInt();
		int numar_3 = scanner.nextInt();
		System.out.println("Numarul 1 este: " + numar_1);
		System.out.println("Numarul 2 este: " + numar_2);
		System.out.println("Numarul 3 este: " + numar_3);
		System.out.println(inPitagoraRelation(numar_1, numar_2, numar_3));
		scanner.close();
	}

	public static boolean inPitagoraRelation(int a, int b, int c) {
		return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) && (a + b + c) % 10 == 0 ? true : false;

	}
}
