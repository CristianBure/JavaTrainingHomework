package training;

public class TestBA10 {
	public static void main(String[] args) {
		int matrice[][] = { { 1, 4 }, { 3, 2 } };
		System.out.println(getSecondaryDiagonalSum(matrice));
	}

	public static int getSecondaryDiagonalSum(int[][] matrix) {
		int suma = 0;
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix.length; j++) {
				if (i == matrix.length - j - 1) {
					suma += matrix[i][j];
				}
			}
		return suma;
	}
}
