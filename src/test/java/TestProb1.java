package test.java;

public class TestProb1 {
	public static void main(String[] args) {
		System.out.println(harmonicAvg(5, 3));

	}

	public static double harmonicAvg(int a, int b) {
		double mh = 0;
		if (a + b == 0) {
			return 0;
		}
		mh = (double) (2 * a * b) / (a + b);
		return mh;
	}
}
