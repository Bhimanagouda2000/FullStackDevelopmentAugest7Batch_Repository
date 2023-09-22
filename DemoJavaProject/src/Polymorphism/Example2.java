package Polymorphism;

abstract class clothes {
	abstract void Varityofclothes();
}

class men extends clothes {
	public void Varityofclothes() {
		System.out.println("The Man has mood to wear : Suit");
	}
}

class women extends clothes {
	public void Varityofclothes() {
		System.out.println("The Girl has mood to wear : Saare");
	}
}

class children extends clothes {
	public void Varityofclothes() {
		System.out.println("The Childers has mood to wear : sweaters");
	}
}

public class Example2 {

	public static void main(String[] args) {

		clothes clo = null;

		men o1 = new men();
		women o2 = new women();
		children o3 = new children();

		clo = o1;
		clo.Varityofclothes();

		clo = o2;
		clo.Varityofclothes();

		clo = o3;
		clo.Varityofclothes();

	}

}
