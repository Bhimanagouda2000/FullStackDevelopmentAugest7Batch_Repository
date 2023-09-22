package Polymorphism;

abstract class Weather {
	abstract void seasons();
}

class summer extends Weather {
	void seasons() {
		String Name = "Summer";
		System.out.println("Season name: " + Name);
		System.out.println("Months: April, May, June");
		System.out.println();
	}
}

class Winter extends Weather {
	void seasons() {
		String Name = "Winter";
		System.out.println("Season name: " + Name);
		System.out.println("Months: December, January, February");
		System.out.println();
	}
}

class Spring extends Weather {
	void seasons() {
		String Name = "Spring";
		System.out.println("Season name: " + Name);
		System.out.println("Months: March, April, May");
		System.out.println();
	}
}

class rainy extends Weather {
	void seasons() {
		String Name = "rainy";
		System.out.println("Season name: " + Name);
		System.out.println("Months: June, July, AugustMonths: June, July, August");
		System.out.println();
	}
}

class moonsoon extends Weather {
	void seasons() {
		String Name = "moonsoon";
		System.out.println("Season name: " + Name);
		System.out.println("Months: June, July, AugustMonths: June, July, August,September");
		System.out.println();
	}
}

public class Example4 {
	public static void main(String[] args) {
		Weather r = null;

		summer a = new summer();
		Winter m = new Winter();
		Spring o = new Spring();
		rainy r1 = new rainy();
		moonsoon mon = new moonsoon();

		r = a;
		r.seasons();

		r = m;
		r.seasons();

		r = o;
		r.seasons();

		r = r1;
		r.seasons();

		r = mon;
		r.seasons();
	}
}
