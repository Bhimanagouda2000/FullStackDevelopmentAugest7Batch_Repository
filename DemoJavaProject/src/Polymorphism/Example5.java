package Polymorphism;

abstract class result {
	abstract void res(int a, int b);
}

class add extends result {
	void res(int a, int b) {
		System.out.println("Addition : " + (a + b));
	}
}

class mul extends result {
	void res(int a, int b) {
		System.out.println("Multiplication : " + (a * b));
	}
}

class min extends result {
	void res(int a, int b) {
		System.out.println("Minus : " + (a - b));
	}
}

class div extends result {
	void res(int a, int b) {
		System.out.println("Division : " + (a / b));
	}
}

public class Example5 {

	public static void main(String[] args) {
		result r = null;

		add a = new add();
		mul m = new mul();
		min o = new min();
		div d = new div();

		r = a;
		r.res(10, 5);

		r = m;
		r.res(12, 2);

		r = o;
		r.res(50, 20);

		r = d;
		r.res(100, 50);
	}
}
