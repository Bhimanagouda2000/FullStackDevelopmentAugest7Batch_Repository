package inheritence;

class aAA {
	aAA() {
		System.out.println("Super Class");
	}
}

class aBB extends aAA {
	aBB() {
		System.out.println("Child Class 1");
	}
}

class aCC extends aBB {
	aCC() {
		System.out.println("Child Class 2");
	}
}

class aDD extends aAA {
	aDD() {
		System.out.println("Child Class of parent class");
	}
}

public class HybridInheritance {

	public static void main(String[] args) {
		aCC obj = new aCC();
		aDD obj2 = new aDD();

	}

}
