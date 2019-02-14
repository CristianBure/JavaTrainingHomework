package javayourself;

import java.util.Scanner;

public class TestTR10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] array1 = { 0, 2, 4, 6 };
		int[] array2 = { 1, 3, 5, 7 };
		int[] array3 = {};
		int[] array4 = { 1 };
		// int[] array5 = { 0.1, 0.2, 0.3, 0.4 }; cere cast

		System.out.println("Media la primul sir este egala cu: " + marginsAverage(array1));
		System.out.println("Media la al 2-lea sir este egala cu: " + marginsAverage(array2));
		System.out.println("Media la al 3-lea sir este egala cu: " + marginsAverage(array3));
		System.out.println("Media la al 4-lea sir este egala cu: " + marginsAverage(array4));

		scanner.close();
	}

	public static int marginsAverage(int[] arr) {

		return arr.length == 0 ? -1 : (arr[0] + arr[arr.length - 1] / 2);
	}
}