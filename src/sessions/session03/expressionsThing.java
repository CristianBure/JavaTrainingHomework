package sessions.session03;

public class expressionsThing {
	public static void main(String[] args) {
		int n = 5;
		boolean expression = (n == 5 && methodCall(n));
		n++;
		// dublu click pe acolade
		if (expression == false) {
			int x = 7;// declara cel mai aproape de block-ul unde folosim
			System.out.println("in");
			System.out.println(x);
		}
		methodCall(3);
		int x = (5 + 4) * 3;
		System.out.println(x);
	}

	private static boolean methodCall(int n) {
		return n > 6;
	}
}
//statement expresie