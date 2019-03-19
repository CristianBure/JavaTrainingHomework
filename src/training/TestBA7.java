package training;

public class TestBA7 {
	public static void main(String[] args) {
		int arr[] = { 1, 5, 3, 4 };
		System.out.println(find(arr, 9));
	}

	public static int find(int[] sir, int n) {
		int position = -1;
		int i;

		for (i = 0; i < sir.length; i++) {
			if (sir[i] == n) {
				return i;
			}
		}
		return position;
	}
}
