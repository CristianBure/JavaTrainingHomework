package training;

public class TestEA5 {
	public static void main(String[] args) {
		System.out.println(cmmdc(7, 63));
	}

	public static int cmmdc(int a, int b) {
		int numar = 2;
		if (a == 1 || b == 1) {
			return 1;
		}
		while (true) {
			if (a % numar == 0 && b % numar == 0) {
				return numar;
			}
			numar++;
		}
	}
}
