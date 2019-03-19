package test.java;

public class TestProb3 {
	public static void main(String[] args) {
		int sir[] = { 1, 3, 2, 6, 4, 5, 8, 6, 7, 2, 2, 9 };
		System.out.println(next(sir, 2));

	}

	public static int next(int[] arr, int n) {
		int numarCautat = n;
		int aux;
		for (int i = 0; i < arr.length - 1; i++) {
			aux = arr[i];
			if (aux == numarCautat) {
				return arr[i + 1];
			} else if (numarCautat == arr[arr.length - 1]) {
				return -1;
			}

		}
		return -2;
	}
}
