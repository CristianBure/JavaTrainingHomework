package training;

public class TestEA2 {
	public static void main(String[] args) {
		int number = 121;
		System.out.println(isPalindrome(number));
	}

	public static boolean isPalindrome(int n) {
		int numar_invers = 0;
		int aux = 0;
		int comparator = n;
		while (n != 0) {
			aux = n % 10;
			numar_invers = numar_invers * 10 + aux;
			n = n / 10;
		}
		if (numar_invers == comparator) {
			return true;
		}
		return false;
	}
}
