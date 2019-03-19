package training;

public class TestEA3 {
	public static void main(String[] args) {
		System.out.println(isPrime(0));
	}

	public static boolean isPrime(int n) {

		int x = 1;
		int counter = 0;
		int i;
		if (n == 1 || n == 0) {
			return false;
		}
		for (i = 0; i <= n; i++) {
			if (n % x == 0) {

				counter++;
			}
			x++;
			if (counter > 2) {
				return false;
			}
		}

		return true;
	}
}
