package test.java;

public class TestProb2 {
	public static void main(String[] args) {
		int sir[] = { 1, 2, 3, 4, 5 };
		int sir2[] = { 2, 3, 1, 4 };
		int sir3[] = { 0, 0, 1, 2 };
		int sir4[] = { 1, 1 };
		int sir5[] = { 1, 1, 1, 2, 4, 5, 6, 7, 5, 4, 7 };
		int sir6[] = { -1, 0, 2 };
		System.out.println(isSorted(sir));
		System.out.println(isSorted(sir2));
		System.out.println(isSorted(sir3));
		System.out.println(isSorted(sir4));
		System.out.println(isSorted(sir5));
		System.out.println(isSorted(sir6));
	}

	public static boolean isSorted(int[] arr) {
		int aux = arr[0];
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] < aux) {
				return false;
			} else if (arr[i] >= aux) {
				aux = arr[i];
			}

		}
		return true;
	}
}
