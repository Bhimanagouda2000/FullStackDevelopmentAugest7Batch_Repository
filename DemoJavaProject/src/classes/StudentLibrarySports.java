package classes;

class Student {
	String StudentFirstName;
	int age;
	int id;
	String branch;
}

class Library {
	String LibraryType;
	String LibraryName;
	int id;
	String Location;
}

class Sports {
	String SportsName;
	String SportsSponser;
	String PlayerName;
	int Jersyid;
}

public class StudentLibrarySports {

	public static void main(String[] args) {
		Student Guna = new Student();
		Guna.StudentFirstName = "Adarsha";
		Guna.age = 21;
		Guna.id = 9098;
		Guna.branch = "Engineering";
		System.out.println("StudentFirstName:" + Guna.StudentFirstName);
		System.out.println("Age:" + Guna.age);
		System.out.println("id:" + Guna.id);
		System.out.println("branch;" + Guna.branch);
		System.out.println("----------------------");

		Library Lib = new Library();
		Lib.LibraryType = "Government";
		Lib.LibraryName = "Kannada";
		Lib.id = 25256;
		Lib.Location = "Gulbarga";

		System.out.println("LibraryName:" + Lib.LibraryName);
		System.out.println("LibraryType=" + Lib.LibraryType);
		System.out.println("id:" + Lib.id);
		System.out.println("Location:" + Lib.Location);
		System.out.println("-----------------------");

		Sports Sp = new Sports();
		Sp.SportsName = "Cricket";
		Sp.SportsSponser = ("Addidas");
		Sp.PlayerName = "Virat Kolhi";
		Sp.Jersyid = 18;
		System.out.println("SportsName:" + Sp.SportsName);
		System.out.println("SportsSponser:" + Sp.SportsSponser);
		System.out.println("PlayerName:" + Sp.PlayerName);
		System.out.println("Jersyid:" + Sp.Jersyid);

	}

}