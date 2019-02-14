package sessions.sessions2;

public class Variabile {
	int variabilaMembru;
	static int variabilaStatica;
	static final double CONSTANTA_PI = 3.14;

	public static void main(String[] args) {
		int variabilaLocala = 7;
		metoda(5); // la creare nu o gaseste deci eroare
		System.out.println(variabilaLocala);
		System.out.println(variabilaStatica);
		// System.out.println(variabilaMembru);
		// var membru nestatica nu printr-o metoda statica
		// CONSTANTA_PI = 2.14; necompilabil cat timp e final sus

	}

	private static void metoda(int parametru) {
		System.out.println(parametru);
	}
}
