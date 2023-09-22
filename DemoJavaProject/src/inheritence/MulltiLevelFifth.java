package inheritence;

class a51 {
	a51(String name) {
		System.out.println("Super Class name : " + name);
	}
}

class a52 extends a51{
	a52(String name) {
		super(name);
		System.out.println("Child Class of parent class");
	}
}

class a53 extends a52 {
	a53(String name) {
		super(name);
		System.out.println("Child Class of child class 1 ");
	}
}
class a54 extends a53 {
	a54(String name) {
		super(name);
		System.out.println("Child Class of child class 2 ");
	}
}
public class MulltiLevelFifth {

	public static void main(String[] args) {
		a54 obj = new a54("Bhimanagouda Patil");
	}

}
