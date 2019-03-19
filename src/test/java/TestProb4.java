package test.java;

public class TestProb4 {
	private static final String String = null;

	public static void main(String[] args) {
		String litere = new String("abc");
		int n = 1;
		combinations(litere, n);

	}

	public static void combinations(String s, int n) {

		char[] sirLitere = s.toCharArray();
		char[] aux = null;// alt array de charuri pt a face combinatiile

		for (int i = 0; i < sirLitere.length; i++) {
			aux[i] = sirLitere[i];
		}
		for (int j = 0; j < n; j++)
			for (int k = 0; k < n; k++) {

			}
		for (int x = 0; x < n; x++) {
			combinations(s, n); // recursiv de n ori
		}
		int i = 0;
		int j = 0;
		System.out.println("" + sirLitere[i] + aux[j]);

	}
}
