package training;

public class TestBA4 {
	public static void main(String[] args) {
		int sir_nr_int[] = { 1, 5, 2, 8, 4, 9 };
		System.out.println(max(sir_nr_int));
	}

	public static int max(int[] sir) {
		int max = 0;
		int i;
		for (i = 0; i < sir.length; i++) {
			if (sir[i] > max) {
				max = sir[i];
			}
		}
		return max;
	}
}
