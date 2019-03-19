package training;

public class TestBA5 {
	public static void main(String[] args) {
		int sir_numere[] = { 1, 2, 3, 4, 0 };
		int sir_numere_null[] = {};
		int sir_numere_zero[] = { 0, 0, 0 };
		System.out.println(product(sir_numere));
		System.out.println(product(sir_numere_null));
		System.out.println(product(sir_numere_zero));
	}

	public static int product(int[] sir) {
		int produs = 1;
		int i;
		for (i = 0; i < sir.length; i++) {
			if (sir[i] != 0) {
				produs *= sir[i];
			}

		}
		return produs;
	}
}
