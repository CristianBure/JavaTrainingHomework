package sessions.session03;

public class Person { // pot avea mai multe clase dar PROFI ii sa ai numa una clasa cu nume MARE si
						// cuvinte la fel in titlu
//identificator unic a omului
	private String name; // ideal sa fie PRIVATE si pt exterior, getter si setter
	public String cnp; // poate fi accesat din exterior
	int age; // cat timp clases sunt in package, este accesibila
	String nationality;// proprietatile unei persoane!

	// comportamentul unei persoane!
	// poate fi private!
	// pt metode, incepe cu un verb! ca face ceva!
	public void showInfo() {
		System.out.println("cnp " + ": " + "name");
	}

	public String getName() {
		return name; // primeste
	}

	public void setName(String name) {
		this.name = name; // seteaza
	}

	// method overloading
	public void doSomething() {

	}

	// method overloading
	public void doSomething(int x) {
	}

}
