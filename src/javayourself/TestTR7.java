package javayourself;

import java.util.Scanner;

public class TestTR7 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Temperatura in Fahrenheit pe termometru: ");
		double grade_Fahrenheit = scanner.nextDouble();

		System.out.println("Temperatura transformata in Celcius este: " + fahrenheitToCelsius(grade_Fahrenheit));

		scanner.close();
	}

	public static double fahrenheitToCelsius(double temperature) {
		return (temperature - 32.0) * (5.0 / 9.0);

	}

}
