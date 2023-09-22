package inheritence;

class a6A {
	String names;
	int rollno;
	int mobilenum;

	a6A(String name, int r, int cc) {
		names = name;
		rollno = r;
		mobilenum = cc;
		System.out.println("Super Class name : " + names);
		System.out.println("Roll no : " + rollno);
		System.out.println("College Code : " + mobilenum);
	}
}

class a62 extends a6A {
	String names;
	int rollno;
	int mobilenum;

	a62(String name, int r, int cc) {
		super(name, r, cc);
		names = name;
		rollno = r;
		mobilenum = cc;
		System.out.println("Child Class 1 name : " + names);
		System.out.println("Roll no : " + rollno);
		System.out.println("College Code : " + mobilenum);
	}
}

class a63 extends a62 {
	String names = "";
	int rollno;
	int mobilenum;

	a63(String name,int r,int cc)
	{
		super(name,r,cc);
		names = name;
		rollno = r;
		mobilenum = cc;
		System.out.println("Child Class 2 name : "+names);
		System.out.println("Roll no : "+rollno);
		System.out.println("College Code : " +mobilenum);
	}
}

public class MultiLevel6 {

	public static void main(String[] args) {
		a63 obj = new a63("Bhimanagouda", 46, 560098);
	}

}
