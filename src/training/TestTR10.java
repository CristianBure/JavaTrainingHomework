package training;

public class TestTR10 {
	public static void main(String[] args) {
		int[] array1 = { 0, 2, 4, 6 };
		int[] array2 = {};
		int[] array3 = { 0, 1, 2, 3 };
		int[] array4 = { 1, 3, 4, 7 };

		System.out.println("media este: " + marginsAverage(array1));
		System.out.println("media este: " + marginsAverage(array2));
		System.out.println("media este: " + marginsAverage(array3));
		System.out.println("media este: " + marginsAverage(array4));
	}

	public static int marginsAverage(int[] arr) {
		return arr.length == 0 ? -1 : (arr[0] + arr[arr.length - 1] / 2);
	}
}
