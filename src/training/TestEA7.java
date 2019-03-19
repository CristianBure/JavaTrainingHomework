package training;

public class TestEA7 {
	public static void main(String[] args) {
		int string[] = { 6, 8, 2, 1, 4, 9 };
		System.out.println(nthSmallest(string, 3));
	}

	public static int nthSmallest(int[] sir, int n) {
		int aux_i;
		int aux_j = 0;
		int counter;
		int i;
		int j;

		for (i = 0; i < sir.length; i++) {
			aux_i = sir[i];
			for (j = 1; j < sir.length; j++) {
				if (aux_i > sir[j]) {

				}
			}

		}
		return aux_j;
	}
}
