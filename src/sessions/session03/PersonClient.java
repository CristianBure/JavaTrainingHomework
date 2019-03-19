package sessions.session03;

public class PersonClient {
	public static void main(String[] args) {
		// ASA NU
		Person person;// declar variabila cu nume person, ce referentiaza un obiect de tip person
		// variabile
		person = new Person(); // new -> creez obiecte doar cu el!
		Person p1 = new Person();
		p1.cnp = "123"; // new String ("123) tine ca string in general ceea ce nu e cantitate
		p1.age = 8;

		person.setName("Ion!");

		p1 = person; // pointeaza la memoria de la person
		p1.setName("Gheo"); // person name pointeaza acuma nu la ION ci la GHEO
		System.out.println(person.getName()); // afiseaza GHEO

		p1.showInfo();
		p1.doSomething();
		p1.doSomething(1);
	}
}
