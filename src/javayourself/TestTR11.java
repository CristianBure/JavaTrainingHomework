package javayourself;

public class TestTR11 {
	public static void main(String[] args) {

		System.out.println(isEven(31));
		System.out.println(isEven(20));
		System.out.println(isEven(0));
		System.out.println(isEven(1));
		System.out.println(isEven(-2));

	}

	public static boolean isEven(int n) {
		return n % 2 == 0;
	}
}
