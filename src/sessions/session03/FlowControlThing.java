package sessions.session03;

public class FlowControlThing {
	public static void main(String[] args) {
		int nota = 5;

		// if(1) asa nu
		// {
		//
		// }

// IF
		if (nota >= 8) {
			System.out.println("Excelent");
		} else if (nota >= 5) {
			System.out.println("Admis");
		} else {
			System.out.println("Respins");
		}
//CASE
		nota = 10;
		// double d = 0;// nu pot pune double si nici LONG desi e int! Dar, pot pune
		// string!!!
		switch (nota) {
		case 10: // la string in loc de 10 ii string
			System.out.println("GENIAL!");
			break;

		case 9:
			System.out.println("Foarte bine");
			break;

		case 8:
			System.out.println("bine..");
			break;

		case 7:
			System.out.println("Mda..");
			break;
		}
		/*
		 * //WHILE
		 *
		 * int counter = 1; while (counter < 13) { System.out.println(counter);
		 * counter++;
		 *
		 * //DO WHILE counter = 1; // faci sa vezi daca merita do {
		 * System.out.println(counter); counter++; } while (counter < 13); //importnat
		 * BREAK counter = 1; while (true) { System.out.println(counter); counter++;
		 *
		 * if (counter == 11) { break; } //important COUNTINUE
		 *
		 * counter = 1; while (counter > 20000) { counter++; if (counter % 10000 != 0) {
		 * continue; } System.out.println(counter); }
		 *
		 * } System.out.println(counter); }
		 */
//for cand stii cate iteratii while cand  nu stii
		// evita de a initializa inainte!
		for (int i = 1; i <= 10; i++) {// initializare variabile utilizate, pot avea mai multe, dar nu recomandate
			System.out.println(i);
		}

		System.out.println("-----------------------");
		label: for (int i = 0; i <= 2; i++) {// initializare variabile utilizate, pot avea mai multe, dar nu recomandate
			for (int j = 0; j <= 2; j++) {
				System.out.println("" + i + j);
				if (j == 1) {
					break label;
				}

			}
		}

		metodaMea(); // selectez cod si alt+shift + M?
		// System.out.println((cauta(int[] {6,4,8,5,2,1},5));

	}

	private static void metodaMea() {
		int[] arr = { 5, 7, 4, 7, 8, 3, 9 };
		// asa nu
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			if (arr[i] == 7) {
				return; // te scoate
			}
		}

		// asa da
		for (

		int element : arr) {
			System.out.println(element);

		}
	}

}
