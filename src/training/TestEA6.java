package training;

public class TestEA6 {
	public static void main(String[] args) {
		System.out.print(intToArray(120));
	}

	public static int[] intToArray(int n) {
		String temp = Integer.toString(n);
		int[] sir = new int[temp.length()];
		int limit = temp.length();
		int aux;
		int i = 0;

		while (n != 0) {
			aux = n % 10;
			n = n / 10;

			sir[limit - i - 1] = aux;
			i++;
		}

		return sir;

	}
}
