package training;

public class TestTR8 {
	public static void main(String[] args) {

		System.out.println(divide(5, 0));
	}

	public static double divide(double a, double b) {
		return (b != 0) ? (a / b) : Double.MAX_VALUE;
	}
}
