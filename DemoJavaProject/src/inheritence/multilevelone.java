package inheritence;

class Hospital1 {
	void HospitalDetails(String name) {
		System.out.println("Hospital name:" + name);
	}
}

class Doctor1 extends Hospital1 {
	Doctor1(String name) {
		super.HospitalDetails(name);

	}

	void HospitalDetails(String name) {
		System.out.println("Doctor name is:" + name);
	}

}

class Customers1 extends Doctor1 {
	Customers1(String name) {
		super(name);
		super.HospitalDetails(name);
	}

	void HospitalDetails(String name) {
		System.out.println("Customers name:" + name);
	}
}

public class multilevelone {

	public static void main(String[] args) {

		Customers1 o1 = new Customers1("Adarsha");
		o1.HospitalDetails("BGS");

	}

}
