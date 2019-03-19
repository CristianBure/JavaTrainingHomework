package training;

public class TestBA1 {
	public static void main(String[] args) {

		System.out.println(avg(new int[] { 1, 2, 3, 4 }));
	}

	public static double avg(int[] sir) {
		double Suma = 0;
		int i;
		for (i = 0; i < sir.length; i++) {
			Suma = Suma + sir[i];
		}

		return Suma / sir.length;
	}
}
