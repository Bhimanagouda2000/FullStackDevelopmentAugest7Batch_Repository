package inheritence;

class a1A {
	a1A() {
		System.out.println("Super Class");
	}
}

class a2B extends a1A {
	a2B() {
		System.out.println("Child Class of parent class");
	}
}

class a3C extends a2B {
	a3C() {
		System.out.println("Child Class of child class 2 ");
	}
}

class a4D extends a3C {
	a4D() {
		System.out.println("Child Class of child class 3 ");
	}
}

class a5E extends a4D {
	a5E() {
		System.out.println("Child Class of child class 4");
	}
}

public class MultiLevel {

	public static void main(String[] args) {
		a5E obj = new a5E();
	}

}
