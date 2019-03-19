package training;

public class TestEA4 {
	public static void main(String[] args) {
		System.out.println(cmmmc(767, 456));
	}

	public static int cmmmc(int a, int b) {
		int numar = 1;
		while (true) {
			numar++;
			if (numar % a == 0 && numar % b == 0) {
				return numar;
			}
		}
	}
}
