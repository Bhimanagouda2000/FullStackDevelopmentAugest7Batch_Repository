package inheritence;

class hospital {
	hospital() {
		System.out.println("Parent Class");
	}
}

class doctor extends hospital {
	doctor() {
		System.out.println("Child Class");
	}
}

public class SimpleInheritance {

	public static void main(String[] args) {
		doctor o = new doctor();
	}
}
