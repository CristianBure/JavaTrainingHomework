package sessions.sessions2;

public class LiteralsThing {
	public static void main(String[] args) {
		int a = 100;
		a = 0xFFFF;
		a = 0b01110110;

		long l = 10000000000L; // L mare ala e long! se vede ca LONG

		double dbl = 3.14D;
		float flt = 3.14F; // F sa vada ca float

		System.out.println(a);
		System.out.println(l);
		System.out.println(dbl);
		System.out.println(flt);
		System.out.println("\u0035");
		// String s = null;
		// System.out.println(s.length()); // err apelez ceva null deci nu mere
	}
}
