package javayourself;

import java.util.Scanner;

public class TestTR9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Primul numar este: ");
		int numar1 = scanner.nextInt();

		System.out.print("Al 2-lea numar este: ");
		int numar2 = scanner.nextInt();

		System.out.print("Al 3-lea numar este: ");
		int numar3 = scanner.nextInt();

		System.out.println(inPitagoraRelation(numar1, numar2, numar3));

		scanner.close();
	}

	public static boolean inPitagoraRelation(int x, int y, int z) {
		return ((Math.pow(x, 2) + (Math.pow(y, 2)) == (Math.pow(z, 2)) ? true : false));
	}
}
