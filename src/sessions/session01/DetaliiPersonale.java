package sessions.session01;

import java.util.Scanner;

public class DetaliiPersonale {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// STRING pentru programul cu "DETALII PERSONALE"
		// Testam daca merge un println inainte de introducere nume, ca sa
		// vad ce introduc
		System.out.println("Introdu numele: "); // MERGE ASA ca sa inteleg ce introduc
		String spatiu_nume = scanner.nextLine();

		System.out.println("Introdu prenumele: ");
		String spatiu_prenume = scanner.nextLine();

		System.out.println("Introdu sexul: ");
		String spatiu_sex = scanner.nextLine();

		System.out.println("Introdu orasul: ");
		String spatiu_oras = scanner.nextLine();

		// INT pentru programul cu "DETALII PERSONALE"
		System.out.println("Introdu ziua nasterii: ");
		int spatiu_zi_nastere = scanner.nextInt();

		System.out.println("Introdu ziua nasterii: ");
		int spatiu_luna_nastere = scanner.nextInt();

		System.out.println("Introdu ziua nasterii: ");
		int spatiu_an_nastere = scanner.nextInt();

		// IMPORTANT E CA SE IAU IN ORDINEA DECLARARII!!!!

		// OUTPUT pentru programul "DETALII PERSONALE"
		System.out.println("Numele meu este: " + spatiu_nume + "\n" + "Prenumele meu este: " + spatiu_prenume + "\n"
				+ "Sexul meu este: " + spatiu_sex + "\n" + "M-am nascut in data de: " + spatiu_zi_nastere + "/"
				+ spatiu_luna_nastere + "/" + spatiu_an_nastere + "\n" + "Locuiesc in orasul: " + spatiu_oras);

		scanner.close();
	}
}
