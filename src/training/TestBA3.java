package training;

public class TestBA3 {
	public static void main(String[] args) {
		System.out.println("Factorialul este:" + factorial(5));
	}

	public static int factorial(int n) {
		int i;
		int factorial = 1;
		for (i = 1; i <= n; i++)
			factorial = factorial * i;

		return factorial;
	}
}
