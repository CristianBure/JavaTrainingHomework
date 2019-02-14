package sessions.session01;

import java.util.Scanner;

public class selftest2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Daca declar un int inainte? MERGE
		// int varsta_TEST;
		// MERGE

		// merge un nou scanner2?
		// NU!
		// Scanner scanner2 = new Scanner(System.in);
		// aparent NU!

		// int cu scris mic? DA
		// int numar = scanner2.nextInt(); //NU MERGE ASA

		String name = scanner.nextLine(); // PENTRU STRING

		// varsta_TEST = scanner.nextInt(); //MERGE ASA
		int varsta = scanner.nextInt(); // PENTRU INT


		// amandoua deodata print out
		System.out.println("Numele dat este: " + name + "\n" + "Varsta este: " + varsta);

		scanner.close();
		// NU pot avea 2 scanner
		// scanner2.close();
	}

}
