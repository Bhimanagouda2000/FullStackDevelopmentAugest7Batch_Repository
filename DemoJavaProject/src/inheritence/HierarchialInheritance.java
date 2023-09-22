package inheritence;

class a11 {
	a11() {
		System.out.println("Super Class");
	}
}

class a21 extends a11 {
	a21() {
		System.out.println("Child Class : First");
	}
}

class a3 extends a21 {
	a3() {
		System.out.println("Child Class : Second");
	}
}

class a4 extends a21 {
	a4() {
		System.out.println("Child Class : Third");
	}
}

class a5 extends a21 {
	a5() {
		System.out.println("Child Class : Fourth");
	}
}

class a6 extends a21 {
	a6() {
		System.out.println("Child Class : Fifth");
	}
}

public class HierarchialInheritance {

	public static void main(String[] args) {
		a21 o = new a21();
		a3 o1 = new a3();
		a4 o2 = new a4();
		a5 o3 = new a5();
		a6 o4 = new a6();

	}
}
