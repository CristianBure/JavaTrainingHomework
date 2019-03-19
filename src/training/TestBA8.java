package training;

import java.util.Arrays;

public class TestBA8 {
	public static void main(String[] args) {
		int arr[] = { 1, 4, 3, 2 };
		System.out.println(Arrays.toString(reverse(arr)));
	}

	public static int[] reverse(int[] sir) {
		int[] x = new int[sir.length];
		int i;
		for (i = 0; i < sir.length; i++) {
			x[x.length - 1 - i] = sir[i];

		}
		return x;
	}
}
