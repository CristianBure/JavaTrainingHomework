package training;

public class TestEA1 {
	public static void main(String[] args) {
		int number = 123;
		System.out.println(reverse(number));
	}

	public static int reverse(int n) {
		int numar_invers = 0;
		int aux = 0;
		while (n != 0) {
			aux = n % 10;
			numar_invers = numar_invers * 10 + aux;
			n = n / 10;
		}
		return numar_invers;
	}
}
