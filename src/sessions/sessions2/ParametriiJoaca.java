package sessions.sessions2;

public class ParametriiJoaca {
	public static void main(String[] args) {
		byte b = 100;
		System.out.println(b);
		byte b2 = (byte) 200; // ori pun int, ori fac CAST pun byte ala in paranteza si fortez sa considere
								// byte dar da valori aiurea
		int n = (int) 13.7; // 13.7 literal (valorile din cod)
		System.out.println(b2);
		System.out.println(n);

		char ch = 'A';
		ch++;
		System.out.println(ch);
		int n2 = ch;
		System.out.println(n2);

		char ch2 = '\'';
		System.out.println(ch2);
		System.out.println("\n\r");
		char ch3 = '\\';
		System.out.println(ch3);

		boolean bool = true;
		boolean bool2 = false;
		System.out.println(bool);
		System.out.println(bool2);
	}
}
