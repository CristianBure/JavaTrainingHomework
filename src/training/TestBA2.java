package training;

public class TestBA2 {
	public static void main(String[] args) {
		int sir[] = { -1, 0, 2, -4, 5 };
		System.out.println("Numerele negative sunt: " + countNegatives(sir));
	}

	public static int countNegatives(int[] sir) {
		int i;
		int nr_neg = 0;
		for (i = 0; i < sir.length; i++) {
			if (sir[i] < 0) {
				nr_neg = nr_neg + 1;
			}
		}
		return nr_neg;
	}
}
