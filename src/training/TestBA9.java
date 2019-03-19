package training;

public class TestBA9 {

	public static void main(String[] args) {
		int matrice[][] = { { 1, 4 }, { 3, 2 } };
		System.out.println(getDiagonalSum(matrice));
	}

	public static int getDiagonalSum(int[][] matrix) {
		int suma = 0;
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix.length; j++) {
				if (i == j) {
					suma += matrix[i][j];
				}
			}
		return suma;
	}
}
