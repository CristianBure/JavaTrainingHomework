package training;

public class TestBA6 {
	public static void main(String[] args) {
		int sir_nr_int[] = { 11, 7, 9 };
		System.out.println(arrayToNumber(sir_nr_int));
	}

	public static int arrayToNumber(int[] sir) {
		int numar = 0;
		int i;
		if (sir.length == 0) {
			return -1;
		}

		for (i = 0; i < sir.length; i++) {
			if (sir[i] > 9) {
				return -2;
			}
			numar = numar * 10;
			numar = numar + sir[i];

		}

		return numar;
	}
}
