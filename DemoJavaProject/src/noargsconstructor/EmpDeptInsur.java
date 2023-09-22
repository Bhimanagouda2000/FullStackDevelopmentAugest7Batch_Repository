package noargsconstructor;

class Employee {
	String FirstName;
	int age;
	int id;
	String Worktype;

	Employee() {
		FirstName = "Bhimanagouda.Patil";
		age = 22;
		id = 252525;
		Worktype = "Software Developer";
		System.out.println("FirstName:" + FirstName);
		System.out.println("Age:" + age);
		System.out.println("id:" + id);
		System.out.println("worktype;" + Worktype);
		System.out.println("----------------------");

	}

}

class Department {
	String DepartName;
	int id;
	String Location;
	int Zipcode;

	Department() {
		DepartName = "School";
		id = 1080;
		Location = "Banglore";
		Zipcode = 560098;
		System.out.println("DepartName:" + DepartName);
		System.out.println("id:" + id);
		System.out.println("Location:" + Location);
		System.out.println("Zipcode:" + Zipcode);
		System.out.println("-----------------------");

	}
}

class Insurence {
	String InsurenceName;
	String InsurenceType;
	String CustomerName;
	int id;

	Insurence() {
		InsurenceName = "Bajaji";
		InsurenceType = "Life Insurence";
		CustomerName = "Prajwal";
		id = 9836;
		System.out.println("InsurenceName:" + InsurenceName);
		System.out.println("InsurenceType:" + InsurenceType);
		System.out.println("CustomerName:" + CustomerName);
		System.out.println("id:" + id);

	}
}

public class EmpDeptInsur {

	public static void main(String[] args) {

		Employee raju = new Employee();

		Department School = new Department();

		Insurence Life = new Insurence();

	}
}