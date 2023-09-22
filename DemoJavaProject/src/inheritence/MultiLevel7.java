package inheritence;

class a7 {
	String names;
	int rollno;
	int mobilenum;
	String fathername;

	a7(String name, int r,String f) {
		names = name;
		rollno = r;
		fathername=f;

		System.out.println("Super Class name : " + names);
		System.out.println("Roll no : " + rollno);
		System.out.println("Father Name : " + fathername);

	}

	a7(int cc) {
		mobilenum = cc;
		System.out.println("Super Class College Code : " + mobilenum);
	}
}

class a72 extends a7 {
	String names;
	int rollno;
	int mobilenum;
	String fathername;


	a72(String name, int r,String f) {
		super(name, r,f);
		names = name;
		rollno = r;
		fathername=f;
		
		System.out.println("Child Class 1 name : " + names);
		System.out.println("Roll no : " + rollno);
		System.out.println("Father Name : " + fathername);
	}

	a72(int cc) {
		super(cc);
		mobilenum = cc;
		System.out.println("Child class 1 College Code : " + mobilenum);
	}
}

class a73 extends a72 {
	String names = "";
	int rollno;
	int mobilenum;
	String fathername;

	a73(String name, int r,String f) {
		super(name, r,f);
		names = name;
		rollno = r;
		fathername=f;
		
		System.out.println("Child Class 2 name : " + names);
		System.out.println("Roll no : " + rollno);
		System.out.println("Father Name : " + fathername);
	}

	a73(int cc)
	{
		super(cc);
		mobilenum = cc;
		System.out.println("Child Class 2 College Code : " +mobilenum);
	}
}

public class MultiLevel7 {

	public static void main(String[] args) {
		a73 obj = new a73("Bhimanagouda Patil", 46,"Basavaraj Patil");
		a73 obj2 = new a73(560098);

	}

}
