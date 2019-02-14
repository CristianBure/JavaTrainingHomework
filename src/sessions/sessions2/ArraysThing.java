package sessions.sessions2;

import java.util.Arrays;

public class ArraysThing {
	public static void main(String[] args) {
		// int[] arr;
		// arr = new int[5]; //de preferat se scrie intr-una
		int[] arr = new int[5];
		arr[2] = 7;
		arr[4] = 7;
		// arr[5] = 7; //GRESIT ca sunt out of bounds! Array index!
		// arr = null;
		System.out.println(arr.length); // lungimea array-ului! nu poate fi redimensionat!
		System.out.println(arr[0]);
		int n = arr[1]; // declar var
		System.out.println(n);

		System.out.println(Arrays.toString(arr)); // printez array-ul
		int[] arr2 = { 1, 2, 3, 4, 5 }; // se prinde singur cate elemente are deci nu declari tu
		System.out.println(Arrays.toString(arr2));

		int[][] matrix = { //
				{ 1, 2, 3 }, //
				{ 4, 5, 6 }, //
				{ 7, 8, 9 } // pot pune oricate elemente aici
		};
		System.out.println(matrix[1][0]);
		System.out.println(matrix[2][1]);
		System.out.println(matrix[2][2]);// afiseaza de unde ii cer eu elementul
	}
}
