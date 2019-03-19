package training;

public class TestTR7 {
	public static void main(String[] args) {
		System.out.println(fahrenheitToCelsius(100));
		System.out.println(fahrenheitToCelsius(0));
		System.out.println(fahrenheitToCelsius(50));
	}

	public static double fahrenheitToCelsius(double temperature) {
		return (temperature - 32) * 5 / 9;
	}
}
