package classes;

class Employee {
	String FirstName;
	int age;
	int id;
	String Worktype;
}

class Department {
	String DepartName;
	int id;
	String Location;
	int Zipcode;
}

class Insurence {
	String InsurenceName;
	String InsurenceType;
	String CustomerName;
	int id;
}

public class EmpDeptInsur {

	public static void main(String[] args) {

		Employee raju = new Employee();
		raju.FirstName = "Bhimanagouda.Patil";
		raju.age = 22;
		raju.id = 252525;
		raju.Worktype = "Software Developer";
		System.out.println("FirstName:" + raju.FirstName);
		System.out.println("Age:" + raju.age);
		System.out.println("id:" + raju.id);
		System.out.println("worktype;" + raju.Worktype);
		System.out.println("----------------------");

		Department School = new Department();
		School.DepartName = "School";
		School.id = 1080;
		School.Location = "Banglore";
		School.Zipcode = 560098;
		System.out.println("DepartName:" + School.DepartName);
		System.out.println("id:" + School.id);
		System.out.println("Location:" + School.Location);
		System.out.println("Zipcode:" + School.Zipcode);
		System.out.println("-----------------------");

		Insurence Life = new Insurence();
		Life.InsurenceName = "Bajaji";
		Life.InsurenceType = "Life Insurence";
		Life.CustomerName = "Prajwal";
		Life.id = 9836;
		System.out.println("InsurenceName:" + Life.InsurenceName);
		System.out.println("InsurenceType:" + Life.InsurenceType);
		System.out.println("CustomerName:" + Life.CustomerName);
		System.out.println("id:" + Life.id);
	}
}