package sessions.sessions2;

public class OperatorsThings {
	public static void main(String[] args) {
		int n = 7;
		n++;
		System.out.println(n); // n normal
		System.out.println(n++);// evalueaza dupa incrementeaza
		System.out.println(++n);// incrementeaza dupa evalueaza
		System.out.println(n);// afisare finala

		n = 0;
		n = n++ + 5; // e 5 ca nu incrementeaza
		System.out.println(n);

		n = -n; // negi

		System.out.println(10 * 3); // inmultire
		System.out.println(10 / 3); // impartire
		System.out.println(10 % 3); // restul impartirii

		System.out.println(10 + 3);
		System.out.println(10 - 3);
		System.out.println(10 + 3 * 5 - 7); // ordinea ca la mate
		System.out.println((10 + 3) * (5 - 7)); // ordinea schimbata de paranteze

		// shiftari impartire/inmultire cu 2
		System.out.println(10 << 2); // 10 shiftat de 2 ori deci inmultit cu 2
		System.out.println(10 >> 2); // 10 shiftat de 2 ori deci impartit cu 2
		System.out.println(10 >>> 2);
		System.out.println(-10 >> 2); // nu shifteaza bitul de semn!
		System.out.println(-10 >>> 2); // shifteaza si bitu de semn!

		int n2 = 7;
		System.out.println(n2 > 10); // face comparatia si da raspuns BOOLEAN FALSE
		System.out.println(n2 < 10); // face comparatia si da raspuns BOOLEAN TRUE
		System.out.println(n2 <= 10); // face comparatia si da raspuns BOOLEAN TRUE

		System.out.println(n2 = 10); // asignare de valoare
		System.out.println(n2 == 10); // returnare de BOOLEAN daca e true sau false
		System.out.println(n2 != 10); // returnare de BOOLEAN face invers cea de sus

		System.out.println(10 & 5); // SI pe biti
		System.out.println(10 | 5); // SAU pe biti
		System.out.println(10 ^ 5); // XOR pe biti

		System.out.println(n2 > 1 & n2 < 10); // SI logic
		System.out.println(n2 > 1 | n2 < 10); // OR logic
		System.out.println(n2 > 1 ^ n2 < 10); // XOR logic

		System.out.println(isNumber(n2) && n2 > 1); // false din metoda inlocuit unde e metoda!
		System.out.println(n2 > 1 && isNumber(n2));
		System.out.println(n2 < 1 && isNumber(n2)); // scurtcircuitare! daca e ceva fals => ca nu mai fac altceva ca e
													// fals deci nu se apeleaza metoda!
		System.out.println(n2 < 1 & isNumber(n2)); // se apeleaza metoda, chiar daca e fals!

		n2 += 1; // echivalent n2++ sau n2 = n2 +1
		n2 += 10; // echivalent cu n2= n2 +10

		n2 = 5;
		System.out.println(n2 > 4 ? "Admis" : "Respins"); // if else ceva de genu. daca e true, e admis, altfel respins
		System.out.println(n2 > 4 ? (n2 > 8 ? "Foarte bine" : "Decent") : "Respins"); // tot se testeaza gen else if!
	}

	private static boolean isNumber(int n2) {
		System.out.println("Am fost aici!");
		return false;
	}

}
