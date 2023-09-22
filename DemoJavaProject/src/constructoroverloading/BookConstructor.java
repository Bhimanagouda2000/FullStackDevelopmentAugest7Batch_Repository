package constructoroverloading;

class books {
	String name;
	int book_code;
	String book_auhtor;

	books(String n, int bc) {
		name = n;
		book_code = bc;
		System.out.println("Book Name : " + name);
		System.out.println("Book code : " + book_code);
	}

	books(String ba) {
		book_auhtor = ba;
		System.out.println("Collge Under University : " + book_auhtor);

	}

	books() {

	}

}

public class BookConstructor {

	public static void main(String[] args) {
		books obj = new books("Java Development", 1002);
		books obj2 = new books("Patil");
	}

}
